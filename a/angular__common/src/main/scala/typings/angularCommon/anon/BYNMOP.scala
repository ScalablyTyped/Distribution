package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BYNMOP extends StObject {
  
  var AUD: js.Array[String]
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var MOP: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var RON: js.Array[js.UndefOr[String]]
  
  var RUR: js.Array[js.UndefOr[String]]
  
  var USD: js.Array[String]
  
  var XXX: js.Array[scala.Nothing]
}
object BYNMOP {
  
  inline def apply(
    AUD: js.Array[String],
    BYN: js.Array[js.UndefOr[String]],
    MOP: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    RON: js.Array[js.UndefOr[String]],
    RUR: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): BYNMOP = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BYN = BYN.asInstanceOf[js.Any], MOP = MOP.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RUR = RUR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNMOP]
  }
  
  extension [Self <: BYNMOP](x: Self) {
    
    inline def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    inline def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value*))
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setMOP(value: js.Array[String]): Self = StObject.set(x, "MOP", value.asInstanceOf[js.Any])
    
    inline def setMOPVarargs(value: String*): Self = StObject.set(x, "MOP", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setRON(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    inline def setRONVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RON", js.Array(value*))
    
    inline def setRUR(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RUR", value.asInstanceOf[js.Any])
    
    inline def setRURVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RUR", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
    
    inline def setXXX(value: js.Array[scala.Nothing]): Self = StObject.set(x, "XXX", value.asInstanceOf[js.Any])
    
    inline def setXXXVarargs(value: scala.Nothing*): Self = StObject.set(x, "XXX", js.Array(value*))
  }
}
