package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provide access to a {@link com.sun.star.datatransfer.XTransferable} implementation from the object. */
trait XTransferableSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns {@link com.sun.star.datatransfer.XTransferable} implementation
    */
  val Transferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns {@link com.sun.star.datatransfer.XTransferable} implementation
    */
  def getTransferable(): activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
}

object XTransferableSupplier {
  @scala.inline
  def apply(
    Transferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    acquire: js.Function0[scala.Unit],
    getTransferable: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTransferableSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Transferable")(Transferable)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getTransferable")(getTransferable)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTransferableSupplier]
  }
}

