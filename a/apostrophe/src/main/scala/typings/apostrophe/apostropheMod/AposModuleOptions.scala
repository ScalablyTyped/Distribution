package typings.apostrophe.apostropheMod

import typings.apostrophe.Anon_Fields
import typings.apostrophe.Anon_Key
import typings.apostrophe.apostropheNumbers.`false`
import typings.apostrophe.apostropheStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Pass in custom modules to AposModuleOptions to allow them in extend
trait AposModuleOptions[C] extends js.Object {
  var addFields: js.UndefOr[js.Array[Field]] = js.undefined
  var arrangeFields: js.UndefOr[js.Array[Anon_Fields]] = js.undefined
  var beforeConstruct: js.UndefOr[js.Function2[/* self */ js.Any, /* options */ js.Any, _]] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var extend: AposCoreModules | C
  var filters: js.UndefOr[Anon_Key] = js.undefined
  var label: String
  var name: js.UndefOr[String] = js.undefined
  var playerData: js.UndefOr[`false` | js.Array[String]] = js.undefined
  var pluralLabel: js.UndefOr[String] = js.undefined
  var removeFields: js.UndefOr[js.Array[Field]] = js.undefined
  var scene: js.UndefOr[user] = js.undefined
}

object AposModuleOptions {
  @scala.inline
  def apply[C](
    extend: AposCoreModules | C,
    label: String,
    addFields: js.Array[Field] = null,
    arrangeFields: js.Array[Anon_Fields] = null,
    beforeConstruct: (/* self */ js.Any, /* options */ js.Any) => _ = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    filters: Anon_Key = null,
    name: String = null,
    playerData: `false` | js.Array[String] = null,
    pluralLabel: String = null,
    removeFields: js.Array[Field] = null,
    scene: user = null
  ): AposModuleOptions[C] = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], label = label)
    if (addFields != null) __obj.updateDynamic("addFields")(addFields)
    if (arrangeFields != null) __obj.updateDynamic("arrangeFields")(arrangeFields)
    if (beforeConstruct != null) __obj.updateDynamic("beforeConstruct")(js.Any.fromFunction2(beforeConstruct))
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

