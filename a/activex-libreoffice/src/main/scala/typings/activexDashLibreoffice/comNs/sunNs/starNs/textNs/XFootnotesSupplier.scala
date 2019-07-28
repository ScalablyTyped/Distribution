package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the footnotes within the context (e.g. document). */
trait XFootnotesSupplier extends XInterface {
  /** @returns the footnotes settings of the document. */
  val FootnoteSettings: XPropertySet
  /** returns a collection of footnotes. */
  val Footnotes: XIndexAccess
  /** @returns the footnotes settings of the document. */
  def getFootnoteSettings(): XPropertySet
  /** returns a collection of footnotes. */
  def getFootnotes(): XIndexAccess
}

object XFootnotesSupplier {
  @scala.inline
  def apply(
    FootnoteSettings: XPropertySet,
    Footnotes: XIndexAccess,
    acquire: () => Unit,
    getFootnoteSettings: () => XPropertySet,
    getFootnotes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFootnotesSupplier = {
    val __obj = js.Dynamic.literal(FootnoteSettings = FootnoteSettings, Footnotes = Footnotes, acquire = js.Any.fromFunction0(acquire), getFootnoteSettings = js.Any.fromFunction0(getFootnoteSettings), getFootnotes = js.Any.fromFunction0(getFootnotes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFootnotesSupplier]
  }
}

