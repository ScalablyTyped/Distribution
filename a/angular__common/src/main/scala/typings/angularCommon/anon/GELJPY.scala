package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GELJPY extends StObject {
  
  var GEL: js.Array[String]
  
  var JPY: js.Array[String]
}
object GELJPY {
  
  inline def apply(GEL: js.Array[String], JPY: js.Array[String]): GELJPY = {
    val __obj = js.Dynamic.literal(GEL = GEL.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[GELJPY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GELJPY] (val x: Self) extends AnyVal {
    
    inline def setGEL(value: js.Array[String]): Self = StObject.set(x, "GEL", value.asInstanceOf[js.Any])
    
    inline def setGELVarargs(value: String*): Self = StObject.set(x, "GEL", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
  }
}
