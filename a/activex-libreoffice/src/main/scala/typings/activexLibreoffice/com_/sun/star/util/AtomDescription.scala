package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a string and the corresponding registered atom .
  * @see com.sun.star.util.XAtomServer
  */
@js.native
trait AtomDescription extends js.Object {
  /** the atom itself */
  var atom: Double = js.native
  /** the string it stands for */
  var description: String = js.native
}

object AtomDescription {
  @scala.inline
  def apply(atom: Double, description: String): AtomDescription = {
    val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomDescription]
  }
  @scala.inline
  implicit class AtomDescriptionOps[Self <: AtomDescription] (val x: Self) extends AnyVal {
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
    def setAtom(value: Double): Self = this.set("atom", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
  }
  
}

