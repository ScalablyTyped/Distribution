package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JMD extends StObject {
  
  var JMD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object JMD {
  
  @scala.inline
  def apply(JMD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): JMD = {
    val __obj = js.Dynamic.literal(JMD = JMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JMD]
  }
  
  @scala.inline
  implicit class JMDMutableBuilder[Self <: JMD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJMD(value: js.Array[String]): Self = StObject.set(x, "JMD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJMDVarargs(value: String*): Self = StObject.set(x, "JMD", js.Array(value :_*))
    
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
