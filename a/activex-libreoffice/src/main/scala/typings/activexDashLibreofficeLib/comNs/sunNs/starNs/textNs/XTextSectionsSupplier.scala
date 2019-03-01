package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages the text sections within the context (i.e. the document). */
trait XTextSectionsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of text sections. */
  val TextSections: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the collection of text sections. */
  def getTextSections(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XTextSectionsSupplier {
  @scala.inline
  def apply(
    TextSections: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getTextSections: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextSectionsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TextSections")(TextSections)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getTextSections")(getTextSections)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTextSectionsSupplier]
  }
}

