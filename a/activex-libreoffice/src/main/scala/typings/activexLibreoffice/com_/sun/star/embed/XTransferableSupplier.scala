package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provide access to a {@link com.sun.star.datatransfer.XTransferable} implementation from the object. */
@js.native
trait XTransferableSupplier extends XInterface {
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns {@link com.sun.star.datatransfer.XTransferable} implementation
    */
  val Transferable: XTransferable = js.native
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns {@link com.sun.star.datatransfer.XTransferable} implementation
    */
  def getTransferable(): XTransferable = js.native
}

object XTransferableSupplier {
  @scala.inline
  def apply(
    Transferable: XTransferable,
    acquire: () => Unit,
    getTransferable: () => XTransferable,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransferableSupplier = {
    val __obj = js.Dynamic.literal(Transferable = Transferable.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTransferable = js.Any.fromFunction0(getTransferable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTransferableSupplier]
  }
  @scala.inline
  implicit class XTransferableSupplierOps[Self <: XTransferableSupplier] (val x: Self) extends AnyVal {
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
    def setTransferable(value: XTransferable): Self = this.set("Transferable", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTransferable(value: () => XTransferable): Self = this.set("getTransferable", js.Any.fromFunction0(value))
  }
  
}

