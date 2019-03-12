package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts each modification made on the date data of the object which supports this interface.
  *
  * The modified object must post the modification events immediately after the modification is performed.
  */
trait XModifyBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified listener to receive events "modified." */
  def addModifyListener(aListener: XModifyListener): scala.Unit
  /** removes the specified listener. */
  def removeModifyListener(aListener: XModifyListener): scala.Unit
}

object XModifyBroadcaster {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addModifyListener: XModifyListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeModifyListener: XModifyListener => scala.Unit
  ): XModifyBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener))
  
    __obj.asInstanceOf[XModifyBroadcaster]
  }
}

