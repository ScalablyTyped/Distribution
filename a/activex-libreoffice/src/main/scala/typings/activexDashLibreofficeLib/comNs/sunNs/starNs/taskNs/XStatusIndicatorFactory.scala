package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides multiple, probably parallel running, status indicator objects
  *
  * A possible factory is the {@link com.sun.star.frame.Frame} service.
  * @see com.sun.star.frame.Frame
  */
trait XStatusIndicatorFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * create a new status indicator instance
    * @returns the new indicator
    */
  def createStatusIndicator(): XStatusIndicator
}

