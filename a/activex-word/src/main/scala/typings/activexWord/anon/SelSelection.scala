package typings.activexWord.anon

import typings.activexWord.Word.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelSelection extends StObject {
  
  val Sel: Selection
}
object SelSelection {
  
  inline def apply(Sel: Selection): SelSelection = {
    val __obj = js.Dynamic.literal(Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelSelection]
  }
  
  extension [Self <: SelSelection](x: Self) {
    
    inline def setSel(value: Selection): Self = StObject.set(x, "Sel", value.asInstanceOf[js.Any])
  }
}
