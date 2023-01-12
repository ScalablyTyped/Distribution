package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.elevation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationDimension extends StObject {
  
  /**
    * Name of dimensional axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#ElevationDimension)
    */
  var name: elevation
}
object ElevationDimension {
  
  inline def apply(): ElevationDimension = {
    val __obj = js.Dynamic.literal(name = "elevation")
    __obj.asInstanceOf[ElevationDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationDimension] (val x: Self) extends AnyVal {
    
    inline def setName(value: elevation): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
