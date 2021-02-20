package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PLN extends StObject {
  
  var AUD: js.Array[js.UndefOr[String]] = js.native
  
  var PLN: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
}
object PLN {
  
  @scala.inline
  def apply(AUD: js.Array[js.UndefOr[String]], PLN: js.Array[String], THB: js.Array[String]): PLN = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any])
    __obj.asInstanceOf[PLN]
  }
  
  @scala.inline
  implicit class PLNMutableBuilder[Self <: PLN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setPLN(value: js.Array[String]): Self = StObject.set(x, "PLN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLNVarargs(value: String*): Self = StObject.set(x, "PLN", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
  }
}
