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
  var atoms: stdLib.SafeArray[scala.Double]
}

object AtomClassRequest {
  @scala.inline
  def apply(atomClass: scala.Double, atoms: stdLib.SafeArray[scala.Double]): AtomClassRequest = {
    val __obj = js.Dynamic.literal(atomClass = atomClass, atoms = atoms)
  
    __obj.asInstanceOf[AtomClassRequest]
  }
}

