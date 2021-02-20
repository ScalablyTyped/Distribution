package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GHS extends StObject {
  
  var GHS: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object GHS {
  
  @scala.inline
  def apply(GHS: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): GHS = {
    val __obj = js.Dynamic.literal(GHS = GHS.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[GHS]
  }
  
  @scala.inline
  implicit class GHSMutableBuilder[Self <: GHS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGHS(value: js.Array[String]): Self = StObject.set(x, "GHS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGHSVarargs(value: String*): Self = StObject.set(x, "GHS", js.Array(value :_*))
    
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
