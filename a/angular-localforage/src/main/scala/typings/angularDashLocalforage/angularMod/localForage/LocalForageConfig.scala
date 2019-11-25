package typings.angularDashLocalforage.angularMod.localForage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalForageConfig extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var driver: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String | Double] = js.undefined
  var storeName: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object LocalForageConfig {
  @scala.inline
  def apply(
    description: String = null,
    driver: String = null,
    name: String | Double = null,
    storeName: String = null,
    version: Int | Double = null
  ): LocalForageConfig = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalForageConfig]
  }
}

