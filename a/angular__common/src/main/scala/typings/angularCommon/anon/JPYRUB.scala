package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYRUB extends StObject {
  
  var JPY: js.Array[String]
  
  var RUB: js.Array[String]
  
  var USD: js.Array[String]
}
object JPYRUB {
  
  @scala.inline
  def apply(JPY: js.Array[String], RUB: js.Array[String], USD: js.Array[String]): JPYRUB = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYRUB]
  }
  
  @scala.inline
  implicit class JPYRUBMutableBuilder[Self <: JPYRUB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setRUB(value: js.Array[String]): Self = StObject.set(x, "RUB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUBVarargs(value: String*): Self = StObject.set(x, "RUB", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
