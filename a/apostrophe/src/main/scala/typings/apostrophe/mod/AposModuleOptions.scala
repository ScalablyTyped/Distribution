package typings.apostrophe.mod

import typings.apostrophe.anon.Projection
import typings.apostrophe.apostropheBooleans.`false`
import typings.apostrophe.apostropheStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Pass in custom modules to AposModuleOptions to allow them in extend
trait AposModuleOptions[C] extends js.Object {
  var addFields: js.UndefOr[js.Array[Field]] = js.undefined
  var arrangeFields: js.UndefOr[js.Array[typings.apostrophe.anon.Fields]] = js.undefined
  var beforeConstruct: js.UndefOr[js.Function2[/* self */ js.Any, /* options */ js.Any, _]] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var extend: AposCoreModules | C
  var filters: js.UndefOr[Projection] = js.undefined
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
    arrangeFields: js.Array[typings.apostrophe.anon.Fields] = null,
    beforeConstruct: (/* self */ js.Any, /* options */ js.Any) => _ = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    filters: Projection = null,
    name: String = null,
    playerData: `false` | js.Array[String] = null,
    pluralLabel: String = null,
    removeFields: js.Array[Field] = null,
    scene: user = null
  ): AposModuleOptions[C] = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (addFields != null) __obj.updateDynamic("addFields")(addFields.asInstanceOf[js.Any])
    if (arrangeFields != null) __obj.updateDynamic("arrangeFields")(arrangeFields.asInstanceOf[js.Any])
    if (beforeConstruct != null) __obj.updateDynamic("beforeConstruct")(js.Any.fromFunction2(beforeConstruct))
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (playerData != null) __obj.updateDynamic("playerData")(playerData.asInstanceOf[js.Any])
    if (pluralLabel != null) __obj.updateDynamic("pluralLabel")(pluralLabel.asInstanceOf[js.Any])
    if (removeFields != null) __obj.updateDynamic("removeFields")(removeFields.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AposModuleOptions[C]]
  }
}

