package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides multiple, probably parallel running, status indicator objects
  *
  * A possible factory is the {@link com.sun.star.frame.Frame} service.
  * @see com.sun.star.frame.Frame
  */
trait XStatusIndicatorFactory extends XInterface {
  /**
    * create a new status indicator instance
    * @returns the new indicator
    */
  def createStatusIndicator(): XStatusIndicator
}

object XStatusIndicatorFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createStatusIndicator: () => XStatusIndicator,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStatusIndicatorFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createStatusIndicator = js.Any.fromFunction0(createStatusIndicator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStatusIndicatorFactory]
  }
}

