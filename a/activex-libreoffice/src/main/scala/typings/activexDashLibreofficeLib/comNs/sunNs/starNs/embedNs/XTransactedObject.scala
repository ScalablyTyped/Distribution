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
    acquire: js.Function0[scala.Unit],
    commit: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    revert: js.Function0[scala.Unit]
  ): XTransactedObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("revert")(revert)
    __obj.asInstanceOf[XTransactedObject]
  }
}

