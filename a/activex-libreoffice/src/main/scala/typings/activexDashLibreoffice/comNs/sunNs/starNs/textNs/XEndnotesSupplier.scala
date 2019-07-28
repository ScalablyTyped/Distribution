package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the endnotes within the context (e.g. document). */
trait XEndnotesSupplier extends XInterface {
  /** @returns the endnote settings of the document. */
  val EndnoteSettings: XPropertySet
  /** @returns a collection of endnotes. */
  val Endnotes: XIndexAccess
  /** @returns the endnote settings of the document. */
  def getEndnoteSettings(): XPropertySet
  /** @returns a collection of endnotes. */
  def getEndnotes(): XIndexAccess
}

object XEndnotesSupplier {
  @scala.inline
  def apply(
    EndnoteSettings: XPropertySet,
    Endnotes: XIndexAccess,
    acquire: () => Unit,
    getEndnoteSettings: () => XPropertySet,
    getEndnotes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEndnotesSupplier = {
    val __obj = js.Dynamic.literal(EndnoteSettings = EndnoteSettings, Endnotes = Endnotes, acquire = js.Any.fromFunction0(acquire), getEndnoteSettings = js.Any.fromFunction0(getEndnoteSettings), getEndnotes = js.Any.fromFunction0(getEndnotes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEndnotesSupplier]
  }
}

