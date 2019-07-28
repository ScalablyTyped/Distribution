package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Waiter extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
}

object Anon_Waiter {
  @scala.inline
  def apply($waiter: WaiterConfiguration = null): Anon_Waiter = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter)
    __obj.asInstanceOf[Anon_Waiter]
  }
}

