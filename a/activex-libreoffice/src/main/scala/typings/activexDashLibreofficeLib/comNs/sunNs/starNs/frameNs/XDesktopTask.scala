package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XFrame} instead of this
  * @deprecated Deprecated
  */
trait XDesktopTask
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * use {@link com.sun.star.util.XCloseable} or {@link com.sun.star.lang.XComponent.dispose()} instead.
    * @deprecated Deprecated
    */
  def close(): scala.Boolean
  /**
    * use {@link com.sun.star.lang.XInitialization} instead.
    * @deprecated Deprecated
    */
  def initialize(TaskWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): scala.Unit
}

