package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYPKR extends StObject {
  
  var JPY: js.Array[String]
  
  var PKR: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object JPYPKR {
  
  @scala.inline
  def apply(JPY: js.Array[String], PKR: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): JPYPKR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PKR = PKR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYPKR]
  }
  
  @scala.inline
  implicit class JPYPKRMutableBuilder[Self <: JPYPKR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setPKR(value: js.Array[String]): Self = StObject.set(x, "PKR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPKRVarargs(value: String*): Self = StObject.set(x, "PKR", js.Array(value :_*))
    
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
