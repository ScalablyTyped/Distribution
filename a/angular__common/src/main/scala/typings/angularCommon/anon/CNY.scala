package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CNY extends StObject {
  
  var CNY: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object CNY {
  
  @scala.inline
  def apply(CNY: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): CNY = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNY]
  }
  
  @scala.inline
  implicit class CNYMutableBuilder[Self <: CNY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCNY(value: js.Array[String]): Self = StObject.set(x, "CNY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCNYVarargs(value: String*): Self = StObject.set(x, "CNY", js.Array(value :_*))
    
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
