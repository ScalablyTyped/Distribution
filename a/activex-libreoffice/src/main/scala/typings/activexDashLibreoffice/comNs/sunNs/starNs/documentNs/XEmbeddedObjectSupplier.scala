package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that provides an embedded object. */
trait XEmbeddedObjectSupplier extends XInterface {
  /** returns the object which is embedded into this object. */
  val EmbeddedObject: XComponent
  /** returns the object which is embedded into this object. */
  def getEmbeddedObject(): XComponent
}

object XEmbeddedObjectSupplier {
  @scala.inline
  def apply(
    EmbeddedObject: XComponent,
    acquire: () => Unit,
    getEmbeddedObject: () => XComponent,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEmbeddedObjectSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObject = EmbeddedObject, acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEmbeddedObjectSupplier]
  }
}

