package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZAR extends StObject {
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
  
  var ZAR: js.Array[String]
}
object ZAR {
  
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], ZAR: js.Array[String]): ZAR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZAR]
  }
  
  @scala.inline
  implicit class ZARMutableBuilder[Self <: ZAR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    @scala.inline
    def setZAR(value: js.Array[String]): Self = StObject.set(x, "ZAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZARVarargs(value: String*): Self = StObject.set(x, "ZAR", js.Array(value :_*))
  }
}
