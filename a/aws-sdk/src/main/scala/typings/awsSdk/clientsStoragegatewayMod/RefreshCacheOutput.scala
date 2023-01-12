package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshCacheOutput extends StObject {
  
  var FileShareARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileShareARN] = js.undefined
  
  var NotificationId: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.NotificationId] = js.undefined
}
object RefreshCacheOutput {
  
  inline def apply(): RefreshCacheOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshCacheOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshCacheOutput] (val x: Self) extends AnyVal {
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
    
    inline def setNotificationId(value: NotificationId): Self = StObject.set(x, "NotificationId", value.asInstanceOf[js.Any])
    
    inline def setNotificationIdUndefined: Self = StObject.set(x, "NotificationId", js.undefined)
  }
}
