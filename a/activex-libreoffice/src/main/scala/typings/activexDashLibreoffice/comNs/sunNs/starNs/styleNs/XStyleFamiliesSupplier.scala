package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides access to the style families within the container document. */
trait XStyleFamiliesSupplier extends XInterface {
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  val StyleFamilies: XNameAccess
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  def getStyleFamilies(): XNameAccess
}

object XStyleFamiliesSupplier {
  @scala.inline
  def apply(
    StyleFamilies: XNameAccess,
    acquire: () => Unit,
    getStyleFamilies: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStyleFamiliesSupplier = {
    val __obj = js.Dynamic.literal(StyleFamilies = StyleFamilies, acquire = js.Any.fromFunction0(acquire), getStyleFamilies = js.Any.fromFunction0(getStyleFamilies), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStyleFamiliesSupplier]
  }
}

