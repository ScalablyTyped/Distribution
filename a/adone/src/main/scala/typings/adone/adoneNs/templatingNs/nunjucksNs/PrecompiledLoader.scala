package typings.adone.adoneNs.templatingNs.nunjucksNs

import typings.adone.adoneNs.templatingNs.nunjucksNs.INs.LoaderSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader because var conflicts: extend. Inlined async, getSource */ @JSGlobal("adone.templating.nunjucks.PrecompiledLoader")
@js.native
class PrecompiledLoader () extends Loader {
  var async: js.UndefOr[Boolean] = js.native
  def getSource(name: String): LoaderSource = js.native
}

