package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStudioComponentResponse extends StObject {
  
  /**
    * Information about the studio component.
    */
  var studioComponent: js.UndefOr[StudioComponent] = js.undefined
}
object DeleteStudioComponentResponse {
  
  inline def apply(): DeleteStudioComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteStudioComponentResponse]
  }
  
  extension [Self <: DeleteStudioComponentResponse](x: Self) {
    
    inline def setStudioComponent(value: StudioComponent): Self = StObject.set(x, "studioComponent", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentUndefined: Self = StObject.set(x, "studioComponent", js.undefined)
  }
}
