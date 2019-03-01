package typings
package angularDashLockerLib.angularMod.lockerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockerSettings extends js.Object {
  var driver: js.UndefOr[java.lang.String] = js.undefined
  var eventsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var extend: js.UndefOr[js.Object] = js.undefined
  var namespace: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object ILockerSettings {
  @scala.inline
  def apply(
    driver: java.lang.String = null,
    eventsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    extend: js.Object = null,
    namespace: java.lang.String | scala.Boolean = null,
    separator: java.lang.String = null
  ): ILockerSettings = {
    val __obj = js.Dynamic.literal()
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[ILockerSettings]
  }
}

