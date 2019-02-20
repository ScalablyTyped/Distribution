package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is used to indicate that there are properties missing.
  *
  * For example, to create a new resource, usually one ore more property values must be set prior to executing the command "insert", which makes the new
  * resource persistent.
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
trait MissingPropertiesException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** contains the names of the missing properties. */
  var Properties: activexDashInteropLib.SafeArray[java.lang.String]
}

