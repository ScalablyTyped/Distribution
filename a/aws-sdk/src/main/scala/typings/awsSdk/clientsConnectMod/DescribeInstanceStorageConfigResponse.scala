package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceStorageConfigResponse extends StObject {
  
  /**
    * A valid storage type.
    */
  var StorageConfig: js.UndefOr[InstanceStorageConfig] = js.undefined
}
object DescribeInstanceStorageConfigResponse {
  
  inline def apply(): DescribeInstanceStorageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceStorageConfigResponse]
  }
  
  extension [Self <: DescribeInstanceStorageConfigResponse](x: Self) {
    
    inline def setStorageConfig(value: InstanceStorageConfig): Self = StObject.set(x, "StorageConfig", value.asInstanceOf[js.Any])
    
    inline def setStorageConfigUndefined: Self = StObject.set(x, "StorageConfig", js.undefined)
  }
}
