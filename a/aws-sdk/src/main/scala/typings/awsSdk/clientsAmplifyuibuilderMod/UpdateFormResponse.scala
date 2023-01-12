package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFormResponse extends StObject {
  
  /**
    * Describes the configuration of the updated form.
    */
  var entity: js.UndefOr[Form] = js.undefined
}
object UpdateFormResponse {
  
  inline def apply(): UpdateFormResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFormResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFormResponse] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: Form): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
  }
}
