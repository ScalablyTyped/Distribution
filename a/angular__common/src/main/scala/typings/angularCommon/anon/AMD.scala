package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AMD extends StObject {
  
  var AMD: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
}
object AMD {
  
  @scala.inline
  def apply(AMD: js.Array[String], JPY: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): AMD = {
    val __obj = js.Dynamic.literal(AMD = AMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AMD]
  }
  
  @scala.inline
  implicit class AMDMutableBuilder[Self <: AMD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAMD(value: js.Array[String]): Self = StObject.set(x, "AMD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAMDVarargs(value: String*): Self = StObject.set(x, "AMD", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
  }
}
