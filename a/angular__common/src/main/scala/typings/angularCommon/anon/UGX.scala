package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UGX extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var UGX: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object UGX {
  
  @scala.inline
  def apply(JPY: js.Array[String], UGX: js.Array[String], USD: js.Array[String]): UGX = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], UGX = UGX.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[UGX]
  }
  
  @scala.inline
  implicit class UGXMutableBuilder[Self <: UGX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setUGX(value: js.Array[String]): Self = StObject.set(x, "UGX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUGXVarargs(value: String*): Self = StObject.set(x, "UGX", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
