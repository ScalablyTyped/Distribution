package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureSummary extends StObject {
  
  /**
    * The ARN of the feature.
    */
  var arn: Arn
  
  /**
    * The date and time that the feature is created.
    */
  var createdTime: js.Date
  
  /**
    * The name of the variation that is used as the default variation. The default variation is served to users who are not allocated to any ongoing launches or experiments of this feature.
    */
  var defaultVariation: js.UndefOr[VariationName] = js.undefined
  
  /**
    * An array of structures that define
    */
  var evaluationRules: js.UndefOr[EvaluationRulesList] = js.undefined
  
  /**
    * If this value is ALL_RULES, the traffic allocation specified by any ongoing launches or experiments is being used. If this is DEFAULT_VARIATION, the default variation is being served to all users.
    */
  var evaluationStrategy: FeatureEvaluationStrategy
  
  /**
    * The date and time that the feature was most recently updated.
    */
  var lastUpdatedTime: js.Date
  
  /**
    * The name of the feature.
    */
  var name: FeatureName
  
  /**
    * The name or ARN of the project that contains the feature.
    */
  var project: js.UndefOr[ProjectRef] = js.undefined
  
  /**
    * The current state of the feature.
    */
  var status: FeatureStatus
  
  /**
    * The list of tag keys and values associated with this feature.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object FeatureSummary {
  
  inline def apply(
    arn: Arn,
    createdTime: js.Date,
    evaluationStrategy: FeatureEvaluationStrategy,
    lastUpdatedTime: js.Date,
    name: FeatureName,
    status: FeatureStatus
  ): FeatureSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdTime = createdTime.asInstanceOf[js.Any], evaluationStrategy = evaluationStrategy.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultVariation(value: VariationName): Self = StObject.set(x, "defaultVariation", value.asInstanceOf[js.Any])
    
    inline def setDefaultVariationUndefined: Self = StObject.set(x, "defaultVariation", js.undefined)
    
    inline def setEvaluationRules(value: EvaluationRulesList): Self = StObject.set(x, "evaluationRules", value.asInstanceOf[js.Any])
    
    inline def setEvaluationRulesUndefined: Self = StObject.set(x, "evaluationRules", js.undefined)
    
    inline def setEvaluationRulesVarargs(value: EvaluationRule*): Self = StObject.set(x, "evaluationRules", js.Array(value*))
    
    inline def setEvaluationStrategy(value: FeatureEvaluationStrategy): Self = StObject.set(x, "evaluationStrategy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: FeatureName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
