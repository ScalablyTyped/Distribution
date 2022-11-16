package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshCreatePlaneParamsSize extends StObject {
  
  /**
    * The height of the created mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the created mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object MeshCreatePlaneParamsSize {
  
  inline def apply(): MeshCreatePlaneParamsSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshCreatePlaneParamsSize]
  }
  
  extension [Self <: MeshCreatePlaneParamsSize](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
