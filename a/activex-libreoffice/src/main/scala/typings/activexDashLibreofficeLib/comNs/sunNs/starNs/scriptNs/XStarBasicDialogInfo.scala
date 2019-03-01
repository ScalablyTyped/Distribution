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
  val Data: activexDashInteropLib.SafeArray[scala.Double]
  /** returns the name of the dialog */
  val Name: java.lang.String
  /** returns binary data describing the SIDialog in SBX stream format */
  def getData(): activexDashInteropLib.SafeArray[scala.Double]
  /** returns the name of the dialog */
  def getName(): java.lang.String
}

object XStarBasicDialogInfo {
  @scala.inline
  def apply(
    Data: activexDashInteropLib.SafeArray[scala.Double],
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getData: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XStarBasicDialogInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Data")(Data)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XStarBasicDialogInfo]
  }
}

