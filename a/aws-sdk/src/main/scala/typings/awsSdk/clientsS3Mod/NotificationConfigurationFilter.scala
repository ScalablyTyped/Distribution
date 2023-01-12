package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfigurationFilter extends StObject {
  
  var Key: js.UndefOr[S3KeyFilter] = js.undefined
}
object NotificationConfigurationFilter {
  
  inline def apply(): NotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfigurationFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationConfigurationFilter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: S3KeyFilter): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
