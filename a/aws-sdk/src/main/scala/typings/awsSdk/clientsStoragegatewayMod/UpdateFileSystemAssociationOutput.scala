package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFileSystemAssociationOutput extends StObject {
  
  /**
    * The ARN of the updated file system association.
    */
  var FileSystemAssociationARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileSystemAssociationARN] = js.undefined
}
object UpdateFileSystemAssociationOutput {
  
  inline def apply(): UpdateFileSystemAssociationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileSystemAssociationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFileSystemAssociationOutput] (val x: Self) extends AnyVal {
    
    inline def setFileSystemAssociationARN(value: FileSystemAssociationARN): Self = StObject.set(x, "FileSystemAssociationARN", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAssociationARNUndefined: Self = StObject.set(x, "FileSystemAssociationARN", js.undefined)
  }
}
