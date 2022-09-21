package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillOpacityNumber extends StObject {
  
  var fillOpacity: Double
}
object FillOpacityNumber {
  
  inline def apply(fillOpacity: Double): FillOpacityNumber = {
    val __obj = js.Dynamic.literal(fillOpacity = fillOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillOpacityNumber]
  }
  
  extension [Self <: FillOpacityNumber](x: Self) {
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
  }
}
