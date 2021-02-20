package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDisp extends StObject {
  
  val URL: js.Any = js.native
  
  val pDisp: js.Any = js.native
}
object PDisp {
  
  @scala.inline
  def apply(URL: js.Any, pDisp: js.Any): PDisp = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDisp]
  }
  
  @scala.inline
  implicit class PDispMutableBuilder[Self <: PDisp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPDisp(value: js.Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: js.Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
