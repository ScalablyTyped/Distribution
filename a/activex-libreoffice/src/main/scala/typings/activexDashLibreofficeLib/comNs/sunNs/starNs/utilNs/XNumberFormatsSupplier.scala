package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** supplies the collection of {@link NumberFormats} (for example, in a document) and the settings belonging to these formats. */
trait XNumberFormatsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the {@link NumberFormatSettings} of this object. */
  val NumberFormatSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns the collection of number formats belonging to this object (e.g., to this document). */
  val NumberFormats: XNumberFormats
  /** @returns the {@link NumberFormatSettings} of this object. */
  def getNumberFormatSettings(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns the collection of number formats belonging to this object (e.g., to this document). */
  def getNumberFormats(): XNumberFormats
}

