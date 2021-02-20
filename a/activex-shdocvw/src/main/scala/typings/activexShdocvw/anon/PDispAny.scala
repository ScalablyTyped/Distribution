package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDispAny extends StObject {
  
  val pDisp: js.Any = js.native
}
object PDispAny {
  
  @scala.inline
  def apply(pDisp: js.Any): PDispAny = {
    val __obj = js.Dynamic.literal(pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDispAny]
  }
  
  @scala.inline
  implicit class PDispAnyMutableBuilder[Self <: PDispAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPDisp(value: js.Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
  }
}
