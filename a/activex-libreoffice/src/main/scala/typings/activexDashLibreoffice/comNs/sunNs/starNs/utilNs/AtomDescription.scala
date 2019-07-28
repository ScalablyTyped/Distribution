package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a string and the corresponding registered atom .
  * @see com.sun.star.util.XAtomServer
  */
trait AtomDescription extends js.Object {
  /** the atom itself */
  var atom: Double
  /** the string it stands for */
  var description: String
}

object AtomDescription {
  @scala.inline
  def apply(atom: Double, description: String): AtomDescription = {
    val __obj = js.Dynamic.literal(atom = atom, description = description)
  
    __obj.asInstanceOf[AtomDescription]
  }
}

