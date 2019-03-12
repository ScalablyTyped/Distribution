package typings
package adoneLib.adoneNs.templatingNs.nunjucksNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var extend: js.UndefOr[js.Function1[/* extender */ this.type, this.type]] = js.undefined
  def getSource(name: java.lang.String): LoaderSource
}

object Loader {
  @scala.inline
  def apply(
    getSource: java.lang.String => LoaderSource,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    extend: Loader => Loader = null
  ): Loader = {
    val __obj = js.Dynamic.literal(getSource = js.Any.fromFunction1(getSource))
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (extend != null) __obj.updateDynamic("extend")(js.Any.fromFunction1(extend))
    __obj.asInstanceOf[Loader]
  }
}

