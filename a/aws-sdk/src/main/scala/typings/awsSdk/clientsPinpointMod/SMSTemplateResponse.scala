package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMSTemplateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The message body that's used in text messages that are based on the message template.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the message template was created.
    */
  var CreationDate: string
  
  /**
    * The JSON object that specifies the default values that are used for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the message template was last modified.
    */
  var LastModifiedDate: string
  
  /**
    * The unique identifier for the recommender model that's used by the message template.
    */
  var RecommenderId: js.UndefOr[string] = js.undefined
  
  /**
    * The custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the message template.
    */
  var TemplateName: string
  
  /**
    * The type of channel that the message template is designed for. For an SMS template, this value is SMS.
    */
  var TemplateType: typings.awsSdk.clientsPinpointMod.TemplateType
  
  /**
    * The unique identifier, as an integer, for the active version of the message template, or the version of the template that you specified by using the version parameter in your request.
    */
  var Version: js.UndefOr[string] = js.undefined
  
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.undefined
}
object SMSTemplateResponse {
  
  inline def apply(CreationDate: string, LastModifiedDate: string, TemplateName: string, TemplateType: TemplateType): SMSTemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSTemplateResponse]
  }
  
  extension [Self <: SMSTemplateResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultSubstitutions(value: string): Self = StObject.set(x, "DefaultSubstitutions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSubstitutionsUndefined: Self = StObject.set(x, "DefaultSubstitutions", js.undefined)
    
    inline def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setRecommenderId(value: string): Self = StObject.set(x, "RecommenderId", value.asInstanceOf[js.Any])
    
    inline def setRecommenderIdUndefined: Self = StObject.set(x, "RecommenderId", js.undefined)
    
    inline def setTags(value: MapOfString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateDescription(value: string): Self = StObject.set(x, "TemplateDescription", value.asInstanceOf[js.Any])
    
    inline def setTemplateDescriptionUndefined: Self = StObject.set(x, "TemplateDescription", js.undefined)
    
    inline def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: TemplateType): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
