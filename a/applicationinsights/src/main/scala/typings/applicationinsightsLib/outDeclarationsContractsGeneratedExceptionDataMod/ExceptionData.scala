package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedExceptionDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * An instance of Exception represents a handled or unhandled exception that occurred during execution of the monitored application.
 */
@js.native
trait ExceptionData
  extends applicationinsightsLib.outDeclarationsContractsGeneratedDomainMod.namespaced {
  /**
       * Exception chain - list of inner exceptions.
       */
  var exceptions: js.Array[
    applicationinsightsLib.outDeclarationsContractsGeneratedExceptionDetailsMod.namespaced
  ] = js.native
  /**
       * Collection of custom measurements.
       */
  var measurements: js.Any = js.native
  /**
       * Identifier of where the exception was thrown in code. Used for exceptions grouping. Typically a combination of exception type and a function from the call stack.
       */
  var problemId: java.lang.String = js.native
  /**
       * Collection of custom properties.
       */
  var properties: js.Any = js.native
  /**
       * Severity level. Mostly used to indicate exception severity level when it is reported by logging library.
       */
  var severityLevel: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel = js.native
  /**
       * Schema version
       */
  var ver: scala.Double = js.native
}

