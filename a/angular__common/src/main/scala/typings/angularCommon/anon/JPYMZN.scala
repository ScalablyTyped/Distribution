package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JPYMZN extends StObject {
  
  var AUD: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var MZN: js.Array[String] = js.native
  
  var PTE: js.Array[String] = js.native
  
  var RON: js.Array[js.UndefOr[String]] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object JPYMZN {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    JPY: js.Array[String],
    MZN: js.Array[String],
    PTE: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): JPYMZN = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MZN = MZN.asInstanceOf[js.Any], PTE = PTE.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYMZN]
  }
  
  @scala.inline
  implicit class JPYMZNMutableBuilder[Self <: JPYMZN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setMZN(value: js.Array[String]): Self = StObject.set(x, "MZN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMZNVarargs(value: String*): Self = StObject.set(x, "MZN", js.Array(value :_*))
    
    @scala.inline
    def setPTE(value: js.Array[String]): Self = StObject.set(x, "PTE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPTEVarargs(value: String*): Self = StObject.set(x, "PTE", js.Array(value :_*))
    
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RON", js.Array(value :_*))
    
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
