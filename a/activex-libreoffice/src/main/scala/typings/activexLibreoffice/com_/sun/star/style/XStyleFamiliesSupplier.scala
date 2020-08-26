package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides access to the style families within the container document. */
@js.native
trait XStyleFamiliesSupplier extends XInterface {
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  val StyleFamilies: XNameAccess = js.native
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  def getStyleFamilies(): XNameAccess = js.native
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
    val __obj = js.Dynamic.literal(StyleFamilies = StyleFamilies.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStyleFamilies = js.Any.fromFunction0(getStyleFamilies), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStyleFamiliesSupplier]
  }
  @scala.inline
  implicit class XStyleFamiliesSupplierOps[Self <: XStyleFamiliesSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStyleFamilies(value: XNameAccess): Self = this.set("StyleFamilies", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetStyleFamilies(value: () => XNameAccess): Self = this.set("getStyleFamilies", js.Any.fromFunction0(value))
  }
  
}

