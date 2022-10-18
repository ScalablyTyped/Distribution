package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateTemplateInput extends StObject {
  
  /**
    * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information, go to Template Anatomy in the CloudFormation User Guide. Conditional: You must pass TemplateURL or TemplateBody. If both are passed, only TemplateBody is used.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TemplateBody] = js.undefined
  
  /**
    * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket or a Systems Manager document. For more information, go to Template Anatomy in the CloudFormation User Guide. Conditional: You must pass TemplateURL or TemplateBody. If both are passed, only TemplateBody is used.
    */
  var TemplateURL: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TemplateURL] = js.undefined
}
object ValidateTemplateInput {
  
  inline def apply(): ValidateTemplateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateTemplateInput]
  }
  
  extension [Self <: ValidateTemplateInput](x: Self) {
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
    
    inline def setTemplateURL(value: TemplateURL): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
    
    inline def setTemplateURLUndefined: Self = StObject.set(x, "TemplateURL", js.undefined)
  }
}
