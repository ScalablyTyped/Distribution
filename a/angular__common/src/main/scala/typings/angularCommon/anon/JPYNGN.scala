package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JPYNGN extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var NGN: js.Array[String] = js.native
  
  var RUB: js.Array[String] = js.native
}
object JPYNGN {
  
  @scala.inline
  def apply(JPY: js.Array[String], NGN: js.Array[String], RUB: js.Array[String]): JPYNGN = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NGN = NGN.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYNGN]
  }
  
  @scala.inline
  implicit class JPYNGNMutableBuilder[Self <: JPYNGN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setNGN(value: js.Array[String]): Self = StObject.set(x, "NGN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNGNVarargs(value: String*): Self = StObject.set(x, "NGN", js.Array(value :_*))
    
    @scala.inline
    def setRUB(value: js.Array[String]): Self = StObject.set(x, "RUB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUBVarargs(value: String*): Self = StObject.set(x, "RUB", js.Array(value :_*))
  }
}
