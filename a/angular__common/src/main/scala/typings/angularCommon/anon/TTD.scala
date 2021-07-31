package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TTD extends StObject {
  
  var JPY: js.Array[String]
  
  var TTD: js.Array[String]
  
  var USD: js.Array[String]
}
object TTD {
  
  @scala.inline
  def apply(JPY: js.Array[String], TTD: js.Array[String], USD: js.Array[String]): TTD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TTD = TTD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[TTD]
  }
  
  @scala.inline
  implicit class TTDMutableBuilder[Self <: TTD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setTTD(value: js.Array[String]): Self = StObject.set(x, "TTD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTTDVarargs(value: String*): Self = StObject.set(x, "TTD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
