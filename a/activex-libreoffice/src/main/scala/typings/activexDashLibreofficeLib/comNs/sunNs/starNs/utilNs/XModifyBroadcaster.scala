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
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[XModifyListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeModifyListener: js.Function1[XModifyListener, scala.Unit]
  ): XModifyBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire, addModifyListener = addModifyListener, queryInterface = queryInterface, release = release, removeModifyListener = removeModifyListener)
  
    __obj.asInstanceOf[XModifyBroadcaster]
  }
}

