package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AFNJPY extends StObject {
  
  var AFN: js.Array[String]
  
  var JPY: js.Array[String]
  
  var PKR: js.Array[String]
}
object AFNJPY {
  
  @scala.inline
  def apply(AFN: js.Array[String], JPY: js.Array[String], PKR: js.Array[String]): AFNJPY = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], PKR = PKR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFNJPY]
  }
  
  @scala.inline
  implicit class AFNJPYMutableBuilder[Self <: AFNJPY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAFN(value: js.Array[String]): Self = StObject.set(x, "AFN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAFNVarargs(value: String*): Self = StObject.set(x, "AFN", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setPKR(value: js.Array[String]): Self = StObject.set(x, "PKR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPKRVarargs(value: String*): Self = StObject.set(x, "PKR", js.Array(value :_*))
  }
}
