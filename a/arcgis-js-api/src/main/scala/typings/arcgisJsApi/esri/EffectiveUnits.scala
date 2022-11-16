package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectiveUnits extends StObject {
  
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
  
  inline def apply(distance: LengthUnit, elevation: LengthUnit): EffectiveUnits = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], elevation = elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectiveUnits]
  }
  
  extension [Self <: EffectiveUnits](x: Self) {
    
    inline def setDistance(value: LengthUnit): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setElevation(value: LengthUnit): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
  }
}
