package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(FootnoteSettings = FootnoteSettings.asInstanceOf[js.Any], Footnotes = Footnotes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFootnoteSettings = js.Any.fromFunction0(getFootnoteSettings), getFootnotes = js.Any.fromFunction0(getFootnotes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFootnotesSupplier]
  }
}

