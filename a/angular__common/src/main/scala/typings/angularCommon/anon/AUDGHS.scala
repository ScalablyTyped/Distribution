package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AUDGHS extends StObject {
  
  var AUD: js.Array[String] = js.native
  
  var GHS: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object AUDGHS {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    GHS: js.Array[String],
    JPY: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String]
  ): AUDGHS = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], GHS = GHS.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDGHS]
  }
  
  @scala.inline
  implicit class AUDGHSMutableBuilder[Self <: AUDGHS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setGHS(value: js.Array[String]): Self = StObject.set(x, "GHS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGHSVarargs(value: String*): Self = StObject.set(x, "GHS", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
