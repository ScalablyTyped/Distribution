package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region iBeacon https://docs.alipay.com/mini/api/yqleyc
trait StartBeaconDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_StartBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.undefined
  /**
  		 * iBeacon设备广播的 uuids
  		 */
  var uuids: js.Array[String]
}

object StartBeaconDiscoveryOptions {
  @scala.inline
  def apply(
    uuids: js.Array[String],
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ ErrMsgResponse => Unit = null
  ): StartBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal(uuids = uuids)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[StartBeaconDiscoveryOptions]
  }
}

