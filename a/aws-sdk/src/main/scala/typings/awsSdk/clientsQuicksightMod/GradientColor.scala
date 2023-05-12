package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientColor extends StObject {
  
  /**
    * The list of gradient color stops.
    */
  var Stops: js.UndefOr[GradientStopList] = js.undefined
}
object GradientColor {
  
  inline def apply(): GradientColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradientColor] (val x: Self) extends AnyVal {
    
    inline def setStops(value: GradientStopList): Self = StObject.set(x, "Stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "Stops", js.undefined)
    
    inline def setStopsVarargs(value: GradientStop*): Self = StObject.set(x, "Stops", js.Array(value*))
  }
}
