package typings.angularDevkitBuildWebpack

import typings.angularDevkitArchitect.srcApiMod.BuilderContext
import typings.angularDevkitArchitect.srcApiMod.BuilderOutput
import typings.angularDevkitArchitect.srcInternalMod.Builder
import typings.angularDevkitBuildWebpack.anon.Logging
import typings.angularDevkitBuildWebpack.srcUtilsMod.EmittedFiles
import typings.angularDevkitBuildWebpack.srcWebpackSchemaMod.Schema
import typings.rxjs.mod.Observable_
import typings.webpack.mod.Compiler
import typings.webpack.mod.Configuration
import typings.webpack.mod.Stats
import typings.webpack.mod.StatsCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackMod {
  
  @JSImport("@angular-devkit/build-webpack/src/webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-webpack/src/webpack", JSImport.Default)
  @js.native
  val default: Builder[
    Schema & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src.JsonObject */ Any)
  ] = js.native
  
  inline def runWebpack(config: Configuration, context: BuilderContext): Observable_[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuildResult]]
  inline def runWebpack(config: Configuration, context: BuilderContext, options: Logging): Observable_[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runWebpack")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuildResult]]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildResult] (val x: Self) extends AnyVal {
      
      inline def setEmittedFiles(value: js.Array[EmittedFiles]): Self = StObject.set(x, "emittedFiles", value.asInstanceOf[js.Any])
      
      inline def setEmittedFilesUndefined: Self = StObject.set(x, "emittedFiles", js.undefined)
      
      inline def setEmittedFilesVarargs(value: EmittedFiles*): Self = StObject.set(x, "emittedFiles", js.Array(value*))
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setWebpackStats(value: StatsCompilation): Self = StObject.set(x, "webpackStats", value.asInstanceOf[js.Any])
      
      inline def setWebpackStatsUndefined: Self = StObject.set(x, "webpackStats", js.undefined)
    }
  }
  
  type WebpackBuilderSchema = Schema
  
  type WebpackFactory = js.Function1[/* config */ Configuration, Observable_[Compiler] | Compiler]
  
  type WebpackLoggingCallback = js.Function2[/* stats */ Stats, /* config */ Configuration, Unit]
}
