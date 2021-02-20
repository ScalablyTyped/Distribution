package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TRY extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var TRY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object TRY {
  
  @scala.inline
  def apply(JPY: js.Array[String], TRY: js.Array[String], USD: js.Array[String]): TRY = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[TRY]
  }
  
  @scala.inline
  implicit class TRYMutableBuilder[Self <: TRY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setTRY(value: js.Array[String]): Self = StObject.set(x, "TRY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRYVarargs(value: String*): Self = StObject.set(x, "TRY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
