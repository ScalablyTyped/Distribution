package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$waiter")
  var $waiter: js.UndefOr[awsDashSdkLib.libServiceMod.WaiterConfiguration] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    $waiter: awsDashSdkLib.libServiceMod.WaiterConfiguration = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

