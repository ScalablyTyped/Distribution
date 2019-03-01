package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Waiter extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[awsDashSdkLib.libServiceMod.WaiterConfiguration] = js.undefined
}

object Anon_Waiter {
  @scala.inline
  def apply($waiter: awsDashSdkLib.libServiceMod.WaiterConfiguration = null): Anon_Waiter = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter)
    __obj.asInstanceOf[Anon_Waiter]
  }
}

