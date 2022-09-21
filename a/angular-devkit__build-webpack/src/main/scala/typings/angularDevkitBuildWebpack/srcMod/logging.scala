package typings.angularDevkitBuildWebpack.srcMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitBuildWebpack.loggerLoggerMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logging {
  
  @JSImport("@angular-devkit/build-webpack/core/src", "logging.IndentLogger")
  @js.native
  open class IndentLogger protected ()
    extends typings.angularDevkitBuildWebpack.loggerMod.IndentLogger {
    def this(name: String) = this()
    def this(name: String, parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger) = this()
    def this(name: String, parent: Null, indentation: String) = this()
    def this(name: String, parent: Unit, indentation: String) = this()
    def this(
      name: String,
      parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger,
      indentation: String
    ) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "logging.LevelCapLogger")
  @js.native
  open class LevelCapLogger protected ()
    extends typings.angularDevkitBuildWebpack.loggerMod.LevelCapLogger {
    def this(name: String, parent: Null, levelCap: LogLevel) = this()
    def this(name: String, parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger, levelCap: LogLevel) = this()
  }
  /* static members */
  object LevelCapLogger {
    
    @JSImport("@angular-devkit/build-webpack/core/src", "logging.LevelCapLogger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/build-webpack/core/src", "logging.LevelCapLogger.levelMap")
    @js.native
    def levelMap: StringDictionary[StringDictionary[String]] = js.native
    inline def levelMap_=(x: StringDictionary[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("levelMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "logging.LevelTransformLogger")
  @js.native
  open class LevelTransformLogger protected ()
    extends typings.angularDevkitBuildWebpack.loggerMod.LevelTransformLogger {
    def this(name: String, parent: Null, levelTransform: js.Function1[/* level */ LogLevel, LogLevel]) = this()
    def this(
      name: String,
      parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger,
      levelTransform: js.Function1[/* level */ LogLevel, LogLevel]
    ) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "logging.Logger")
  @js.native
  open class Logger protected ()
    extends typings.angularDevkitBuildWebpack.loggerMod.Logger {
    def this(name: String) = this()
    def this(name: String, parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "logging.NullLogger")
  @js.native
  open class NullLogger ()
    extends typings.angularDevkitBuildWebpack.loggerMod.NullLogger {
    def this(parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "logging.TransformLogger")
  @js.native
  open class TransformLogger protected ()
    extends typings.angularDevkitBuildWebpack.loggerMod.TransformLogger {
    def this(
      name: String,
      transform: js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<LogEntry> */ /* stream */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<LogEntry> */ Any
          ]
    ) = this()
    def this(
      name: String,
      transform: js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<LogEntry> */ /* stream */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<LogEntry> */ Any
          ],
      parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger
    ) = this()
  }
}
