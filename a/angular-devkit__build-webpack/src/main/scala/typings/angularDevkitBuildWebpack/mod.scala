package typings.angularDevkitBuildWebpack

import typings.angularDevkitArchitect.apiMod.BuilderContext
import typings.angularDevkitBuildWebpack.anon.DevServerConfig
import typings.angularDevkitBuildWebpack.anon.Logging
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular-devkit/build-webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runWebpack(config: Configuration, context: BuilderContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def runWebpack(config: Configuration, context: BuilderContext, options: Logging): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def runWebpackDevServer(config: Configuration, context: BuilderContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpackDevServer")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def runWebpackDevServer(config: Configuration, context: BuilderContext, options: DevServerConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpackDevServer")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}
