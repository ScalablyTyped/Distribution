package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XCD extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
  
  var XCD: js.Array[String] = js.native
}
object XCD {
  
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], XCD: js.Array[String]): XCD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[XCD]
  }
  
  @scala.inline
  implicit class XCDMutableBuilder[Self <: XCD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    @scala.inline
    def setXCD(value: js.Array[String]): Self = StObject.set(x, "XCD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCDVarargs(value: String*): Self = StObject.set(x, "XCD", js.Array(value :_*))
  }
}
