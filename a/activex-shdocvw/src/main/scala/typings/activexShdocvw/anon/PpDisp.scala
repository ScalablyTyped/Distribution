package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PpDisp extends StObject {
  
  var Cancel: Boolean = js.native
  
  var ppDisp: js.Any = js.native
}
object PpDisp {
  
  @scala.inline
  def apply(Cancel: Boolean, ppDisp: js.Any): PpDisp = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ppDisp = ppDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpDisp]
  }
  
  @scala.inline
  implicit class PpDispMutableBuilder[Self <: PpDisp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPpDisp(value: js.Any): Self = StObject.set(x, "ppDisp", value.asInstanceOf[js.Any])
  }
}
