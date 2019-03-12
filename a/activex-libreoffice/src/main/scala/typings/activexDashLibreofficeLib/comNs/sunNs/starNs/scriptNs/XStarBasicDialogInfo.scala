package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing old style basic dialog (SI controls) in binary data
  * @deprecated Deprecated
  */
trait XStarBasicDialogInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns binary data describing the SIDialog in SBX stream format */
  val Data: stdLib.SafeArray[scala.Double]
  /** returns the name of the dialog */
  val Name: java.lang.String
  /** returns binary data describing the SIDialog in SBX stream format */
  def getData(): stdLib.SafeArray[scala.Double]
  /** returns the name of the dialog */
  def getName(): java.lang.String
}

object XStarBasicDialogInfo {
  @scala.inline
  def apply(
    Data: stdLib.SafeArray[scala.Double],
    Name: java.lang.String,
    acquire: () => scala.Unit,
    getData: () => stdLib.SafeArray[scala.Double],
    getName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XStarBasicDialogInfo = {
    val __obj = js.Dynamic.literal(Data = Data, Name = Name, acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction0(getData), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStarBasicDialogInfo]
  }
}

