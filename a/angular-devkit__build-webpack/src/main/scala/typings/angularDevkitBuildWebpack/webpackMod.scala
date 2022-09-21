package typings.angularDevkitBuildWebpack

import typings.angularDevkitArchitect.apiMod.BuilderContext
import typings.angularDevkitArchitect.apiMod.BuilderOutput
import typings.angularDevkitArchitect.internalMod.Builder
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackMod.EmittedFiles
import typings.angularDevkitBuildWebpack.anon.Logging
import typings.angularDevkitBuildWebpack.utilsMod.JsonObject
import typings.angularDevkitBuildWebpack.webpackSchemaMod.Schema
import typings.webpack.mod.Compiler
import typings.webpack.mod.Configuration
import typings.webpack.mod.Stats
import typings.webpack.mod.StatsCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackMod {
  
  @JSImport("@angular-devkit/build-webpack/src/webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-webpack/src/webpack", JSImport.Default)
  @js.native
  val default: Builder[Schema & JsonObject] = js.native
  
  inline def runWebpack(config: Configuration, context: BuilderContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def runWebpack(config: Configuration, context: BuilderContext, options: Logging): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait BuildResult
    extends StObject
       with BuilderOutput {
    
    var emittedFiles: js.UndefOr[js.Array[EmittedFiles]] = js.undefined
    
    var outputPath: String
    
    var webpackStats: js.UndefOr[StatsCompilation] = js.undefined
  }
  object BuildResult {
    
    inline def apply(outputPath: String, success: Boolean): BuildResult = {
      val __obj = js.Dynamic.literal(outputPath = outputPath.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildResult]
    }
    
    extension [Self <: BuildResult](x: Self) {
      
      inline def setEmittedFiles(value: js.Array[EmittedFiles]): Self = StObject.set(x, "emittedFiles", value.asInstanceOf[js.Any])
      
      inline def setEmittedFilesUndefined: Self = StObject.set(x, "emittedFiles", js.undefined)
      
      inline def setEmittedFilesVarargs(value: EmittedFiles*): Self = StObject.set(x, "emittedFiles", js.Array(value*))
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setWebpackStats(value: StatsCompilation): Self = StObject.set(x, "webpackStats", value.asInstanceOf[js.Any])
      
      inline def setWebpackStatsUndefined: Self = StObject.set(x, "webpackStats", js.undefined)
    }
  }
  
  type WebpackBuilderSchema = Schema
  
  type WebpackFactory = js.Function1[
    /* config */ Configuration, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<webpack.Compiler> */ Any) | Compiler
  ]
  
  type WebpackLoggingCallback = js.Function2[/* stats */ Stats, /* config */ Configuration, Unit]
}
