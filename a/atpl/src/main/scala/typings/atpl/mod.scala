package typings.atpl

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("atpl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compile(templateString: String, options: js.Any): js.Function1[/* context */ js.Any, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(templateString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* context */ js.Any, String]]
  
  @scala.inline
  def express(filename: String, options: js.Any, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__express")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def registerExtension(items: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerExtension")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerFilters(items: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFilters")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerFunctions(items: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFunctions")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerTags(items: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTags")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerTests(items: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTests")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def renderFile(
    viewsPath: String,
    filename: String,
    parameters: js.Any,
    cache: Boolean,
    done: js.Function2[/* err */ Error, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(viewsPath.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def renderFileSync(viewsPath: String, filename: String, parameters: js.Any, cache: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFileSync")(viewsPath.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[String]
}
