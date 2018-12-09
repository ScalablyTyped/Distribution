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

