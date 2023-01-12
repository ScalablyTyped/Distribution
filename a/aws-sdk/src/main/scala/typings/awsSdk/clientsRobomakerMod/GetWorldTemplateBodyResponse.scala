package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorldTemplateBodyResponse extends StObject {
  
  /**
    * The world template body.
    */
  var templateBody: js.UndefOr[Json] = js.undefined
}
object GetWorldTemplateBodyResponse {
  
  inline def apply(): GetWorldTemplateBodyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorldTemplateBodyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorldTemplateBodyResponse] (val x: Self) extends AnyVal {
    
    inline def setTemplateBody(value: Json): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
  }
}
