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

