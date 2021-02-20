package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AZN extends StObject {
  
  var AZN: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object AZN {
  
  @scala.inline
  def apply(AZN: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AZN = {
    val __obj = js.Dynamic.literal(AZN = AZN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AZN]
  }
  
  @scala.inline
  implicit class AZNMutableBuilder[Self <: AZN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAZN(value: js.Array[String]): Self = StObject.set(x, "AZN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAZNVarargs(value: String*): Self = StObject.set(x, "AZN", js.Array(value :_*))
    
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
