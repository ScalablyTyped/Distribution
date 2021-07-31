package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RUB extends StObject {
  
  var JPY: js.Array[String]
  
  var RON: js.Array[js.UndefOr[String]]
  
  var RUB: js.Array[String]
  
  var USD: js.Array[String]
}
object RUB {
  
  @scala.inline
  def apply(
    JPY: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    RUB: js.Array[String],
    USD: js.Array[String]
  ): RUB = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[RUB]
  }
  
  @scala.inline
  implicit class RUBMutableBuilder[Self <: RUB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RON", js.Array(value :_*))
    
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
