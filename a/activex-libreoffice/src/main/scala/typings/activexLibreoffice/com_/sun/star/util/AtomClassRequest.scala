package typings.activexLibreoffice.com_.sun.star.util

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to describe which atoms the user wants to know about.
  * @see com.sun.star.util.XAtomServer
  */
trait AtomClassRequest extends js.Object {
  /** the class of the atoms described in member {@link AtomClassRequest.atoms()} . */
  var atomClass: Double
  /** the atoms requested from class {@link AtomClassRequest.atomClass()} . */
  var atoms: SafeArray[Double]
}

object AtomClassRequest {
  @scala.inline
  def apply(atomClass: Double, atoms: SafeArray[Double]): AtomClassRequest = {
    val __obj = js.Dynamic.literal(atomClass = atomClass.asInstanceOf[js.Any], atoms = atoms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomClassRequest]
  }
}

