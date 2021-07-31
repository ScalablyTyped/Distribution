package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NLG extends StObject {
  
  var JPY: js.Array[String]
  
  var NLG: js.Array[String]
  
  var RUB: js.Array[String]
  
  var USD: js.Array[String]
}
object NLG {
  
  @scala.inline
  def apply(JPY: js.Array[String], NLG: js.Array[String], RUB: js.Array[String], USD: js.Array[String]): NLG = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NLG = NLG.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NLG]
  }
  
  @scala.inline
  implicit class NLGMutableBuilder[Self <: NLG] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setNLG(value: js.Array[String]): Self = StObject.set(x, "NLG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNLGVarargs(value: String*): Self = StObject.set(x, "NLG", js.Array(value :_*))
    
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
