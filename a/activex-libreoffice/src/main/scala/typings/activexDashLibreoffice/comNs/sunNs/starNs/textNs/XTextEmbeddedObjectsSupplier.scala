package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the collection of all embedded objects within this context (i.e. this document). */
trait XTextEmbeddedObjectsSupplier extends XInterface {
  /** @returns the collection of embedded objects. */
  val EmbeddedObjects: XNameAccess
  /** @returns the collection of embedded objects. */
  def getEmbeddedObjects(): XNameAccess
}

object XTextEmbeddedObjectsSupplier {
  @scala.inline
  def apply(
    EmbeddedObjects: XNameAccess,
    acquire: () => Unit,
    getEmbeddedObjects: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextEmbeddedObjectsSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObjects = EmbeddedObjects, acquire = js.Any.fromFunction0(acquire), getEmbeddedObjects = js.Any.fromFunction0(getEmbeddedObjects), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextEmbeddedObjectsSupplier]
  }
}

