package typings.angularDevkitBuildWebpack

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitBuildWebpack.loggerLoggerMod.LogLevel
import typings.angularDevkitBuildWebpack.loggerLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object levelMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/logger/level", "LevelCapLogger")
  @js.native
  open class LevelCapLogger protected () extends LevelTransformLogger {
    def this(name: String, parent: Null, levelCap: LogLevel) = this()
    def this(name: String, parent: Logger, levelCap: LogLevel) = this()
    
    val levelCap: LogLevel = js.native
  }
  /* static members */
  object LevelCapLogger {
    
    @JSImport("@angular-devkit/build-webpack/core/src/logger/level", "LevelCapLogger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/build-webpack/core/src/logger/level", "LevelCapLogger.levelMap")
    @js.native
    def levelMap: StringDictionary[StringDictionary[String]] = js.native
    inline def levelMap_=(x: StringDictionary[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("levelMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/logger/level", "LevelTransformLogger")
  @js.native
  open class LevelTransformLogger protected () extends Logger {
    def this(name: String, parent: Null, levelTransform: js.Function1[/* level */ LogLevel, LogLevel]) = this()
    def this(name: String, parent: Logger, levelTransform: js.Function1[/* level */ LogLevel, LogLevel]) = this()
    
    def levelTransform(level: LogLevel): LogLevel = js.native
  }
}
