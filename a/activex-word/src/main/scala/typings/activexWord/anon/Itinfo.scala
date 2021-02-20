package typings.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Itinfo extends StObject {
  
  val itinfo: Double = js.native
  
  val lcid: Double = js.native
  
  var pptinfo: js.UndefOr[scala.Nothing] = js.native
}
object Itinfo {
  
  @scala.inline
  def apply(itinfo: Double, lcid: Double): Itinfo = {
    val __obj = js.Dynamic.literal(itinfo = itinfo.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itinfo]
  }
  
  @scala.inline
  implicit class ItinfoMutableBuilder[Self <: Itinfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItinfo(value: Double): Self = StObject.set(x, "itinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
  }
}
