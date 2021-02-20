package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PGK extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var PGK: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object PGK {
  
  @scala.inline
  def apply(JPY: js.Array[String], PGK: js.Array[String], USD: js.Array[String]): PGK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PGK = PGK.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PGK]
  }
  
  @scala.inline
  implicit class PGKMutableBuilder[Self <: PGK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setPGK(value: js.Array[String]): Self = StObject.set(x, "PGK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPGKVarargs(value: String*): Self = StObject.set(x, "PGK", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
