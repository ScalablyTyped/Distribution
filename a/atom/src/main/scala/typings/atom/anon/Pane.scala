package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pane extends StObject {
  
  var pane: typings.atom.mod.Pane
}
object Pane {
  
  inline def apply(pane: typings.atom.mod.Pane): Pane = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pane]
  }
  
  extension [Self <: Pane](x: Self) {
    
    inline def setPane(value: typings.atom.mod.Pane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
  }
}
