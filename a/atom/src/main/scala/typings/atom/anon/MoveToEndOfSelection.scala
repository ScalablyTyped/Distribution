package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveToEndOfSelection extends StObject {
  
  var moveToEndOfSelection: js.UndefOr[Boolean] = js.undefined
}
object MoveToEndOfSelection {
  
  inline def apply(): MoveToEndOfSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToEndOfSelection]
  }
  
  extension [Self <: MoveToEndOfSelection](x: Self) {
    
    inline def setMoveToEndOfSelection(value: Boolean): Self = StObject.set(x, "moveToEndOfSelection", value.asInstanceOf[js.Any])
    
    inline def setMoveToEndOfSelectionUndefined: Self = StObject.set(x, "moveToEndOfSelection", js.undefined)
  }
}
