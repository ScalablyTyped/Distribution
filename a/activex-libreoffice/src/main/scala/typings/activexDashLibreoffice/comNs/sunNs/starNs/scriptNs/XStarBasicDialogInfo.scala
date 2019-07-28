package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing old style basic dialog (SI controls) in binary data
  * @deprecated Deprecated
  */
trait XStarBasicDialogInfo extends XInterface {
  /** returns binary data describing the SIDialog in SBX stream format */
  val Data: SafeArray[Double]
  /** returns the name of the dialog */
  val Name: String
  /** returns binary data describing the SIDialog in SBX stream format */
  def getData(): SafeArray[Double]
  /** returns the name of the dialog */
  def getName(): String
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
    val __obj = js.Dynamic.literal(Data = Data, Name = Name, acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction0(getData), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStarBasicDialogInfo]
  }
}

