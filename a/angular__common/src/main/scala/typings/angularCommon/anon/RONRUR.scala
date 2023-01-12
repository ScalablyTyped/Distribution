package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RONRUR extends StObject {
  
  var AUD: js.Array[String]
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var RON: js.Array[js.UndefOr[String]]
  
  var RUR: js.Array[js.UndefOr[String]]
  
  var THB: js.Array[String]
  
  var TRY: js.Array[String]
  
  var TWD: js.Array[String]
}
object RONRUR {
  
  inline def apply(
    AUD: js.Array[String],
    BYN: js.Array[js.UndefOr[String]],
    PHP: js.Array[js.UndefOr[String]],
    RON: js.Array[js.UndefOr[String]],
    RUR: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TRY: js.Array[String],
    TWD: js.Array[String]
  ): RONRUR = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BYN = BYN.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RUR = RUR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[RONRUR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RONRUR] (val x: Self) extends AnyVal {
    
    inline def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    inline def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value*))
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setRON(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    inline def setRONVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RON", js.Array(value*))
    
    inline def setRUR(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RUR", value.asInstanceOf[js.Any])
    
    inline def setRURVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RUR", js.Array(value*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value*))
    
    inline def setTRY(value: js.Array[String]): Self = StObject.set(x, "TRY", value.asInstanceOf[js.Any])
    
    inline def setTRYVarargs(value: String*): Self = StObject.set(x, "TRY", js.Array(value*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value*))
  }
}
