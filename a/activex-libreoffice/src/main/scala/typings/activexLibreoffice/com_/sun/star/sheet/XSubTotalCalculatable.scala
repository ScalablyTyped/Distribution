package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains methods to handle a subtotal descriptor.
  *
  * The subtotal descriptor provides properties to set up the subtotal function.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
@js.native
trait XSubTotalCalculatable extends XInterface {
  /**
    * creates subtotals using the settings of the passed descriptor.
    * @param xDescriptor the subtotal descriptor with the settings used for the subtotal operation.
    * @param bReplace if set to `TRUE` , replaces previous subtotal results.
    */
  def applySubTotals(xDescriptor: XSubTotalDescriptor, bReplace: Boolean): Unit = js.native
  /**
    * creates a subtotal descriptor.
    * @param bEmpty if set to `TRUE` , creates an empty descriptor. If set to `FALSE` , fills the descriptor with previous settings of the current object (i.e
    */
  def createSubTotalDescriptor(bEmpty: Boolean): XSubTotalDescriptor = js.native
  /** removes the subtotals from the current object. */
  def removeSubTotals(): Unit = js.native
}

object XSubTotalCalculatable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    applySubTotals: (XSubTotalDescriptor, Boolean) => Unit,
    createSubTotalDescriptor: Boolean => XSubTotalDescriptor,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSubTotals: () => Unit
  ): XSubTotalCalculatable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), applySubTotals = js.Any.fromFunction2(applySubTotals), createSubTotalDescriptor = js.Any.fromFunction1(createSubTotalDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSubTotals = js.Any.fromFunction0(removeSubTotals))
    __obj.asInstanceOf[XSubTotalCalculatable]
  }
  @scala.inline
  implicit class XSubTotalCalculatableOps[Self <: XSubTotalCalculatable] (val x: Self) extends AnyVal {
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
    def setApplySubTotals(value: (XSubTotalDescriptor, Boolean) => Unit): Self = this.set("applySubTotals", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateSubTotalDescriptor(value: Boolean => XSubTotalDescriptor): Self = this.set("createSubTotalDescriptor", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveSubTotals(value: () => Unit): Self = this.set("removeSubTotals", js.Any.fromFunction0(value))
  }
  
}

