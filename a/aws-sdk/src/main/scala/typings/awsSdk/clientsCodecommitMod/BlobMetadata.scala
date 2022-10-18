package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobMetadata extends StObject {
  
  /**
    * The full ID of the blob.
    */
  var blobId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The file mode permissions of the blob. File mode permission codes include:    100644 indicates read/write    100755 indicates read/write/execute    160000 indicates a submodule    120000 indicates a symlink  
    */
  var mode: js.UndefOr[Mode] = js.undefined
  
  /**
    * The path to the blob and associated file name, if any.
    */
  var path: js.UndefOr[Path] = js.undefined
}
object BlobMetadata {
  
  inline def apply(): BlobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobMetadata]
  }
  
  extension [Self <: BlobMetadata](x: Self) {
    
    inline def setBlobId(value: ObjectId): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    inline def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
    
    inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
