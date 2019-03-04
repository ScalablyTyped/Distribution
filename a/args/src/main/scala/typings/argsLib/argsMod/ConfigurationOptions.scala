package typings
package argsLib.argsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationOptions extends js.Object {
  var help: js.UndefOr[scala.Boolean] = js.undefined
  var mainColor: java.lang.String | js.Array[java.lang.String]
  var minimist: js.UndefOr[MinimistOptions] = js.undefined
  var mri: MriOptions
  var name: js.UndefOr[java.lang.String] = js.undefined
  var subColor: java.lang.String | js.Array[java.lang.String]
  var usageFilter: js.UndefOr[js.Function1[/* output */ js.Any, _]] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Boolean] = js.undefined
}

object ConfigurationOptions {
  @scala.inline
  def apply(
    mainColor: java.lang.String | js.Array[java.lang.String],
    mri: MriOptions,
    subColor: java.lang.String | js.Array[java.lang.String],
    help: js.UndefOr[scala.Boolean] = js.undefined,
    minimist: MinimistOptions = null,
    name: java.lang.String = null,
    usageFilter: js.Function1[/* output */ js.Any, _] = null,
    value: java.lang.String = null,
    version: js.UndefOr[scala.Boolean] = js.undefined
  ): ConfigurationOptions = {
    val __obj = js.Dynamic.literal(mainColor = mainColor.asInstanceOf[js.Any], mri = mri, subColor = subColor.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help)
    if (minimist != null) __obj.updateDynamic("minimist")(minimist)
    if (name != null) __obj.updateDynamic("name")(name)
    if (usageFilter != null) __obj.updateDynamic("usageFilter")(usageFilter)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ConfigurationOptions]
  }
}

