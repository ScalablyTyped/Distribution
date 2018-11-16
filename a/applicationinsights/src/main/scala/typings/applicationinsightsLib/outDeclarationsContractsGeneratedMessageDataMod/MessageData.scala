package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedMessageDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Instances of Message represent printf-like trace statements that are text-searched. Log4Net, NLog and other text-based log file entries are translated into intances of this type. The message does not have measurements.
 */
@js.native
trait MessageData
  extends applicationinsightsLib.outDeclarationsContractsGeneratedDomainMod.namespaced {
  /**
       * Trace message
       */
  var message: java.lang.String = js.native
  /**
       * Collection of custom properties.
       */
  var properties: js.Any = js.native
  /**
       * Trace severity level.
       */
  var severityLevel: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel = js.native
  /**
       * Schema version
       */
  var ver: scala.Double = js.native
}

