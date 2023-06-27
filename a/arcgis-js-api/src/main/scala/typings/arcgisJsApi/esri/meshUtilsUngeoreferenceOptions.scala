package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait meshUtilsUngeoreferenceOptions extends StObject {
  
  /**
  		 * Indicates whether the coordinates are georeferenced relative to the globe or the projected coordinate system.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#ungeoreference)
  		 */
  var geographic: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates the unit of the resulting data.
  		 *
  		 * [Read more...](global.html#unit)
  		 */
  var unit: js.UndefOr[
    millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
}
object meshUtilsUngeoreferenceOptions {
  
  inline def apply(): meshUtilsUngeoreferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[meshUtilsUngeoreferenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: meshUtilsUngeoreferenceOptions] (val x: Self) extends AnyVal {
    
    inline def setGeographic(value: Boolean): Self = StObject.set(x, "geographic", value.asInstanceOf[js.Any])
    
    inline def setGeographicUndefined: Self = StObject.set(x, "geographic", js.undefined)
    
    inline def setUnit(
      value: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
