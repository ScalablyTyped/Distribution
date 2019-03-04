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

object XDesktopTask {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    close: js.Function0[scala.Boolean],
    dispose: js.Function0[scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XDesktopTask = {
    val __obj = js.Dynamic.literal(acquire = acquire, addEventListener = addEventListener, close = close, dispose = dispose, initialize = initialize, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XDesktopTask]
  }
}

