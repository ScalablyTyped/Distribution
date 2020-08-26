package typings.activexLibreoffice.com_.sun.star.util

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to describe which atoms the user wants to know about.
  * @see com.sun.star.util.XAtomServer
  */
@js.native
trait AtomClassRequest extends js.Object {
  /** the class of the atoms described in member {@link AtomClassRequest.atoms()} . */
  var atomClass: Double = js.native
  /** the atoms requested from class {@link AtomClassRequest.atomClass()} . */
  var atoms: SafeArray[Double] = js.native
}

object AtomClassRequest {
  @scala.inline
  def apply(atomClass: Double, atoms: SafeArray[Double]): AtomClassRequest = {
    val __obj = js.Dynamic.literal(atomClass = atomClass.asInstanceOf[js.Any], atoms = atoms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomClassRequest]
  }
  @scala.inline
  implicit class AtomClassRequestOps[Self <: AtomClassRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAtomClass(value: Double): Self = this.set("atomClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtoms(value: SafeArray[Double]): Self = this.set("atoms", value.asInstanceOf[js.Any])
  }
  
}

