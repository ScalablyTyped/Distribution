package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(StatusIndicator = StatusIndicator.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStatusIndicator = js.Any.fromFunction0(getStatusIndicator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStatusIndicatorSupplier]
  }
}

