package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUR extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var MUR: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object MUR {
  
  @scala.inline
  def apply(JPY: js.Array[String], MUR: js.Array[String], USD: js.Array[String]): MUR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MUR = MUR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUR]
  }
  
  @scala.inline
  implicit class MURMutableBuilder[Self <: MUR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setMUR(value: js.Array[String]): Self = StObject.set(x, "MUR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMURVarargs(value: String*): Self = StObject.set(x, "MUR", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
