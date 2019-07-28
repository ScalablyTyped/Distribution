package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages the text sections within the context (i.e. the document). */
trait XTextSectionsSupplier extends XInterface {
  /** @returns the collection of text sections. */
  val TextSections: XNameAccess
  /** @returns the collection of text sections. */
  def getTextSections(): XNameAccess
}

object XTextSectionsSupplier {
  @scala.inline
  def apply(
    TextSections: XNameAccess,
    acquire: () => Unit,
    getTextSections: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextSectionsSupplier = {
    val __obj = js.Dynamic.literal(TextSections = TextSections, acquire = js.Any.fromFunction0(acquire), getTextSections = js.Any.fromFunction0(getTextSections), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextSectionsSupplier]
  }
}

