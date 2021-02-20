package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GHSNGN extends StObject {
  
  var GHS: js.Array[String] = js.native
  
  var NGN: js.Array[String] = js.native
}
object GHSNGN {
  
  @scala.inline
  def apply(GHS: js.Array[String], NGN: js.Array[String]): GHSNGN = {
    val __obj = js.Dynamic.literal(GHS = GHS.asInstanceOf[js.Any], NGN = NGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GHSNGN]
  }
  
  @scala.inline
  implicit class GHSNGNMutableBuilder[Self <: GHSNGN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGHS(value: js.Array[String]): Self = StObject.set(x, "GHS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGHSVarargs(value: String*): Self = StObject.set(x, "GHS", js.Array(value :_*))
    
    @scala.inline
    def setNGN(value: js.Array[String]): Self = StObject.set(x, "NGN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNGNVarargs(value: String*): Self = StObject.set(x, "NGN", js.Array(value :_*))
  }
}
