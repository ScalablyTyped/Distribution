package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DZDJPY extends StObject {
  
  var DZD: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object DZDJPY {
  
  @scala.inline
  def apply(DZD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): DZDJPY = {
    val __obj = js.Dynamic.literal(DZD = DZD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[DZDJPY]
  }
  
  @scala.inline
  implicit class DZDJPYMutableBuilder[Self <: DZDJPY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDZD(value: js.Array[String]): Self = StObject.set(x, "DZD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDZDVarargs(value: String*): Self = StObject.set(x, "DZD", js.Array(value :_*))
    
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
