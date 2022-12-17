package typings.angularDevkitBuildWebpack

import typings.angularDevkitArchitect.srcApiMod.BuilderContext
import typings.angularDevkitBuildWebpack.anon.DevServerConfig
import typings.angularDevkitBuildWebpack.anon.Logging
import typings.angularDevkitBuildWebpack.srcWebpackDevServerMod.DevServerBuildOutput
import typings.angularDevkitBuildWebpack.srcWebpackMod.BuildResult
import typings.rxjs.mod.Observable_
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular-devkit/build-webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runWebpack(config: Configuration, context: BuilderContext): Observable_[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuildResult]]
  inline def runWebpack(config: Configuration, context: BuilderContext, options: Logging): Observable_[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuildResult]]
  
  inline def runWebpackDevServer(config: Configuration, context: BuilderContext): Observable_[DevServerBuildOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpackDevServer")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[DevServerBuildOutput]]
  inline def runWebpackDevServer(config: Configuration, context: BuilderContext, options: DevServerConfig): Observable_[DevServerBuildOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpackDevServer")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable_[DevServerBuildOutput]]
}
