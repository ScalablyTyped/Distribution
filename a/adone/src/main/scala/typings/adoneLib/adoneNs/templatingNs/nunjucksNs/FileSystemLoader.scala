package typings
package adoneLib.adoneNs.templatingNs.nunjucksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- adoneLib.adoneNs.templatingNs.nunjucksNs.INs.Loader because var conflicts: extend. Inlined async, getSource */ @JSGlobal("adone.templating.nunjucks.FileSystemLoader")
@js.native
class FileSystemLoader () extends Loader {
  def this(searchPaths: java.lang.String) = this()
  def this(searchPaths: js.Array[java.lang.String]) = this()
  def this(searchPaths: java.lang.String, opts: adoneLib.adoneNs.templatingNs.nunjucksNs.INs.FileSystemLoaderOptions) = this()
  def this(searchPaths: js.Array[java.lang.String], opts: adoneLib.adoneNs.templatingNs.nunjucksNs.INs.FileSystemLoaderOptions) = this()
  var async: js.UndefOr[scala.Boolean] = js.native
  def getSource(name: java.lang.String): adoneLib.adoneNs.templatingNs.nunjucksNs.INs.LoaderSource = js.native
}

