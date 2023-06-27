package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.bevelled_
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.mitered_
import typings.arcgisJsApi.arcgisJsApiStrings.rounded_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetParametersProperties extends StObject {
  
  /**
  		 * The `bevelRatio` is multiplied by the offset distance and the result determines how far a mitered offset intersection can be located before it is beveled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html#bevelRatio)
  		 */
  var bevelRatio: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The array of geometries to be offset.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html#geometries)
  		 */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  
  /**
  		 * Specifies the planar distance for constructing an offset based on the input geometries.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html#offsetDistance)
  		 */
  var offsetDistance: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Options that determine how the ends intersect.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html#offsetHow)
  		 */
  var offsetHow: js.UndefOr[bevelled_ | mitered_ | rounded_] = js.undefined
  
  /**
  		 * The offset distance unit.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html#offsetUnit)
  		 */
  var offsetUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.undefined
}
object OffsetParametersProperties {
  
  inline def apply(): OffsetParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setBevelRatio(value: Double): Self = StObject.set(x, "bevelRatio", value.asInstanceOf[js.Any])
    
    inline def setBevelRatioUndefined: Self = StObject.set(x, "bevelRatio", js.undefined)
    
    inline def setGeometries(value: js.Array[GeometryProperties]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setGeometriesVarargs(value: GeometryProperties*): Self = StObject.set(x, "geometries", js.Array(value*))
    
    inline def setOffsetDistance(value: Double): Self = StObject.set(x, "offsetDistance", value.asInstanceOf[js.Any])
    
    inline def setOffsetDistanceUndefined: Self = StObject.set(x, "offsetDistance", js.undefined)
    
    inline def setOffsetHow(value: bevelled_ | mitered_ | rounded_): Self = StObject.set(x, "offsetHow", value.asInstanceOf[js.Any])
    
    inline def setOffsetHowUndefined: Self = StObject.set(x, "offsetHow", js.undefined)
    
    inline def setOffsetUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = StObject.set(x, "offsetUnit", value.asInstanceOf[js.Any])
    
    inline def setOffsetUnitUndefined: Self = StObject.set(x, "offsetUnit", js.undefined)
  }
}
