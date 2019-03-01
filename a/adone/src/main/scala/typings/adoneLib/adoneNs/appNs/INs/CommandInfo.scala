package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandInfo extends MainCommandInfo {
  var group: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object CommandInfo {
  @scala.inline
  def apply(
    arguments: js.Array[ArgumentInfo | java.lang.String] = null,
    blindMode: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    group: java.lang.String = null,
    handler: js.Function2[/* args */ js.Object, /* opts */ js.Object, scala.Unit] = null,
    `match`: js.Function1[/* name */ java.lang.String, scala.Boolean] = null,
    name: java.lang.String | js.Array[java.lang.String] = null,
    options: js.Array[ArgumentInfo | java.lang.String] = null,
    optionsGroups: js.Array[Group] = null
  ): CommandInfo = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (!js.isUndefined(blindMode)) __obj.updateDynamic("blindMode")(blindMode)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (optionsGroups != null) __obj.updateDynamic("optionsGroups")(optionsGroups)
    __obj.asInstanceOf[CommandInfo]
  }
}

