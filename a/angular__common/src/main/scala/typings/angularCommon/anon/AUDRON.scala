package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUDRON extends StObject {
  
  var AUD: js.Array[String]
  
  var RON: js.Array[js.UndefOr[String]]
  
  var THB: js.Array[String]
  
  var TRY: js.Array[String]
  
  var TWD: js.Array[String]
}
object AUDRON {
  
  inline def apply(
    AUD: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TRY: js.Array[String],
    TWD: js.Array[String]
  ): AUDRON = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDRON]
  }
  
  extension [Self <: AUDRON](x: Self) {
    
    inline def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    inline def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    inline def setRON(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    inline def setRONVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RON", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setTRY(value: js.Array[String]): Self = StObject.set(x, "TRY", value.asInstanceOf[js.Any])
    
    inline def setTRYVarargs(value: String*): Self = StObject.set(x, "TRY", js.Array(value :_*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
  }
}
