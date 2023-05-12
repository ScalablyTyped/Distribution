package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationTemplate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:partition:resiliencehub:region:account:app-assessment/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var assessmentArn: Arn
  
  /**
    * The end time for the action.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The format of the recommendation template.  CfnJson  The template is CloudFormation JSON.  CfnYaml  The template is CloudFormation YAML.  
    */
  var format: TemplateFormat
  
  /**
    * The message for the recommendation template.
    */
  var message: js.UndefOr[String500] = js.undefined
  
  /**
    * The name for the recommendation template.
    */
  var name: EntityName
  
  /**
    * Indicates if replacements are needed.
    */
  var needsReplacements: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Identifiers for the recommendations used in the recommendation template.
    */
  var recommendationIds: js.UndefOr[RecommendationIdList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the recommendation template.
    */
  var recommendationTemplateArn: Arn
  
  /**
    * An array of strings that specify the recommendation template type or types.  Alarm  The template is an AlarmRecommendation template.  Sop  The template is a SopRecommendation template.  Test  The template is a TestRecommendation template.  
    */
  var recommendationTypes: RenderRecommendationTypeList
  
  /**
    * The start time for the action.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the action.
    */
  var status: RecommendationTemplateStatus
  
  /**
    * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key/value pair.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The file location of the template.
    */
  var templatesLocation: js.UndefOr[S3Location] = js.undefined
}
object RecommendationTemplate {
  
  inline def apply(
    assessmentArn: Arn,
    format: TemplateFormat,
    name: EntityName,
    recommendationTemplateArn: Arn,
    recommendationTypes: RenderRecommendationTypeList,
    status: RecommendationTemplateStatus
  ): RecommendationTemplate = {
    val __obj = js.Dynamic.literal(assessmentArn = assessmentArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recommendationTemplateArn = recommendationTemplateArn.asInstanceOf[js.Any], recommendationTypes = recommendationTypes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationTemplate] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppArnUndefined: Self = StObject.set(x, "appArn", js.undefined)
    
    inline def setAssessmentArn(value: Arn): Self = StObject.set(x, "assessmentArn", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFormat(value: TemplateFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String500): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNeedsReplacements(value: BooleanOptional): Self = StObject.set(x, "needsReplacements", value.asInstanceOf[js.Any])
    
    inline def setNeedsReplacementsUndefined: Self = StObject.set(x, "needsReplacements", js.undefined)
    
    inline def setRecommendationIds(value: RecommendationIdList): Self = StObject.set(x, "recommendationIds", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdsUndefined: Self = StObject.set(x, "recommendationIds", js.undefined)
    
    inline def setRecommendationIdsVarargs(value: Uuid*): Self = StObject.set(x, "recommendationIds", js.Array(value*))
    
    inline def setRecommendationTemplateArn(value: Arn): Self = StObject.set(x, "recommendationTemplateArn", value.asInstanceOf[js.Any])
    
    inline def setRecommendationTypes(value: RenderRecommendationTypeList): Self = StObject.set(x, "recommendationTypes", value.asInstanceOf[js.Any])
    
    inline def setRecommendationTypesVarargs(value: RenderRecommendationType*): Self = StObject.set(x, "recommendationTypes", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: RecommendationTemplateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplatesLocation(value: S3Location): Self = StObject.set(x, "templatesLocation", value.asInstanceOf[js.Any])
    
    inline def setTemplatesLocationUndefined: Self = StObject.set(x, "templatesLocation", js.undefined)
  }
}
