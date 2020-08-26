package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a container of the redline objects of the document. */
@js.native
trait XRedlinesSupplier extends XInterface {
  /** @returns an enumeration access that provides access to the redline objects of the document.  The returned objects implement at least the interface {@link  */
  val Redlines: XEnumerationAccess = js.native
  /** @returns an enumeration access that provides access to the redline objects of the document.  The returned objects implement at least the interface {@link  */
  def getRedlines(): XEnumerationAccess = js.native
}

object XRedlinesSupplier {
  @scala.inline
  def apply(
    Redlines: XEnumerationAccess,
    acquire: () => Unit,
    getRedlines: () => XEnumerationAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRedlinesSupplier = {
    val __obj = js.Dynamic.literal(Redlines = Redlines.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRedlines = js.Any.fromFunction0(getRedlines), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRedlinesSupplier]
  }
  @scala.inline
  implicit class XRedlinesSupplierOps[Self <: XRedlinesSupplier] (val x: Self) extends AnyVal {
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
    def setRedlines(value: XEnumerationAccess): Self = this.set("Redlines", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRedlines(value: () => XEnumerationAccess): Self = this.set("getRedlines", js.Any.fromFunction0(value))
  }
  
}

