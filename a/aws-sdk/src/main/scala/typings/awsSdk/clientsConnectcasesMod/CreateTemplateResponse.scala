package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the newly created template.
    */
  var templateArn: TemplateArn
  
  /**
    * A unique identifier of a template.
    */
  var templateId: TemplateId
}
object CreateTemplateResponse {
  
  inline def apply(templateArn: TemplateArn, templateId: TemplateId): CreateTemplateResponse = {
    val __obj = js.Dynamic.literal(templateArn = templateArn.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateResponse]
  }
  
  extension [Self <: CreateTemplateResponse](x: Self) {
    
    inline def setTemplateArn(value: TemplateArn): Self = StObject.set(x, "templateArn", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
