package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddStorageSystemResponse extends StObject {
  
  /**
    * The ARN of the on-premises storage system that you can use with DataSync Discovery.
    */
  var StorageSystemArn: typings.awsSdk.clientsDatasyncMod.StorageSystemArn
}
object AddStorageSystemResponse {
  
  inline def apply(StorageSystemArn: StorageSystemArn): AddStorageSystemResponse = {
    val __obj = js.Dynamic.literal(StorageSystemArn = StorageSystemArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddStorageSystemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddStorageSystemResponse] (val x: Self) extends AnyVal {
    
    inline def setStorageSystemArn(value: StorageSystemArn): Self = StObject.set(x, "StorageSystemArn", value.asInstanceOf[js.Any])
  }
}
