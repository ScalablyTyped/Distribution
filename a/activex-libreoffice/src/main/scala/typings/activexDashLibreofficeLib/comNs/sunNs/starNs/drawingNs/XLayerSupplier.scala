package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to a {@link LayerManager} .
  * @see LayerManager
  */
trait XLayerSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the {@link LayerManager} . */
  val LayerManager: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the {@link LayerManager} . */
  def getLayerManager(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XLayerSupplier {
  @scala.inline
  def apply(
    LayerManager: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getLayerManager: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XLayerSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LayerManager")(LayerManager)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getLayerManager")(getLayerManager)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XLayerSupplier]
  }
}

