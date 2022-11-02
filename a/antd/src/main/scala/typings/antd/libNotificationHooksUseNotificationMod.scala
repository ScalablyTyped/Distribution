package typings.antd

import typings.antd.anon.Instance
import typings.antd.libNotificationMod.ArgsProps
import typings.antd.libNotificationMod.NotificationInstance
import typings.rcNotification.esNotificationMod.NoticeContent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNotificationHooksUseNotificationMod {
  
  @JSImport("antd/lib/notification/hooks/useNotification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    getNotificationInstance: js.Function2[/* args */ ArgsProps, /* callback */ js.Function1[/* info */ Instance, Unit], Unit],
    getRCNoticeProps: js.Function2[/* args */ ArgsProps, /* prefixCls */ String, NoticeContent]
  ): js.Function0[js.Tuple2[NotificationInstance, ReactElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getNotificationInstance.asInstanceOf[js.Any], getRCNoticeProps.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Tuple2[NotificationInstance, ReactElement]]]
}
