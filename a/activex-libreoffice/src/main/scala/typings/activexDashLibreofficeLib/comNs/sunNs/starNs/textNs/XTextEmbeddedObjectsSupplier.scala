package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the collection of all embedded objects within this context (i.e. this document). */
trait XTextEmbeddedObjectsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of embedded objects. */
  val EmbeddedObjects: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the collection of embedded objects. */
  def getEmbeddedObjects(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XTextEmbeddedObjectsSupplier {
  @scala.inline
  def apply(
    EmbeddedObjects: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getEmbeddedObjects: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextEmbeddedObjectsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EmbeddedObjects")(EmbeddedObjects)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getEmbeddedObjects")(getEmbeddedObjects)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTextEmbeddedObjectsSupplier]
  }
}

