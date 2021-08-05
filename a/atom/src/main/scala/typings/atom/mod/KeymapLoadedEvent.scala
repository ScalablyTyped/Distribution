package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeymapLoadedEvent extends StObject {
  
  /** The path of the keymap file. */
  var path: String
}
object KeymapLoadedEvent {
  
  inline def apply(path: String): KeymapLoadedEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeymapLoadedEvent]
  }
  
  extension [Self <: KeymapLoadedEvent](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
