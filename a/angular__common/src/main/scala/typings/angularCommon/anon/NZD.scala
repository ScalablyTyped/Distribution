package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NZD extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var NZD: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object NZD {
  
  @scala.inline
  def apply(JPY: js.Array[String], NZD: js.Array[String], USD: js.Array[String]): NZD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NZD]
  }
  
  @scala.inline
  implicit class NZDMutableBuilder[Self <: NZD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setNZD(value: js.Array[String]): Self = StObject.set(x, "NZD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNZDVarargs(value: String*): Self = StObject.set(x, "NZD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
