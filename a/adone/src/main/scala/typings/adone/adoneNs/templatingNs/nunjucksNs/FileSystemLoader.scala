package typings.adone.adoneNs.templatingNs.nunjucksNs

import typings.adone.adoneNs.templatingNs.nunjucksNs.INs.FileSystemLoaderOptions
import typings.adone.adoneNs.templatingNs.nunjucksNs.INs.LoaderSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader because var conflicts: extend. Inlined async, getSource */ @JSGlobal("adone.templating.nunjucks.FileSystemLoader")
@js.native
class FileSystemLoader () extends Loader {
  def this(searchPaths: String) = this()
  def this(searchPaths: js.Array[String]) = this()
  def this(searchPaths: String, opts: FileSystemLoaderOptions) = this()
  def this(searchPaths: js.Array[String], opts: FileSystemLoaderOptions) = this()
  var async: js.UndefOr[Boolean] = js.native
  def getSource(name: String): LoaderSource = js.native
}

