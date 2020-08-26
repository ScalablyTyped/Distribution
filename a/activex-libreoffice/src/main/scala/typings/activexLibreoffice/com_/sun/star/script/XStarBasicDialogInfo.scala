package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing old style basic dialog (SI controls) in binary data
  * @deprecated Deprecated
  */
@js.native
trait XStarBasicDialogInfo extends XInterface {
  /** returns binary data describing the SIDialog in SBX stream format */
  val Data: SafeArray[Double] = js.native
  /** returns the name of the dialog */
  val Name: String = js.native
  /** returns binary data describing the SIDialog in SBX stream format */
  def getData(): SafeArray[Double] = js.native
  /** returns the name of the dialog */
  def getName(): String = js.native
}

object XStarBasicDialogInfo {
  @scala.inline
  def apply(
    Data: SafeArray[Double],
    Name: String,
    acquire: () => Unit,
    getData: () => SafeArray[Double],
    getName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStarBasicDialogInfo = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction0(getData), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStarBasicDialogInfo]
  }
  @scala.inline
  implicit class XStarBasicDialogInfoOps[Self <: XStarBasicDialogInfo] (val x: Self) extends AnyVal {
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
    def setData(value: SafeArray[Double]): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetData(value: () => SafeArray[Double]): Self = this.set("getData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
  }
  
}

