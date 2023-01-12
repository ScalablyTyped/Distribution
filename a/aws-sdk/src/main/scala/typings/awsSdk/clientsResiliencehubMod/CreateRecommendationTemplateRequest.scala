package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecommendationTemplateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:partition:resiliencehub:region:account:app-assessment/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var assessmentArn: Arn
  
  /**
    * The name of the Amazon S3 bucket that will contain the recommendation template.
    */
  var bucketName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters. You should not reuse the same client token for other API requests.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The format for the recommendation template.  CfnJson  The template is CloudFormation JSON.  CfnYaml  The template is CloudFormation YAML.  
    */
  var format: js.UndefOr[TemplateFormat] = js.undefined
  
  /**
    * The name for the recommendation template.
    */
  var name: EntityName
  
  /**
    * Identifiers for the recommendations used to create a recommendation template.
    */
  var recommendationIds: js.UndefOr[RecommendationIdList] = js.undefined
  
  /**
    * An array of strings that specify the recommendation template type or types.  Alarm  The template is an AlarmRecommendation template.  Sop  The template is a SopRecommendation template.  Test  The template is a TestRecommendation template.  
    */
  var recommendationTypes: js.UndefOr[RenderRecommendationTypeList] = js.undefined
  
  /**
    * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key/value pair.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateRecommendationTemplateRequest {
  
  inline def apply(assessmentArn: Arn, name: EntityName): CreateRecommendationTemplateRequest = {
    val __obj = js.Dynamic.literal(assessmentArn = assessmentArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecommendationTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRecommendationTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentArn(value: Arn): Self = StObject.set(x, "assessmentArn", value.asInstanceOf[js.Any])
    
    inline def setBucketName(value: EntityName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setFormat(value: TemplateFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIds(value: RecommendationIdList): Self = StObject.set(x, "recommendationIds", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdsUndefined: Self = StObject.set(x, "recommendationIds", js.undefined)
    
    inline def setRecommendationIdsVarargs(value: Uuid*): Self = StObject.set(x, "recommendationIds", js.Array(value*))
    
    inline def setRecommendationTypes(value: RenderRecommendationTypeList): Self = StObject.set(x, "recommendationTypes", value.asInstanceOf[js.Any])
    
    inline def setRecommendationTypesUndefined: Self = StObject.set(x, "recommendationTypes", js.undefined)
    
    inline def setRecommendationTypesVarargs(value: RenderRecommendationType*): Self = StObject.set(x, "recommendationTypes", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
