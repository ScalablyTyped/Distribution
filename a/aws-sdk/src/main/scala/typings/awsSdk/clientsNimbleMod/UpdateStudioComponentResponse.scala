package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStudioComponentResponse extends StObject {
  
  /**
    * Information about the studio component.
    */
  var studioComponent: js.UndefOr[StudioComponent] = js.undefined
}
object UpdateStudioComponentResponse {
  
  inline def apply(): UpdateStudioComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStudioComponentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStudioComponentResponse] (val x: Self) extends AnyVal {
    
    inline def setStudioComponent(value: StudioComponent): Self = StObject.set(x, "studioComponent", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentUndefined: Self = StObject.set(x, "studioComponent", js.undefined)
  }
}
