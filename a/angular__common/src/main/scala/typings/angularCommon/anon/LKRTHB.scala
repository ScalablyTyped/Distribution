package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LKRTHB extends StObject {
  
  var LKR: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
}
object LKRTHB {
  
  @scala.inline
  def apply(LKR: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): LKRTHB = {
    val __obj = js.Dynamic.literal(LKR = LKR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[LKRTHB]
  }
  
  @scala.inline
  implicit class LKRTHBMutableBuilder[Self <: LKRTHB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLKR(value: js.Array[String]): Self = StObject.set(x, "LKR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLKRVarargs(value: String*): Self = StObject.set(x, "LKR", js.Array(value :_*))
    
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
