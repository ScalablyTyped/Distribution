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
    acquire: () => scala.Unit,
    getLayerManager: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XLayerSupplier = {
    val __obj = js.Dynamic.literal(LayerManager = LayerManager, acquire = js.Any.fromFunction0(acquire), getLayerManager = js.Any.fromFunction0(getLayerManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLayerSupplier]
  }
}

