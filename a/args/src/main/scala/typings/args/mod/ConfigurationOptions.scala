package typings.args.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationOptions extends js.Object {
  var help: js.UndefOr[Boolean] = js.undefined
  var mainColor: String | js.Array[String]
  var minimist: js.UndefOr[MinimistOptions] = js.undefined
  var mri: MriOptions
  var name: js.UndefOr[String] = js.undefined
  var subColor: String | js.Array[String]
  var usageFilter: js.UndefOr[js.Function1[/* output */ js.Any, _]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Boolean] = js.undefined
}

object ConfigurationOptions {
  @scala.inline
  def apply(
    mainColor: String | js.Array[String],
    mri: MriOptions,
    subColor: String | js.Array[String],
    help: js.UndefOr[Boolean] = js.undefined,
    minimist: MinimistOptions = null,
    name: String = null,
    usageFilter: /* output */ js.Any => _ = null,
    value: String = null,
    version: js.UndefOr[Boolean] = js.undefined
  ): ConfigurationOptions = {
    val __obj = js.Dynamic.literal(mainColor = mainColor.asInstanceOf[js.Any], mri = mri.asInstanceOf[js.Any], subColor = subColor.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (minimist != null) __obj.updateDynamic("minimist")(minimist.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (usageFilter != null) __obj.updateDynamic("usageFilter")(js.Any.fromFunction1(usageFilter))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptions]
  }
}

