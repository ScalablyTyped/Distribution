package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GHSNGN extends StObject {
  
  var GHS: js.Array[String]
  
  var NGN: js.Array[String]
}
object GHSNGN {
  
  inline def apply(GHS: js.Array[String], NGN: js.Array[String]): GHSNGN = {
    val __obj = js.Dynamic.literal(GHS = GHS.asInstanceOf[js.Any], NGN = NGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GHSNGN]
  }
  
  extension [Self <: GHSNGN](x: Self) {
    
    inline def setGHS(value: js.Array[String]): Self = StObject.set(x, "GHS", value.asInstanceOf[js.Any])
    
    inline def setGHSVarargs(value: String*): Self = StObject.set(x, "GHS", js.Array(value :_*))
    
    inline def setNGN(value: js.Array[String]): Self = StObject.set(x, "NGN", value.asInstanceOf[js.Any])
    
    inline def setNGNVarargs(value: String*): Self = StObject.set(x, "NGN", js.Array(value :_*))
  }
}
