package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pane extends StObject {
  
  var pane: typings.atom.srcPaneMod.Pane
}
object Pane {
  
  inline def apply(pane: typings.atom.srcPaneMod.Pane): Pane = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pane]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pane] (val x: Self) extends AnyVal {
    
    inline def setPane(value: typings.atom.srcPaneMod.Pane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
  }
}
