package typings.atpl

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("atpl", "compile")
  @js.native
  def compile(templateString: String, options: js.Any): js.Function1[/* context */ js.Any, String] = js.native
  
  @JSImport("atpl", "__express")
  @js.native
  def express(filename: String, options: js.Any, callback: js.Function): js.Any = js.native
  
  @JSImport("atpl", "registerExtension")
  @js.native
  def registerExtension(items: js.Any): Unit = js.native
  
  @JSImport("atpl", "registerFilters")
  @js.native
  def registerFilters(items: js.Any): Unit = js.native
  
  @JSImport("atpl", "registerFunctions")
  @js.native
  def registerFunctions(items: js.Any): Unit = js.native
  
  @JSImport("atpl", "registerTags")
  @js.native
  def registerTags(items: js.Any): Unit = js.native
  
  @JSImport("atpl", "registerTests")
  @js.native
  def registerTests(items: js.Any): Unit = js.native
  
  @JSImport("atpl", "renderFile")
  @js.native
  def renderFile(
    viewsPath: String,
    filename: String,
    parameters: js.Any,
    cache: Boolean,
    done: js.Function2[/* err */ Error, /* result */ js.UndefOr[String], Unit]
  ): Unit = js.native
  
  @JSImport("atpl", "renderFileSync")
  @js.native
  def renderFileSync(viewsPath: String, filename: String, parameters: js.Any, cache: Boolean): String = js.native
}
