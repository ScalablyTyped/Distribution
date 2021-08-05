package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AFNArray extends StObject {
  
  var AFN: js.Array[String]
  
  var JPY: js.Array[String]
}
object AFNArray {
  
  inline def apply(AFN: js.Array[String], JPY: js.Array[String]): AFNArray = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFNArray]
  }
  
  extension [Self <: AFNArray](x: Self) {
    
    inline def setAFN(value: js.Array[String]): Self = StObject.set(x, "AFN", value.asInstanceOf[js.Any])
    
    inline def setAFNVarargs(value: String*): Self = StObject.set(x, "AFN", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
  }
}
