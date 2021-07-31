package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait STD extends StObject {
  
  var BDT: js.Array[String]
  
  var JPY: js.Array[String]
  
  var STD: js.Array[js.UndefOr[String]]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
  
  var USD: js.Array[String]
}
object STD {
  
  @scala.inline
  def apply(
    BDT: js.Array[String],
    JPY: js.Array[String],
    STD: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): STD = {
    val __obj = js.Dynamic.literal(BDT = BDT.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], STD = STD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[STD]
  }
  
  @scala.inline
  implicit class STDMutableBuilder[Self <: STD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBDT(value: js.Array[String]): Self = StObject.set(x, "BDT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBDTVarargs(value: String*): Self = StObject.set(x, "BDT", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setSTD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "STD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "STD", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
