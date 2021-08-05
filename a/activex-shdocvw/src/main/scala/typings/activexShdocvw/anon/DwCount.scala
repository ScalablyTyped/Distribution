package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DwCount extends StObject {
  
  val URL: js.Any
  
  val dwCount: Double
}
object DwCount {
  
  inline def apply(URL: js.Any, dwCount: Double): DwCount = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], dwCount = dwCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DwCount]
  }
  
  extension [Self <: DwCount](x: Self) {
    
    inline def setDwCount(value: Double): Self = StObject.set(x, "dwCount", value.asInstanceOf[js.Any])
    
    inline def setURL(value: js.Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
