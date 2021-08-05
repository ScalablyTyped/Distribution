package typings.atom.anon

import typings.atom.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  /** The path to the file to which the message applies. */
  var file: String
  
  /** The range of the message in the editor. */
  var position: Range
}
object File {
  
  inline def apply(file: String, position: Range): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Range): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
