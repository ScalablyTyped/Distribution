package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AFNArray extends StObject {
  
  var AFN: js.Array[String]
  
  var JPY: js.Array[String]
}
object AFNArray {
  
  @scala.inline
  def apply(AFN: js.Array[String], JPY: js.Array[String]): AFNArray = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFNArray]
  }
  
  @scala.inline
  implicit class AFNArrayMutableBuilder[Self <: AFNArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAFN(value: js.Array[String]): Self = StObject.set(x, "AFN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAFNVarargs(value: String*): Self = StObject.set(x, "AFN", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
  }
}
