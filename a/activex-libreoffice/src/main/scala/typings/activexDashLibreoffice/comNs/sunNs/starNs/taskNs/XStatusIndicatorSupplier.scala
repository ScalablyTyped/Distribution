package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XStatusIndicatorFactory} instead of this
  * @deprecated Deprecated
  */
trait XStatusIndicatorSupplier extends XInterface {
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
    acquire: () => Unit,
    getStatusIndicator: () => XStatusIndicator,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStatusIndicatorSupplier = {
    val __obj = js.Dynamic.literal(StatusIndicator = StatusIndicator, acquire = js.Any.fromFunction0(acquire), getStatusIndicator = js.Any.fromFunction0(getStatusIndicator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStatusIndicatorSupplier]
  }
}

