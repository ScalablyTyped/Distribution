package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LKR extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var LKR: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
  
  var XOF: js.Array[String] = js.native
}
object LKR {
  
  @scala.inline
  def apply(
    JPY: js.Array[String],
    LKR: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    XOF: js.Array[String]
  ): LKR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], LKR = LKR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XOF = XOF.asInstanceOf[js.Any])
    __obj.asInstanceOf[LKR]
  }
  
  @scala.inline
  implicit class LKRMutableBuilder[Self <: LKR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setLKR(value: js.Array[String]): Self = StObject.set(x, "LKR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLKRVarargs(value: String*): Self = StObject.set(x, "LKR", js.Array(value :_*))
    
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
    
    @scala.inline
    def setXOF(value: js.Array[String]): Self = StObject.set(x, "XOF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOFVarargs(value: String*): Self = StObject.set(x, "XOF", js.Array(value :_*))
  }
}
