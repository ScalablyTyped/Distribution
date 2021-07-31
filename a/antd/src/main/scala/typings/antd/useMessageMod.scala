package typings.antd

import typings.antd.anon.Instance
import typings.antd.messageMod.ArgsProps
import typings.antd.messageMod.MessageInstance
import typings.rcNotification.notificationMod.NoticeContent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMessageMod {
  
  @JSImport("antd/lib/message/hooks/useMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    getRcNotificationInstance: js.Function2[/* args */ ArgsProps, /* callback */ js.Function1[/* info */ Instance, Unit], Unit],
    getRCNoticeProps: js.Function2[/* args */ ArgsProps, /* prefixCls */ String, NoticeContent]
  ): js.Function0[js.Tuple2[MessageInstance, ReactElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getRcNotificationInstance.asInstanceOf[js.Any], getRCNoticeProps.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Tuple2[MessageInstance, ReactElement]]]
}
