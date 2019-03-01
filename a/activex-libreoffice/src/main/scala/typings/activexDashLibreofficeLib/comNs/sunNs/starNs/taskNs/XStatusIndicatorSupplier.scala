package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XStatusIndicatorFactory} instead of this
  * @deprecated Deprecated
  */
trait XStatusIndicatorSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * use {@link XStatusIndicatorFactory.createStatusIndicator()} instead of this
    * @deprecated Deprecated
    */
  val StatusIndicator: XStatusIndicator
  /**
    * use {@link XStatusIndicatorFactory.createStatusIndicator()} instead of this
    * @deprecated Deprecated
    */
  def getStatusIndicator(): XStatusIndicator
}

object XStatusIndicatorSupplier {
  @scala.inline
  def apply(
    StatusIndicator: XStatusIndicator,
    acquire: js.Function0[scala.Unit],
    getStatusIndicator: js.Function0[XStatusIndicator],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XStatusIndicatorSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("StatusIndicator")(StatusIndicator)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getStatusIndicator")(getStatusIndicator)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XStatusIndicatorSupplier]
  }
}

