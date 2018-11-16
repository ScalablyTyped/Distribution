package typings
package atplLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atpl", JSImport.Namespace)
@js.native
object atplMod extends js.Object {
  def __express(filename: java.lang.String, options: js.Any, callback: js.Function): js.Any = js.native
  def compile(templateString: java.lang.String, options: js.Any): js.Function1[/* context */ js.Any, java.lang.String] = js.native
  def registerExtension(items: js.Any): scala.Unit = js.native
  def registerFilters(items: js.Any): scala.Unit = js.native
  def registerFunctions(items: js.Any): scala.Unit = js.native
  def registerTags(items: js.Any): scala.Unit = js.native
  def registerTests(items: js.Any): scala.Unit = js.native
  def renderFile(
    viewsPath: java.lang.String,
    filename: java.lang.String,
    parameters: js.Any,
    cache: scala.Boolean,
    done: js.Function2[/* err */ stdLib.Error, /* result */ js.UndefOr[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def renderFileSync(viewsPath: java.lang.String, filename: java.lang.String, parameters: js.Any, cache: scala.Boolean): java.lang.String = js.native
}

