package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface run Mozilla XPCOM code in a managed environment
  * @see com.sun.star.mozilla.XProfileDiscover
  * @see com.sun.star.mozilla.MozillaBootstrap
  */
trait XProxyRunner
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * attempts to Run XPCOM code in a managed environment
    * @param aCode is a com:sun:star:mozilla: {@link XCodeProxy} object to be run.
    * @returns the error code, is 0 when no error happened.
    */
  def Run(aCode: XCodeProxy): scala.Double
}

object XProxyRunner {
  @scala.inline
  def apply(
    Run: js.Function1[XCodeProxy, scala.Double],
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XProxyRunner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Run")(Run)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XProxyRunner]
  }
}

