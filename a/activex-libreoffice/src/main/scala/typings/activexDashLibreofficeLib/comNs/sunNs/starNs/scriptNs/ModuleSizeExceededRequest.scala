package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Is used for interaction handle in case password protected modules exceed the size that can be stored in OpenOffice 2.x, 1.x formats */
trait ModuleSizeExceededRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The name of the modules that exceed size that can be stored */
  var Names: activexDashInteropLib.SafeArray[java.lang.String]
}

