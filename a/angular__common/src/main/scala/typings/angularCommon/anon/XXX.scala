package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XXX extends StObject {
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
  
  var XXX: js.Array[scala.Nothing] = js.native
}
object XXX {
  
  @scala.inline
  def apply(THB: js.Array[String], TWD: js.Array[String], XXX: js.Array[scala.Nothing]): XXX = {
    val __obj = js.Dynamic.literal(THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[XXX]
  }
  
  @scala.inline
  implicit class XXXMutableBuilder[Self <: XXX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    @scala.inline
    def setXXX(value: js.Array[scala.Nothing]): Self = StObject.set(x, "XXX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXXXVarargs(value: scala.Nothing*): Self = StObject.set(x, "XXX", js.Array(value :_*))
  }
}
