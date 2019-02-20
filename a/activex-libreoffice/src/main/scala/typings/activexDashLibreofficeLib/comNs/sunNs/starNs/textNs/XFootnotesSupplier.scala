package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the footnotes within the context (e.g. document). */
trait XFootnotesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the footnotes settings of the document. */
  val FootnoteSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** returns a collection of footnotes. */
  val Footnotes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** @returns the footnotes settings of the document. */
  def getFootnoteSettings(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** returns a collection of footnotes. */
  def getFootnotes(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

