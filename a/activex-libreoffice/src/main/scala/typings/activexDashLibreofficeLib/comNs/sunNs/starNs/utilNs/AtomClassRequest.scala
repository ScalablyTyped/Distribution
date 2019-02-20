package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to describe which atoms the user wants to know about.
  * @see com.sun.star.util.XAtomServer
  */
trait AtomClassRequest extends js.Object {
  /** the class of the atoms described in member {@link AtomClassRequest.atoms()} . */
  var atomClass: scala.Double
  /** the atoms requested from class {@link AtomClassRequest.atomClass()} . */
  var atoms: activexDashInteropLib.SafeArray[scala.Double]
}

