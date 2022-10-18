package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateVersionResponse extends StObject {
  
  /**
    * The date, in ISO 8601 format, when the version of the message template was created.
    */
  var CreationDate: string
  
  /**
    * A JSON object that specifies the default values that are used for message variables in the version of the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[string] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the version of the message template was last modified.
    */
  var LastModifiedDate: string
  
  /**
    * The custom description of the version of the message template.
    */
  var TemplateDescription: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the message template.
    */
  var TemplateName: string
  
  /**
    * The type of channel that the message template is designed for. Possible values are: EMAIL, PUSH, SMS, and VOICE.
    */
  var TemplateType: string
  
  /**
    * The unique identifier for the version of the message template. This value is an integer that Amazon Pinpoint automatically increments and assigns to each new version of a template.
    */
  var Version: js.UndefOr[string] = js.undefined
}
object TemplateVersionResponse {
  
  inline def apply(CreationDate: string, LastModifiedDate: string, TemplateName: string, TemplateType: string): TemplateVersionResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateVersionResponse]
  }
  
  extension [Self <: TemplateVersionResponse](x: Self) {
    
    inline def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultSubstitutions(value: string): Self = StObject.set(x, "DefaultSubstitutions", value.asInstanceOf[js.Any])
    
    inline def setDefaultSubstitutionsUndefined: Self = StObject.set(x, "DefaultSubstitutions", js.undefined)
    
    inline def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setTemplateDescription(value: string): Self = StObject.set(x, "TemplateDescription", value.asInstanceOf[js.Any])
    
    inline def setTemplateDescriptionUndefined: Self = StObject.set(x, "TemplateDescription", js.undefined)
    
    inline def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: string): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
