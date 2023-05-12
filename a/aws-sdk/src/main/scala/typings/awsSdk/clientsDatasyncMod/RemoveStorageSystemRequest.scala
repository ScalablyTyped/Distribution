package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveStorageSystemRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the storage system that you want to permanently remove from DataSync Discovery.
    */
  var StorageSystemArn: typings.awsSdk.clientsDatasyncMod.StorageSystemArn
}
object RemoveStorageSystemRequest {
  
  inline def apply(StorageSystemArn: StorageSystemArn): RemoveStorageSystemRequest = {
    val __obj = js.Dynamic.literal(StorageSystemArn = StorageSystemArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveStorageSystemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveStorageSystemRequest] (val x: Self) extends AnyVal {
    
    inline def setStorageSystemArn(value: StorageSystemArn): Self = StObject.set(x, "StorageSystemArn", value.asInstanceOf[js.Any])
  }
}
