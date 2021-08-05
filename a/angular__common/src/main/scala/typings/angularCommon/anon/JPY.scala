package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPY extends StObject {
  
  var CAD: js.Array[js.UndefOr[String]]
  
  var JPY: js.Array[String]
  
  var MXN: js.Array[js.UndefOr[String]]
  
  var RON: js.Array[js.UndefOr[String]]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
  
  var USD: js.Array[js.UndefOr[String]]
  
  var ZAR: js.Array[String]
}
object JPY {
  
  inline def apply(
    CAD: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    RON: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[js.UndefOr[String]],
    ZAR: js.Array[String]
  ): JPY = {
    val __obj = js.Dynamic.literal(CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPY]
  }
  
  extension [Self <: JPY](x: Self) {
    
    inline def setCAD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "CAD", value.asInstanceOf[js.Any])
    
    inline def setCADVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "CAD", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setMXN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "MXN", value.asInstanceOf[js.Any])
    
    inline def setMXNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "MXN", js.Array(value :_*))
    
    inline def setRON(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    inline def setRONVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RON", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    inline def setZAR(value: js.Array[String]): Self = StObject.set(x, "ZAR", value.asInstanceOf[js.Any])
    
    inline def setZARVarargs(value: String*): Self = StObject.set(x, "ZAR", js.Array(value :_*))
  }
}
