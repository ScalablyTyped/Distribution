package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshCreateFromPolygonParams extends StObject {
  
  /**
    * The material to be used for the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromPolygon)
    */
  var material: js.UndefOr[MeshMaterial] = js.undefined
}
object MeshCreateFromPolygonParams {
  
  inline def apply(): MeshCreateFromPolygonParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshCreateFromPolygonParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshCreateFromPolygonParams] (val x: Self) extends AnyVal {
    
    inline def setMaterial(value: MeshMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
  }
}
