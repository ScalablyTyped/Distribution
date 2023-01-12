package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileEntry extends StObject {
  
  /**
    * The full path of the file to be deleted, including the name of the file.
    */
  var filePath: Path
}
object DeleteFileEntry {
  
  inline def apply(filePath: Path): DeleteFileEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFileEntry] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
