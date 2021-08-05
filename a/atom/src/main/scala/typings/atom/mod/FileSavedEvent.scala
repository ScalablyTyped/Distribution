package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSavedEvent extends StObject {
  
  /** The path to which the buffer was saved. */
  var path: String
}
object FileSavedEvent {
  
  inline def apply(path: String): FileSavedEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSavedEvent]
  }
  
  extension [Self <: FileSavedEvent](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
