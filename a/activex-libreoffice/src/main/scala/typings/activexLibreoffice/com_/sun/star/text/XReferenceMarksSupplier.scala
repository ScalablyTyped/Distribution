package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the reference marks within this context (i.e. document).
  *
  * A reference mark is used to refer to text positions in a text document.
  */
@js.native
trait XReferenceMarksSupplier extends XInterface {
  /** @returns the collection of reference marks. */
  val ReferenceMarks: XNameAccess = js.native
  /** @returns the collection of reference marks. */
  def getReferenceMarks(): XNameAccess = js.native
}

object XReferenceMarksSupplier {
  @scala.inline
  def apply(
    ReferenceMarks: XNameAccess,
    acquire: () => Unit,
    getReferenceMarks: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XReferenceMarksSupplier = {
    val __obj = js.Dynamic.literal(ReferenceMarks = ReferenceMarks.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getReferenceMarks = js.Any.fromFunction0(getReferenceMarks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XReferenceMarksSupplier]
  }
  @scala.inline
  implicit class XReferenceMarksSupplierOps[Self <: XReferenceMarksSupplier] (val x: Self) extends AnyVal {
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
    def setReferenceMarks(value: XNameAccess): Self = this.set("ReferenceMarks", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetReferenceMarks(value: () => XNameAccess): Self = this.set("getReferenceMarks", js.Any.fromFunction0(value))
  }
  
}

