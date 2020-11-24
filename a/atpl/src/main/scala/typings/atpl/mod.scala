package typings.atpl

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atpl", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def compile(templateString: String, options: js.Any): js.Function1[/* context */ js.Any, String] = js.native
  
  @JSName("__express")
  def express(filename: String, options: js.Any, callback: js.Function): js.Any = js.native
  
  def registerExtension(items: js.Any): Unit = js.native
  
  def registerFilters(items: js.Any): Unit = js.native
  
  def registerFunctions(items: js.Any): Unit = js.native
  
  def registerTags(items: js.Any): Unit = js.native
  
  def registerTests(items: js.Any): Unit = js.native
  
  def renderFile(
    viewsPath: String,
    filename: String,
    parameters: js.Any,
    cache: Boolean,
    done: js.Function2[/* err */ Error, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
  
  def renderFileSync(viewsPath: String, filename: String, parameters: js.Any, cache: Boolean): String = js.native
}
