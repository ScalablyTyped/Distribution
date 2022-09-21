package typings.angularDevkitBuildWebpack

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitBuildWebpack.loggerLoggerMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/logger", "IndentLogger")
  @js.native
  open class IndentLogger protected ()
    extends typings.angularDevkitBuildWebpack.indentMod.IndentLogger {
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
  
  @JSImport("@angular-devkit/build-webpack/core/src/logger", "LevelCapLogger")
  @js.native
  open class LevelCapLogger protected ()
    extends typings.angularDevkitBuildWebpack.levelMod.LevelCapLogger {
    def this(name: String, parent: Null, levelCap: LogLevel) = this()
    def this(name: String, parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger, levelCap: LogLevel) = this()
  }
  /* static members */
  object LevelCapLogger {
    
    @JSImport("@angular-devkit/build-webpack/core/src/logger", "LevelCapLogger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/build-webpack/core/src/logger", "LevelCapLogger.levelMap")
    @js.native
    def levelMap: StringDictionary[StringDictionary[String]] = js.native
    inline def levelMap_=(x: StringDictionary[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("levelMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/logger", "LevelTransformLogger")
  @js.native
  open class LevelTransformLogger protected ()
    extends typings.angularDevkitBuildWebpack.levelMod.LevelTransformLogger {
    def this(name: String, parent: Null, levelTransform: js.Function1[/* level */ LogLevel, LogLevel]) = this()
    def this(
      name: String,
      parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger,
      levelTransform: js.Function1[/* level */ LogLevel, LogLevel]
    ) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/logger", "Logger")
  @js.native
  open class Logger protected ()
    extends typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger {
    def this(name: String) = this()
    def this(name: String, parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/logger", "NullLogger")
  @js.native
  open class NullLogger ()
    extends typings.angularDevkitBuildWebpack.nullLoggerMod.NullLogger {
    def this(parent: typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/logger", "TransformLogger")
  @js.native
  open class TransformLogger protected ()
    extends typings.angularDevkitBuildWebpack.transformLoggerMod.TransformLogger {
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
