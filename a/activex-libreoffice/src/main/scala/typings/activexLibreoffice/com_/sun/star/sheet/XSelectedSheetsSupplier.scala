package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 3.5 */
@js.native
trait XSelectedSheetsSupplier extends XInterface {
  /** returns the indices of currently selected sheets. Sheet indices are 0-based. */
  val SelectedSheets: SafeArray[Double] = js.native
  /** returns the indices of currently selected sheets. Sheet indices are 0-based. */
  def getSelectedSheets(): SafeArray[Double] = js.native
}

object XSelectedSheetsSupplier {
  @scala.inline
  def apply(
    SelectedSheets: SafeArray[Double],
    acquire: () => Unit,
    getSelectedSheets: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSelectedSheetsSupplier = {
    val __obj = js.Dynamic.literal(SelectedSheets = SelectedSheets.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSelectedSheets = js.Any.fromFunction0(getSelectedSheets), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSelectedSheetsSupplier]
  }
  @scala.inline
  implicit class XSelectedSheetsSupplierOps[Self <: XSelectedSheetsSupplier] (val x: Self) extends AnyVal {
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
    def setSelectedSheets(value: SafeArray[Double]): Self = this.set("SelectedSheets", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetSelectedSheets(value: () => SafeArray[Double]): Self = this.set("getSelectedSheets", js.Any.fromFunction0(value))
  }
  
}

