package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown in case a configuration does not exists or contains corrupt data.
  *
  * This exception must be used as base exception to derive specialized exceptions from it which identify a concrete error case.
  * @since OOo 2.3
  */
trait CorruptedConfigurationException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** Instead of the message part of an exception, this value describe the type of corruption more in detail. */
  var Details: java.lang.String
}

