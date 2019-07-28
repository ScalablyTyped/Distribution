package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to a {@link LayerManager} .
  * @see LayerManager
  */
trait XLayerSupplier extends XInterface {
  /** @returns the {@link LayerManager} . */
  val LayerManager: XNameAccess
  /** @returns the {@link LayerManager} . */
  def getLayerManager(): XNameAccess
}

object XLayerSupplier {
  @scala.inline
  def apply(
    LayerManager: XNameAccess,
    acquire: () => Unit,
    getLayerManager: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLayerSupplier = {
    val __obj = js.Dynamic.literal(LayerManager = LayerManager, acquire = js.Any.fromFunction0(acquire), getLayerManager = js.Any.fromFunction0(getLayerManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLayerSupplier]
  }
}

