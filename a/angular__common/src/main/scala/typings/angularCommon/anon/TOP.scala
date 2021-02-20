package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TOP extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var TOP: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object TOP {
  
  @scala.inline
  def apply(JPY: js.Array[String], TOP: js.Array[String], USD: js.Array[String]): TOP = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[TOP]
  }
  
  @scala.inline
  implicit class TOPMutableBuilder[Self <: TOP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setTOP(value: js.Array[String]): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOPVarargs(value: String*): Self = StObject.set(x, "TOP", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
