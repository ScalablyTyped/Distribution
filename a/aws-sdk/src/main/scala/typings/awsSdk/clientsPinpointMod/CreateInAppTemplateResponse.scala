package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInAppTemplateResponse extends StObject {
  
  var TemplateCreateMessageBody: typings.awsSdk.clientsPinpointMod.TemplateCreateMessageBody
}
object CreateInAppTemplateResponse {
  
  inline def apply(TemplateCreateMessageBody: TemplateCreateMessageBody): CreateInAppTemplateResponse = {
    val __obj = js.Dynamic.literal(TemplateCreateMessageBody = TemplateCreateMessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInAppTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInAppTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setTemplateCreateMessageBody(value: TemplateCreateMessageBody): Self = StObject.set(x, "TemplateCreateMessageBody", value.asInstanceOf[js.Any])
  }
}
