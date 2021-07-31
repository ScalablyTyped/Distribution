package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILRJPY extends StObject {
  
  var AUD: js.Array[String]
  
  var ILR: js.Array[String]
  
  var JPY: js.Array[String]
  
  var KRW: js.Array[String]
  
  var SGD: js.Array[String]
  
  var TWD: js.Array[String]
  
  var USD: js.Array[String]
  
  var XXX: js.Array[scala.Nothing]
}
object ILRJPY {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    ILR: js.Array[String],
    JPY: js.Array[String],
    KRW: js.Array[String],
    SGD: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): ILRJPY = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], ILR = ILR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILRJPY]
  }
  
  @scala.inline
  implicit class ILRJPYMutableBuilder[Self <: ILRJPY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setILR(value: js.Array[String]): Self = StObject.set(x, "ILR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setILRVarargs(value: String*): Self = StObject.set(x, "ILR", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setKRW(value: js.Array[String]): Self = StObject.set(x, "KRW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKRWVarargs(value: String*): Self = StObject.set(x, "KRW", js.Array(value :_*))
    
    @scala.inline
    def setSGD(value: js.Array[String]): Self = StObject.set(x, "SGD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSGDVarargs(value: String*): Self = StObject.set(x, "SGD", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    @scala.inline
    def setXXX(value: js.Array[scala.Nothing]): Self = StObject.set(x, "XXX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXXXVarargs(value: scala.Nothing*): Self = StObject.set(x, "XXX", js.Array(value :_*))
  }
}
