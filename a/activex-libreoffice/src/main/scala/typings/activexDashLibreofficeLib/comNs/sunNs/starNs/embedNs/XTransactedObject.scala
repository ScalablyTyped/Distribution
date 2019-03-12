package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows transacted access to an object. */
trait XTransactedObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** commits the changes made for object. */
  def commit(): scala.Unit
  /** removes all the changes made for the object after last commit or loading. */
  def revert(): scala.Unit
}

object XTransactedObject {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    commit: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    revert: () => scala.Unit
  ): XTransactedObject = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), commit = js.Any.fromFunction0(commit), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revert = js.Any.fromFunction0(revert))
  
    __obj.asInstanceOf[XTransactedObject]
  }
}

