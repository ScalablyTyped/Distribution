package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectiveUnits
  extends StObject
     with Object {
  
  /**
    * Units used for displaying distance or length values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#EffectiveUnits)
    */
  var distance: LengthUnit
  
  /**
    * Units used for displaying elevation values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#EffectiveUnits)
    */
  var elevation: LengthUnit
}
object EffectiveUnits {
  
  inline def apply(
    constructor: js.Function,
    distance: LengthUnit,
    elevation: LengthUnit,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): EffectiveUnits = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], elevation = elevation.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[EffectiveUnits]
  }
  
  extension [Self <: EffectiveUnits](x: Self) {
    
    inline def setDistance(value: LengthUnit): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setElevation(value: LengthUnit): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
  }
}
