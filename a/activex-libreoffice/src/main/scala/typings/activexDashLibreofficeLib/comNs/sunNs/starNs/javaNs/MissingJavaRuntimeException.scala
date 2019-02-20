package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.javaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * indicates that the Java runtime library could not be found.
  *
  * This happens when a user moves or deletes a Java installation after the office has been configured to use that Java installation.
  * @since OOo 1.1.2
  */
trait MissingJavaRuntimeException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** contains the path to the runtime lib as file URL. */
  var URLRuntimeLib: java.lang.String
}

