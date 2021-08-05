package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUDFJD extends StObject {
  
  var AUD: js.Array[String]
  
  var FJD: js.Array[js.UndefOr[String]]
  
  var JPY: js.Array[String]
  
  var NZD: js.Array[String]
  
  var SBD: js.Array[js.UndefOr[String]]
  
  var TOP: js.Array[String]
  
  var USD: js.Array[String]
}
object AUDFJD {
  
  inline def apply(
    AUD: js.Array[String],
    FJD: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    NZD: js.Array[String],
    SBD: js.Array[js.UndefOr[String]],
    TOP: js.Array[String],
    USD: js.Array[String]
  ): AUDFJD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDFJD]
  }
  
  extension [Self <: AUDFJD](x: Self) {
    
    inline def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    inline def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    inline def setFJD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "FJD", value.asInstanceOf[js.Any])
    
    inline def setFJDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "FJD", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setNZD(value: js.Array[String]): Self = StObject.set(x, "NZD", value.asInstanceOf[js.Any])
    
    inline def setNZDVarargs(value: String*): Self = StObject.set(x, "NZD", js.Array(value :_*))
    
    inline def setSBD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "SBD", value.asInstanceOf[js.Any])
    
    inline def setSBDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "SBD", js.Array(value :_*))
    
    inline def setTOP(value: js.Array[String]): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
    
    inline def setTOPVarargs(value: String*): Self = StObject.set(x, "TOP", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
