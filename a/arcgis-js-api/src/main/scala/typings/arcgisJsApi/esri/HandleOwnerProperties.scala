package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleOwnerProperties extends StObject {
  
  /**
    * Handle registry to help manage `handles`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-HandleOwner.html#handles)
    */
  var handles: js.UndefOr[HandlesProperties] = js.undefined
}
object HandleOwnerProperties {
  
  inline def apply(): HandleOwnerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleOwnerProperties]
  }
  
  extension [Self <: HandleOwnerProperties](x: Self) {
    
    inline def setHandles(value: HandlesProperties): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
  }
}
