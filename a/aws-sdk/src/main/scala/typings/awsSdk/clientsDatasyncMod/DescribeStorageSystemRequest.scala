package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorageSystemRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of an on-premises storage system that you're using with DataSync Discovery.
    */
  var StorageSystemArn: typings.awsSdk.clientsDatasyncMod.StorageSystemArn
}
object DescribeStorageSystemRequest {
  
  inline def apply(StorageSystemArn: StorageSystemArn): DescribeStorageSystemRequest = {
    val __obj = js.Dynamic.literal(StorageSystemArn = StorageSystemArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStorageSystemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStorageSystemRequest] (val x: Self) extends AnyVal {
    
    inline def setStorageSystemArn(value: StorageSystemArn): Self = StObject.set(x, "StorageSystemArn", value.asInstanceOf[js.Any])
  }
}
