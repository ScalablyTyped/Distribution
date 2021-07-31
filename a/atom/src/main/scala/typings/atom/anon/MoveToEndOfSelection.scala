package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveToEndOfSelection extends StObject {
  
  var moveToEndOfSelection: js.UndefOr[Boolean] = js.undefined
}
object MoveToEndOfSelection {
  
  @scala.inline
  def apply(): MoveToEndOfSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToEndOfSelection]
  }
  
  @scala.inline
  implicit class MoveToEndOfSelectionMutableBuilder[Self <: MoveToEndOfSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMoveToEndOfSelection(value: Boolean): Self = StObject.set(x, "moveToEndOfSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveToEndOfSelectionUndefined: Self = StObject.set(x, "moveToEndOfSelection", js.undefined)
  }
}
