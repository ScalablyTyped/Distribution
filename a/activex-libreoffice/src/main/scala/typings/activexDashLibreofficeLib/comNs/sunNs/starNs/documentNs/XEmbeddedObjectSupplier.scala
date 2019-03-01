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
    acquire: js.Function0[scala.Unit],
    getEmbeddedObject: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEmbeddedObjectSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EmbeddedObject")(EmbeddedObject)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getEmbeddedObject")(getEmbeddedObject)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XEmbeddedObjectSupplier]
  }
}

