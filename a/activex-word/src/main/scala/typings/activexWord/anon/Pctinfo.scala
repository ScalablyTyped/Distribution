package typings.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pctinfo extends StObject {
  
  var pctinfo: Double = js.native
}
object Pctinfo {
  
  @scala.inline
  def apply(pctinfo: Double): Pctinfo = {
    val __obj = js.Dynamic.literal(pctinfo = pctinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pctinfo]
  }
  
  @scala.inline
  implicit class PctinfoMutableBuilder[Self <: Pctinfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPctinfo(value: Double): Self = StObject.set(x, "pctinfo", value.asInstanceOf[js.Any])
  }
}
