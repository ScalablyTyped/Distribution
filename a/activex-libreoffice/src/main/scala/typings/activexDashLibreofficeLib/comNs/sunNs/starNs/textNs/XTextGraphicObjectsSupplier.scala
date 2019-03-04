package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the collection of all embedded and linked graphics within this context (i.e. within this document). */
trait XTextGraphicObjectsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of graphic objects in this object (document). */
  val GraphicObjects: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the collection of graphic objects in this object (document). */
  def getGraphicObjects(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XTextGraphicObjectsSupplier {
  @scala.inline
  def apply(
    GraphicObjects: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getGraphicObjects: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextGraphicObjectsSupplier = {
    val __obj = js.Dynamic.literal(GraphicObjects = GraphicObjects, acquire = acquire, getGraphicObjects = getGraphicObjects, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTextGraphicObjectsSupplier]
  }
}

