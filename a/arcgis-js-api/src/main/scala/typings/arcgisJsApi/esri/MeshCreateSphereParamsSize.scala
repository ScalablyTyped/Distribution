package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshCreateSphereParamsSize extends StObject {
  
  /**
  		 * The depth of the created mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
  		 */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The height of the created mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The width of the created mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
  		 */
  var width: js.UndefOr[Double] = js.undefined
}
object MeshCreateSphereParamsSize {
  
  inline def apply(): MeshCreateSphereParamsSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshCreateSphereParamsSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshCreateSphereParamsSize] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
