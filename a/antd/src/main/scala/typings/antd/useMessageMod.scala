package typings.antd

import typings.antd.anon.Instance
import typings.antd.messageMod.ArgsProps
import typings.antd.messageMod.MessageInstance
import typings.rcNotification.notificationMod.NoticeContent
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/message/hooks/useMessage", JSImport.Namespace)
@js.native
object useMessageMod extends js.Object {
  def default(
    getRcNotificationInstance: js.Function2[/* args */ ArgsProps, /* callback */ js.Function1[/* info */ Instance, Unit], Unit],
    getRCNoticeProps: js.Function2[/* args */ ArgsProps, /* prefixCls */ String, NoticeContent]
  ): js.Function0[js.Tuple2[MessageInstance, ReactElement]] = js.native
}

