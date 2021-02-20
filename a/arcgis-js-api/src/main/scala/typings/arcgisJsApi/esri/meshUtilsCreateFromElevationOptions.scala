package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait meshUtilsCreateFromElevationOptions extends Object {
  
  /**
    * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createFromElevation)
    */
  var demResolution: js.UndefOr[Double | String] = js.native
}
object meshUtilsCreateFromElevationOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): meshUtilsCreateFromElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[meshUtilsCreateFromElevationOptions]
  }
  
  @scala.inline
  implicit class meshUtilsCreateFromElevationOptionsMutableBuilder[Self <: meshUtilsCreateFromElevationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemResolution(value: Double | String): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemResolutionUndefined: Self = StObject.set(x, "demResolution", js.undefined)
  }
}
