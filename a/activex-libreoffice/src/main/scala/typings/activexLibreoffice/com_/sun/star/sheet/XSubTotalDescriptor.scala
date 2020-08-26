package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of subtotal fields in a subtotal descriptor.
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
@js.native
trait XSubTotalDescriptor extends XInterface {
  /**
    * adds a subtotal field definition to the descriptor.
    * @param aSubTotalColumns a sequence of all columns used to calculate subtotal values.
    * @param nGroupColumn specifies which column of the source range is used to group the contents of the source data.
    */
  def addNew(aSubTotalColumns: SeqEquiv[SubTotalColumn], nGroupColumn: Double): Unit = js.native
  /** removes all subtotal field definitions from the descriptor. */
  def clear(): Unit = js.native
}

object XSubTotalDescriptor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addNew: (SeqEquiv[SubTotalColumn], Double) => Unit,
    clear: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSubTotalDescriptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction2(addNew), clear = js.Any.fromFunction0(clear), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSubTotalDescriptor]
  }
  @scala.inline
  implicit class XSubTotalDescriptorOps[Self <: XSubTotalDescriptor] (val x: Self) extends AnyVal {
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
    def setAddNew(value: (SeqEquiv[SubTotalColumn], Double) => Unit): Self = this.set("addNew", js.Any.fromFunction2(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
  }
  
}

