package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeymapLoadedEvent extends StObject {
  
  /** The path of the keymap file. */
  var path: String = js.native
}
object KeymapLoadedEvent {
  
  @scala.inline
  def apply(path: String): KeymapLoadedEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeymapLoadedEvent]
  }
  
  @scala.inline
  implicit class KeymapLoadedEventMutableBuilder[Self <: KeymapLoadedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
