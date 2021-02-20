package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JPYKES extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var KES: js.Array[String] = js.native
  
  var TZS: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object JPYKES {
  
  @scala.inline
  def apply(JPY: js.Array[String], KES: js.Array[String], TZS: js.Array[String], USD: js.Array[String]): JPYKES = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], TZS = TZS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYKES]
  }
  
  @scala.inline
  implicit class JPYKESMutableBuilder[Self <: JPYKES] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setKES(value: js.Array[String]): Self = StObject.set(x, "KES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKESVarargs(value: String*): Self = StObject.set(x, "KES", js.Array(value :_*))
    
    @scala.inline
    def setTZS(value: js.Array[String]): Self = StObject.set(x, "TZS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTZSVarargs(value: String*): Self = StObject.set(x, "TZS", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
