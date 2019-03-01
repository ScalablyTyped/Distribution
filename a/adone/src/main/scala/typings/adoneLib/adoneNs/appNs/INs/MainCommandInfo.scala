package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainCommandInfo extends js.Object {
  var arguments: js.UndefOr[js.Array[ArgumentInfo | java.lang.String]] = js.undefined
  var blindMode: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var handler: js.UndefOr[js.Function2[/* args */ js.Object, /* opts */ js.Object, scala.Unit]] = js.undefined
  var `match`: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Boolean]] = js.undefined
  var options: js.UndefOr[js.Array[ArgumentInfo | java.lang.String]] = js.undefined
  var optionsGroups: js.UndefOr[js.Array[Group]] = js.undefined
}

object MainCommandInfo {
  @scala.inline
  def apply(
    arguments: js.Array[ArgumentInfo | java.lang.String] = null,
    blindMode: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    handler: js.Function2[/* args */ js.Object, /* opts */ js.Object, scala.Unit] = null,
    `match`: js.Function1[/* name */ java.lang.String, scala.Boolean] = null,
    options: js.Array[ArgumentInfo | java.lang.String] = null,
    optionsGroups: js.Array[Group] = null
  ): MainCommandInfo = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (!js.isUndefined(blindMode)) __obj.updateDynamic("blindMode")(blindMode)
    if (description != null) __obj.updateDynamic("description")(description)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (options != null) __obj.updateDynamic("options")(options)
    if (optionsGroups != null) __obj.updateDynamic("optionsGroups")(optionsGroups)
    __obj.asInstanceOf[MainCommandInfo]
  }
}

