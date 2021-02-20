package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EURGBP extends StObject {
  
  var EUR: js.Array[js.UndefOr[String]] = js.native
  
  var GBP: js.Array[js.UndefOr[String]] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object EURGBP {
  
  @scala.inline
  def apply(
    EUR: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    USD: js.Array[String]
  ): EURGBP = {
    val __obj = js.Dynamic.literal(EUR = EUR.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[EURGBP]
  }
  
  @scala.inline
  implicit class EURGBPMutableBuilder[Self <: EURGBP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEUR(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "EUR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEURVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "EUR", js.Array(value :_*))
    
    @scala.inline
    def setGBP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "GBP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGBPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "GBP", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
