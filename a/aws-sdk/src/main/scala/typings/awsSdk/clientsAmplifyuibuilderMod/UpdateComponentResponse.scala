package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComponentResponse extends StObject {
  
  /**
    * Describes the configuration of the updated component.
    */
  var entity: js.UndefOr[Component] = js.undefined
}
object UpdateComponentResponse {
  
  inline def apply(): UpdateComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateComponentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateComponentResponse] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: Component): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
  }
}
