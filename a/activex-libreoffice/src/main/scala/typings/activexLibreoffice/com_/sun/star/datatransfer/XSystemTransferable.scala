package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to be implemented by objects used to provide system dependent data for a transfer operation. Those objects usually also implement {@link
  * XTransferable} .
  */
@js.native
trait XSystemTransferable extends XInterface {
  /**
    * Called by a data consumer to obtain a system specific data object from the source. The data object is returned in an any. The contained type may
    * differ on different platforms.
    * @param aProcessId The argument aProcessId is a process identifier of the caller's process. The interface implementation must ensure that the system data
    * @returns The system dependent data object.; ;   **Notes:** Under Windows the returned any contains an unsigned long which represents a pointer to an IData
    */
  def getData(aProcessId: SeqEquiv[Double]): js.Any = js.native
}

object XSystemTransferable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getData: SeqEquiv[Double] => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSystemTransferable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction1(getData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSystemTransferable]
  }
  @scala.inline
  implicit class XSystemTransferableOps[Self <: XSystemTransferable] (val x: Self) extends AnyVal {
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
    def setGetData(value: SeqEquiv[Double] => js.Any): Self = this.set("getData", js.Any.fromFunction1(value))
  }
  
}

