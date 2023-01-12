package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  /**
    * The ARN of the feature.
    */
  var arn: FeatureArn
  
  /**
    * The date and time that the feature is created.
    */
  var createdTime: js.Date
  
  /**
    * The name of the variation that is used as the default variation. The default variation is served to users who are not allocated to any ongoing launches or experiments of this feature. This variation must also be listed in the variations structure. If you omit defaultVariation, the first variation listed in the variations structure is used as the default variation.
    */
  var defaultVariation: js.UndefOr[VariationName] = js.undefined
  
  /**
    * The description of the feature.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A set of key-value pairs that specify users who should always be served a specific variation of a feature. Each key specifies a user using their user ID, account ID, or some other identifier. The value specifies the name of the variation that the user is to be served. For the override to be successful, the value of the key must match the entityId used in the EvaluateFeature operation.
    */
  var entityOverrides: js.UndefOr[EntityOverrideMap] = js.undefined
  
  /**
    * An array of structures that define the evaluation rules for the feature.
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
  var project: js.UndefOr[ProjectArn] = js.undefined
  
  /**
    * The current state of the feature.
    */
  var status: FeatureStatus
  
  /**
    * The list of tag keys and values associated with this feature.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Defines the type of value used to define the different feature variations. For more information, see Variation types 
    */
  var valueType: VariationValueType
  
  /**
    * An array of structures that contain the configuration of the feature's different variations.
    */
  var variations: VariationsList
}
object Feature {
  
  inline def apply(
    arn: FeatureArn,
    createdTime: js.Date,
    evaluationStrategy: FeatureEvaluationStrategy,
    lastUpdatedTime: js.Date,
    name: FeatureName,
    status: FeatureStatus,
    valueType: VariationValueType,
    variations: VariationsList
  ): Feature = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdTime = createdTime.asInstanceOf[js.Any], evaluationStrategy = evaluationStrategy.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    inline def setArn(value: FeatureArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultVariation(value: VariationName): Self = StObject.set(x, "defaultVariation", value.asInstanceOf[js.Any])
    
    inline def setDefaultVariationUndefined: Self = StObject.set(x, "defaultVariation", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityOverrides(value: EntityOverrideMap): Self = StObject.set(x, "entityOverrides", value.asInstanceOf[js.Any])
    
    inline def setEntityOverridesUndefined: Self = StObject.set(x, "entityOverrides", js.undefined)
    
    inline def setEvaluationRules(value: EvaluationRulesList): Self = StObject.set(x, "evaluationRules", value.asInstanceOf[js.Any])
    
    inline def setEvaluationRulesUndefined: Self = StObject.set(x, "evaluationRules", js.undefined)
    
    inline def setEvaluationRulesVarargs(value: EvaluationRule*): Self = StObject.set(x, "evaluationRules", js.Array(value*))
    
    inline def setEvaluationStrategy(value: FeatureEvaluationStrategy): Self = StObject.set(x, "evaluationStrategy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: FeatureName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectArn): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setValueType(value: VariationValueType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setVariations(value: VariationsList): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    inline def setVariationsVarargs(value: Variation*): Self = StObject.set(x, "variations", js.Array(value*))
  }
}
