package typings.adone.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainCommandInfo extends js.Object {
  var arguments: js.UndefOr[js.Array[ArgumentInfo | String]] = js.undefined
  var blindMode: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var handler: js.UndefOr[js.Function2[/* args */ js.Object, /* opts */ js.Object, Unit]] = js.undefined
  var `match`: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
  var options: js.UndefOr[js.Array[ArgumentInfo | String]] = js.undefined
  var optionsGroups: js.UndefOr[js.Array[Group]] = js.undefined
}

object MainCommandInfo {
  @scala.inline
  def apply(
    arguments: js.Array[ArgumentInfo | String] = null,
    blindMode: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    handler: (/* args */ js.Object, /* opts */ js.Object) => Unit = null,
    `match`: /* name */ String => Boolean = null,
    options: js.Array[ArgumentInfo | String] = null,
    optionsGroups: js.Array[Group] = null
  ): MainCommandInfo = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (!js.isUndefined(blindMode)) __obj.updateDynamic("blindMode")(blindMode)
    if (description != null) __obj.updateDynamic("description")(description)
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction2(handler))
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    if (options != null) __obj.updateDynamic("options")(options)
    if (optionsGroups != null) __obj.updateDynamic("optionsGroups")(optionsGroups)
    __obj.asInstanceOf[MainCommandInfo]
  }
}

