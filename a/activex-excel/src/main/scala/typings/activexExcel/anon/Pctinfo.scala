package typings.activexExcel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pctinfo extends StObject {
  
  var pctinfo: Double
}
object Pctinfo {
  
  inline def apply(pctinfo: Double): Pctinfo = {
    val __obj = js.Dynamic.literal(pctinfo = pctinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pctinfo]
  }
  
  extension [Self <: Pctinfo](x: Self) {
    
    inline def setPctinfo(value: Double): Self = StObject.set(x, "pctinfo", value.asInstanceOf[js.Any])
  }
}
