package typings.adone.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandInfo extends MainCommandInfo {
  var group: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String | js.Array[String]] = js.undefined
}

object CommandInfo {
  @scala.inline
  def apply(
    arguments: js.Array[ArgumentInfo | String] = null,
    blindMode: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    group: String = null,
    handler: (/* args */ js.Object, /* opts */ js.Object) => Unit = null,
    `match`: /* name */ String => Boolean = null,
    name: String | js.Array[String] = null,
    options: js.Array[ArgumentInfo | String] = null,
    optionsGroups: js.Array[Group] = null
  ): CommandInfo = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (!js.isUndefined(blindMode)) __obj.updateDynamic("blindMode")(blindMode)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction2(handler))
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (optionsGroups != null) __obj.updateDynamic("optionsGroups")(optionsGroups)
    __obj.asInstanceOf[CommandInfo]
  }
}

