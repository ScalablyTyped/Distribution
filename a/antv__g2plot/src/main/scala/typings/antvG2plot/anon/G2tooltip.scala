package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait G2tooltip extends StObject {
  
  var `g2-tooltip`: FontSizePadding
}
object G2tooltip {
  
  inline def apply(`g2-tooltip`: FontSizePadding): G2tooltip = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("g2-tooltip")(`g2-tooltip`.asInstanceOf[js.Any])
    __obj.asInstanceOf[G2tooltip]
  }
  
  extension [Self <: G2tooltip](x: Self) {
    
    inline def `setG2-tooltip`(value: FontSizePadding): Self = StObject.set(x, "g2-tooltip", value.asInstanceOf[js.Any])
  }
}
