package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.down
import typings.arcgisJsApi.arcgisJsApiStrings.east
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.north
import typings.arcgisJsApi.arcgisJsApiStrings.south
import typings.arcgisJsApi.arcgisJsApiStrings.up
import typings.arcgisJsApi.arcgisJsApiStrings.west
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshCreatePlaneParams extends StObject {
  
  /**
  		 * Direction the plane is facing.
  		 *
  		 * @default "up"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
  		 */
  var facing: js.UndefOr[east | west | north | south | up | down] = js.undefined
  
  /**
  		 * Whether to georeference relative to the globe or the projected coordinate system (PCS).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
  		 */
  var geographic: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The material to be used for the mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
  		 */
  var material: js.UndefOr[MeshMaterial] = js.undefined
  
  /**
  		 * A uniform size value or an object containing individual values width and height.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
  		 */
  var size: js.UndefOr[Double | MeshCreatePlaneParamsSize] = js.undefined
  
  /**
  		 * The unit of the size (defaults to the unit of the location's spatial reference).
  		 *
  		 * [Read more...](global.html#unit)
  		 */
  var unit: js.UndefOr[
    millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
}
object MeshCreatePlaneParams {
  
  inline def apply(): MeshCreatePlaneParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshCreatePlaneParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshCreatePlaneParams] (val x: Self) extends AnyVal {
    
    inline def setFacing(value: east | west | north | south | up | down): Self = StObject.set(x, "facing", value.asInstanceOf[js.Any])
    
    inline def setFacingUndefined: Self = StObject.set(x, "facing", js.undefined)
    
    inline def setGeographic(value: Boolean): Self = StObject.set(x, "geographic", value.asInstanceOf[js.Any])
    
    inline def setGeographicUndefined: Self = StObject.set(x, "geographic", js.undefined)
    
    inline def setMaterial(value: MeshMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setSize(value: Double | MeshCreatePlaneParamsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUnit(
      value: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
