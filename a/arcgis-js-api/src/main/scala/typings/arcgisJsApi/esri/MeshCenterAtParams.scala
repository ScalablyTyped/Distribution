package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshCenterAtParams extends StObject {
  
  /**
    * Whether to georeference relative to the globe or the projected coordinate system (PCS).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#centerAt)
    */
  var geographic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The origin at which to center.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#centerAt)
    */
  var origin: js.UndefOr[Point] = js.undefined
}
object MeshCenterAtParams {
  
  inline def apply(): MeshCenterAtParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshCenterAtParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshCenterAtParams] (val x: Self) extends AnyVal {
    
    inline def setGeographic(value: Boolean): Self = StObject.set(x, "geographic", value.asInstanceOf[js.Any])
    
    inline def setGeographicUndefined: Self = StObject.set(x, "geographic", js.undefined)
    
    inline def setOrigin(value: Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
