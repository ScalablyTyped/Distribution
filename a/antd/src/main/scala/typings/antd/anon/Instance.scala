package typings.antd.anon

import typings.rcNotification.esNotificationMod.NotificationInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  var instance: NotificationInstance
  
  var prefixCls: String
}
object Instance {
  
  inline def apply(instance: NotificationInstance, prefixCls: String): Instance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    inline def setInstance(value: NotificationInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
