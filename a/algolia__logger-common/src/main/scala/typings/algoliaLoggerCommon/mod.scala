package typings.algoliaLoggerCommon

import typings.algoliaLoggerCommon.anon.ReadonlyPromisevoid
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/logger-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@algolia/logger-common", "LogLevelEnum")
  @js.native
  val LogLevelEnum: Record[String, LogLevelType] = js.native
  
  inline def createNullLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createNullLogger")().asInstanceOf[Logger]
  
  /* Rewritten from type alias, can be one of: 
    - typings.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`1`
    - typings.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`2`
    - typings.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`3`
  */
  trait LogLevelType extends StObject
  object LogLevelType {
    
    inline def `1`: typings.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`1` = 1.asInstanceOf[typings.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`1`]
    
    inline def `2`: typings.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`2` = 2.asInstanceOf[typings.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`2`]
    
    inline def `3`: typings.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`3` = 3.asInstanceOf[typings.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`3`]
  }
  
  @js.native
  trait Logger extends StObject {
    
    /**
      * Logs debug messages.
      */
    def debug(message: String): ReadonlyPromisevoid = js.native
    def debug(message: String, args: Any): ReadonlyPromisevoid = js.native
    
    /**
      * Logs error messages.
      */
    def error(message: String): ReadonlyPromisevoid = js.native
    def error(message: String, args: Any): ReadonlyPromisevoid = js.native
    
    /**
      * Logs info messages.
      */
    def info(message: String): ReadonlyPromisevoid = js.native
    def info(message: String, args: Any): ReadonlyPromisevoid = js.native
  }
}
