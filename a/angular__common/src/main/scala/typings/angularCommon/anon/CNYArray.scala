package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CNYArray extends StObject {
  
  var CNY: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
}
object CNYArray {
  
  @scala.inline
  def apply(CNY: js.Array[String], JPY: js.Array[String]): CNYArray = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNYArray]
  }
  
  @scala.inline
  implicit class CNYArrayMutableBuilder[Self <: CNYArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCNY(value: js.Array[String]): Self = StObject.set(x, "CNY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCNYVarargs(value: String*): Self = StObject.set(x, "CNY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
  }
}
