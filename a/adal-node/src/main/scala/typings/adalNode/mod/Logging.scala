package typings.adalNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("adal-node", "Logging")
@js.native
class Logging () extends js.Object
/* static members */
@JSImport("adal-node", "Logging")
@js.native
object Logging extends js.Object {
  
  /**
    * @property {LoggingLevel} LOGGING_LEVEL Provides information about the logging levels.
    * ERROR: 0,
    * WARN: 1,
    * INFO: 2,
    * VERBOSE: 3
    */
  var LOGGING_LEVEL: LoggingLevel = js.native
  
  /**
    * Get's the current global logging options.
    * @return {LoggingOptions}
    */
  def getLoggingOptions(): LoggingOptions = js.native
  
  /**
    * Sets global logging options for ADAL.
    * @param {LoggingOptions} options
    */
  def setLoggingOptions(options: LoggingOptions): Unit = js.native
}
