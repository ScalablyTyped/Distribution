package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileBatchJobIdentifier extends StObject {
  
  /**
    * The file name for the batch job identifier.
    */
  var fileName: String
  
  /**
    * The relative path to the file name for the batch job identifier.
    */
  var folderPath: js.UndefOr[String] = js.undefined
}
object FileBatchJobIdentifier {
  
  inline def apply(fileName: String): FileBatchJobIdentifier = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBatchJobIdentifier]
  }
  
  extension [Self <: FileBatchJobIdentifier](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFolderPath(value: String): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
    
    inline def setFolderPathUndefined: Self = StObject.set(x, "folderPath", js.undefined)
  }
}
