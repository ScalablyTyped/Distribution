package typings
package apostropheLib.apostropheMod.apostropheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Pass in custom modules to AposModuleOptions to allow them in extend
trait AposModuleOptions[C] extends js.Object {
  var addFields: js.UndefOr[js.Array[Field]] = js.undefined
  var arrangeFields: js.UndefOr[js.Array[apostropheLib.Anon_Fields]] = js.undefined
  var beforeConstruct: js.UndefOr[js.Function2[/* self */ js.Any, /* options */ js.Any, _]] = js.undefined
  var defer: js.UndefOr[scala.Boolean] = js.undefined
  var extend: AposCoreModules | C
  var filters: js.UndefOr[apostropheLib.Anon_Key] = js.undefined
  var label: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var playerData: js.UndefOr[apostropheLib.apostropheLibNumbers.`false` | js.Array[java.lang.String]] = js.undefined
  var pluralLabel: js.UndefOr[java.lang.String] = js.undefined
  var removeFields: js.UndefOr[js.Array[Field]] = js.undefined
  var scene: js.UndefOr[apostropheLib.apostropheLibStrings.user] = js.undefined
}

object AposModuleOptions {
  @scala.inline
  def apply[C](
    extend: AposCoreModules | C,
    label: java.lang.String,
    addFields: js.Array[Field] = null,
    arrangeFields: js.Array[apostropheLib.Anon_Fields] = null,
    beforeConstruct: js.Function2[/* self */ js.Any, /* options */ js.Any, _] = null,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    filters: apostropheLib.Anon_Key = null,
    name: java.lang.String = null,
    playerData: apostropheLib.apostropheLibNumbers.`false` | js.Array[java.lang.String] = null,
    pluralLabel: java.lang.String = null,
    removeFields: js.Array[Field] = null,
    scene: apostropheLib.apostropheLibStrings.user = null
  ): AposModuleOptions[C] = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], label = label)
    if (addFields != null) __obj.updateDynamic("addFields")(addFields)
    if (arrangeFields != null) __obj.updateDynamic("arrangeFields")(arrangeFields)
    if (beforeConstruct != null) __obj.updateDynamic("beforeConstruct")(beforeConstruct)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (name != null) __obj.updateDynamic("name")(name)
    if (playerData != null) __obj.updateDynamic("playerData")(playerData.asInstanceOf[js.Any])
    if (pluralLabel != null) __obj.updateDynamic("pluralLabel")(pluralLabel)
    if (removeFields != null) __obj.updateDynamic("removeFields")(removeFields)
    if (scene != null) __obj.updateDynamic("scene")(scene)
    __obj.asInstanceOf[AposModuleOptions[C]]
  }
}

