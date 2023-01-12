package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileShareInfo extends StObject {
  
  var FileShareARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileShareARN] = js.undefined
  
  var FileShareId: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileShareId] = js.undefined
  
  var FileShareStatus: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileShareStatus] = js.undefined
  
  var FileShareType: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileShareType] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object FileShareInfo {
  
  inline def apply(): FileShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileShareInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileShareInfo] (val x: Self) extends AnyVal {
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
    
    inline def setFileShareId(value: FileShareId): Self = StObject.set(x, "FileShareId", value.asInstanceOf[js.Any])
    
    inline def setFileShareIdUndefined: Self = StObject.set(x, "FileShareId", js.undefined)
    
    inline def setFileShareStatus(value: FileShareStatus): Self = StObject.set(x, "FileShareStatus", value.asInstanceOf[js.Any])
    
    inline def setFileShareStatusUndefined: Self = StObject.set(x, "FileShareStatus", js.undefined)
    
    inline def setFileShareType(value: FileShareType): Self = StObject.set(x, "FileShareType", value.asInstanceOf[js.Any])
    
    inline def setFileShareTypeUndefined: Self = StObject.set(x, "FileShareType", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
