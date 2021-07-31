package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SLL extends StObject {
  
  var JPY: js.Array[String]
  
  var SLL: js.Array[String]
  
  var USD: js.Array[String]
}
object SLL {
  
  @scala.inline
  def apply(JPY: js.Array[String], SLL: js.Array[String], USD: js.Array[String]): SLL = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SLL = SLL.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SLL]
  }
  
  @scala.inline
  implicit class SLLMutableBuilder[Self <: SLL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setSLL(value: js.Array[String]): Self = StObject.set(x, "SLL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSLLVarargs(value: String*): Self = StObject.set(x, "SLL", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
