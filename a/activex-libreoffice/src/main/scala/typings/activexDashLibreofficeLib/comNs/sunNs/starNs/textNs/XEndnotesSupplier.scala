package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the endnotes within the context (e.g. document). */
trait XEndnotesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the endnote settings of the document. */
  val EndnoteSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns a collection of endnotes. */
  val Endnotes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** @returns the endnote settings of the document. */
  def getEndnoteSettings(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns a collection of endnotes. */
  def getEndnotes(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

