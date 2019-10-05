package typings.angularDashLocker.angularMod.locker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockerSettings extends js.Object {
  var driver: js.UndefOr[String] = js.undefined
  var eventsEnabled: js.UndefOr[Boolean] = js.undefined
  var extend: js.UndefOr[js.Object] = js.undefined
  var namespace: js.UndefOr[String | Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object ILockerSettings {
  @scala.inline
  def apply(
    driver: String = null,
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    extend: js.Object = null,
    namespace: String | Boolean = null,
    separator: String = null
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

