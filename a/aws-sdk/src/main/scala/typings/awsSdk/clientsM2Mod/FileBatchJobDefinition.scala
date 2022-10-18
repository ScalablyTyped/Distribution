package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileBatchJobDefinition extends StObject {
  
  /**
    * The name of the file containing the batch job definition.
    */
  var fileName: String
  
  /**
    * The path to the file containing the batch job definition.
    */
  var folderPath: js.UndefOr[String] = js.undefined
}
object FileBatchJobDefinition {
  
  inline def apply(fileName: String): FileBatchJobDefinition = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBatchJobDefinition]
  }
  
  extension [Self <: FileBatchJobDefinition](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFolderPath(value: String): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
    
    inline def setFolderPathUndefined: Self = StObject.set(x, "folderPath", js.undefined)
  }
}
