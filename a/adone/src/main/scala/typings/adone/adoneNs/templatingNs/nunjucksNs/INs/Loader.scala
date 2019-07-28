package typings.adone.adoneNs.templatingNs.nunjucksNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var extend: js.UndefOr[js.Function1[/* extender */ this.type, this.type]] = js.undefined
  def getSource(name: String): LoaderSource
}

object Loader {
  @scala.inline
  def apply(
    getSource: String => LoaderSource,
    async: js.UndefOr[Boolean] = js.undefined,
    extend: typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader => typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader = null
  ): Loader = {
    val __obj = js.Dynamic.literal(getSource = js.Any.fromFunction1(getSource))
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (extend != null) __obj.updateDynamic("extend")(js.Any.fromFunction1(extend))
    __obj.asInstanceOf[Loader]
  }
}

