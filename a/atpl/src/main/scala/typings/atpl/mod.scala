package typings.atpl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("atpl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(templateString: String, options: Any): js.Function1[/* context */ Any, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(templateString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* context */ Any, String]]
  
  inline def express(filename: String, options: Any, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__express")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def registerExtension(items: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerExtension")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerFilters(items: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFilters")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerFunctions(items: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFunctions")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerTags(items: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTags")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerTests(items: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTests")(items.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderFile(
    viewsPath: String,
    filename: String,
    parameters: Any,
    cache: Boolean,
    done: js.Function2[/* err */ js.Error, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(viewsPath.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderFileSync(viewsPath: String, filename: String, parameters: Any, cache: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFileSync")(viewsPath.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[String]
}
