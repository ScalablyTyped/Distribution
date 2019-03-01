package typings
package angularDashLocalforageLib.angularMod.localForageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalForageConfig extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var driver: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var storeName: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object LocalForageConfig {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    driver: java.lang.String = null,
    name: java.lang.String | scala.Double = null,
    storeName: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): LocalForageConfig = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalForageConfig]
  }
}

