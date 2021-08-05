package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintCount extends StObject {
  
  var Cancel: Double
  
  var PrintCount: Double
}
object PrintCount {
  
  inline def apply(Cancel: Double, PrintCount: Double): PrintCount = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PrintCount = PrintCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCount]
  }
  
  extension [Self <: PrintCount](x: Self) {
    
    inline def setCancel(value: Double): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setPrintCount(value: Double): Self = StObject.set(x, "PrintCount", value.asInstanceOf[js.Any])
  }
}
