package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that provides an embedded object. */
trait XEmbeddedObjectSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the object which is embedded into this object. */
  val EmbeddedObject: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
  /** returns the object which is embedded into this object. */
  def getEmbeddedObject(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
}

object XEmbeddedObjectSupplier {
  @scala.inline
  def apply(
    EmbeddedObject: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    acquire: () => scala.Unit,
    getEmbeddedObject: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XEmbeddedObjectSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObject = EmbeddedObject, acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEmbeddedObjectSupplier]
  }
}

