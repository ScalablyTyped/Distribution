package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PHPTHB extends StObject {
  
  var PHP: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object PHPTHB {
  
  inline def apply(PHP: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): PHPTHB = {
    val __obj = js.Dynamic.literal(PHP = PHP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PHPTHB]
  }
  
  extension [Self <: PHPTHB](x: Self) {
    
    inline def setPHP(value: js.Array[String]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: String*): Self = StObject.set(x, "PHP", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
  }
}
