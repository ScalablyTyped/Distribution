package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GRD extends StObject {
  
  var GRD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var THB: js.Array[String]
}
object GRD {
  
  inline def apply(GRD: js.Array[String], JPY: js.Array[String], THB: js.Array[String]): GRD = {
    val __obj = js.Dynamic.literal(GRD = GRD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRD]
  }
  
  extension [Self <: GRD](x: Self) {
    
    inline def setGRD(value: js.Array[String]): Self = StObject.set(x, "GRD", value.asInstanceOf[js.Any])
    
    inline def setGRDVarargs(value: String*): Self = StObject.set(x, "GRD", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
  }
}
