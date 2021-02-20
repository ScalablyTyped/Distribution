package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SEK extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var SEK: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object SEK {
  
  @scala.inline
  def apply(JPY: js.Array[String], SEK: js.Array[String], USD: js.Array[String]): SEK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SEK]
  }
  
  @scala.inline
  implicit class SEKMutableBuilder[Self <: SEK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setSEK(value: js.Array[String]): Self = StObject.set(x, "SEK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEKVarargs(value: String*): Self = StObject.set(x, "SEK", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
