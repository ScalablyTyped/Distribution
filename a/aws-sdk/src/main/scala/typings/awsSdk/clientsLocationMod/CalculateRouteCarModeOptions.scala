package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateRouteCarModeOptions extends StObject {
  
  /**
    * Avoids ferries when calculating routes. Default Value: false  Valid Values: false | true 
    */
  var AvoidFerries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Avoids tolls when calculating routes. Default Value: false  Valid Values: false | true 
    */
  var AvoidTolls: js.UndefOr[Boolean] = js.undefined
}
object CalculateRouteCarModeOptions {
  
  inline def apply(): CalculateRouteCarModeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculateRouteCarModeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculateRouteCarModeOptions] (val x: Self) extends AnyVal {
    
    inline def setAvoidFerries(value: Boolean): Self = StObject.set(x, "AvoidFerries", value.asInstanceOf[js.Any])
    
    inline def setAvoidFerriesUndefined: Self = StObject.set(x, "AvoidFerries", js.undefined)
    
    inline def setAvoidTolls(value: Boolean): Self = StObject.set(x, "AvoidTolls", value.asInstanceOf[js.Any])
    
    inline def setAvoidTollsUndefined: Self = StObject.set(x, "AvoidTolls", js.undefined)
  }
}
