package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PKR extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var PKR: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object PKR {
  
  @scala.inline
  def apply(JPY: js.Array[String], PKR: js.Array[String], USD: js.Array[String]): PKR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PKR = PKR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PKR]
  }
  
  @scala.inline
  implicit class PKRMutableBuilder[Self <: PKR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setPKR(value: js.Array[String]): Self = StObject.set(x, "PKR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPKRVarargs(value: String*): Self = StObject.set(x, "PKR", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
