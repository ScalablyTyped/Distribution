package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides auditing functions of a document. */
@js.native
trait XDocumentAuditing extends XInterface {
  /**
    * refreshes all existing auditing arrows on all sheets of the document.
    *
    * Dependencies are marked for all the cells that were marked before, but using current formulas.
    */
  def refreshArrows(): Unit = js.native
}

object XDocumentAuditing {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    refreshArrows: () => Unit,
    release: () => Unit
  ): XDocumentAuditing = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), refreshArrows = js.Any.fromFunction0(refreshArrows), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentAuditing]
  }
  @scala.inline
  implicit class XDocumentAuditingOps[Self <: XDocumentAuditing] (val x: Self) extends AnyVal {
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
    def setRefreshArrows(value: () => Unit): Self = this.set("refreshArrows", js.Any.fromFunction0(value))
  }
  
}

