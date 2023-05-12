package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeospatialMapStyleOptions extends StObject {
  
  /**
    * The base map style of the geospatial map.
    */
  var BaseMapStyle: js.UndefOr[BaseMapStyleType] = js.undefined
}
object GeospatialMapStyleOptions {
  
  inline def apply(): GeospatialMapStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeospatialMapStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeospatialMapStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setBaseMapStyle(value: BaseMapStyleType): Self = StObject.set(x, "BaseMapStyle", value.asInstanceOf[js.Any])
    
    inline def setBaseMapStyleUndefined: Self = StObject.set(x, "BaseMapStyle", js.undefined)
  }
}
