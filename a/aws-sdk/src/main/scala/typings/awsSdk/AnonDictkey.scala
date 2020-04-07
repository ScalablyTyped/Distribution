package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
}

object AnonDictkey {
  @scala.inline
  def apply($waiter: WaiterConfiguration = null, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}

