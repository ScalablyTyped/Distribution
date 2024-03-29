package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegratedMeshLayerElevationInfo extends StObject {
  
  /**
  		 * Defines how the mesh is placed on the vertical axis (z).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
  		 */
  var mode: String
  
  /**
  		 * An elevation offset, which is added to the vertical position of the mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
  		 */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The unit for `offset` values.
  		 *
  		 * @default meters
  		 *
  		 * [Read more...](global.html#unit)
  		 */
  var unit: js.UndefOr[feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards] = js.undefined
}
object IntegratedMeshLayerElevationInfo {
  
  inline def apply(mode: String): IntegratedMeshLayerElevationInfo = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegratedMeshLayerElevationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegratedMeshLayerElevationInfo] (val x: Self) extends AnyVal {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setUnit(value: feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
