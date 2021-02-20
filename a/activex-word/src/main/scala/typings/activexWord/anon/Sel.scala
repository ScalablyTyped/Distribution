package typings.activexWord.anon

import typings.activexWord.Word.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sel extends StObject {
  
  var Cancel: Boolean = js.native
  
  val Sel: Selection = js.native
}
object Sel {
  
  @scala.inline
  def apply(Cancel: Boolean, Sel: Selection): Sel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sel]
  }
  
  @scala.inline
  implicit class SelMutableBuilder[Self <: Sel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSel(value: Selection): Self = StObject.set(x, "Sel", value.asInstanceOf[js.Any])
  }
}
