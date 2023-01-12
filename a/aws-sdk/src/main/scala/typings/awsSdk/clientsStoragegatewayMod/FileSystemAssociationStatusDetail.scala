package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemAssociationStatusDetail extends StObject {
  
  /**
    * The error code for a given file system association status.
    */
  var ErrorCode: js.UndefOr[FileSystemAssociationSyncErrorCode] = js.undefined
}
object FileSystemAssociationStatusDetail {
  
  inline def apply(): FileSystemAssociationStatusDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemAssociationStatusDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemAssociationStatusDetail] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: FileSystemAssociationSyncErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
  }
}
