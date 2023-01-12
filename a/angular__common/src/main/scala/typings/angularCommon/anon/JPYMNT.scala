package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYMNT extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var JPY: js.Array[String]
  
  var MNT: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var SEK: js.Array[js.UndefOr[String]]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object JPYMNT {
  
  inline def apply(
    BYN: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    MNT: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    SEK: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): JPYMNT = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MNT = MNT.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYMNT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JPYMNT] (val x: Self) extends AnyVal {
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setMNT(value: js.Array[String]): Self = StObject.set(x, "MNT", value.asInstanceOf[js.Any])
    
    inline def setMNTVarargs(value: String*): Self = StObject.set(x, "MNT", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setSEK(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "SEK", value.asInstanceOf[js.Any])
    
    inline def setSEKVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "SEK", js.Array(value*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value*))
  }
}
