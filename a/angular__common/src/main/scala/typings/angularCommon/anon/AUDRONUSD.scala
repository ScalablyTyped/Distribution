package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUDRONUSD extends StObject {
  
  var AUD: js.Array[String]
  
  var RON: js.Array[js.UndefOr[String]]
  
  var USD: js.Array[String]
  
  var XXX: js.Array[scala.Nothing]
}
object AUDRONUSD {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): AUDRONUSD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDRONUSD]
  }
  
  @scala.inline
  implicit class AUDRONUSDMutableBuilder[Self <: AUDRONUSD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
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
