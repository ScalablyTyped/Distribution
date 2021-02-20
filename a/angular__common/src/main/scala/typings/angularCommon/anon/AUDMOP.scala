package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AUDMOP extends StObject {
  
  var AUD: js.Array[String] = js.native
  
  var MOP: js.Array[String] = js.native
  
  var RON: js.Array[js.UndefOr[String]] = js.native
  
  var USD: js.Array[String] = js.native
  
  var XXX: js.Array[scala.Nothing] = js.native
}
object AUDMOP {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    MOP: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): AUDMOP = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], MOP = MOP.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDMOP]
  }
  
  @scala.inline
  implicit class AUDMOPMutableBuilder[Self <: AUDMOP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setMOP(value: js.Array[String]): Self = StObject.set(x, "MOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOPVarargs(value: String*): Self = StObject.set(x, "MOP", js.Array(value :_*))
    
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RON", js.Array(value :_*))
    
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
