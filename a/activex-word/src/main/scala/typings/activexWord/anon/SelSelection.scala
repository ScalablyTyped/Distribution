package typings.activexWord.anon

import typings.activexWord.Word.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelSelection extends StObject {
  
  val Sel: Selection = js.native
}
object SelSelection {
  
  @scala.inline
  def apply(Sel: Selection): SelSelection = {
    val __obj = js.Dynamic.literal(Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelSelection]
  }
  
  @scala.inline
  implicit class SelSelectionMutableBuilder[Self <: SelSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSel(value: Selection): Self = StObject.set(x, "Sel", value.asInstanceOf[js.Any])
  }
}
