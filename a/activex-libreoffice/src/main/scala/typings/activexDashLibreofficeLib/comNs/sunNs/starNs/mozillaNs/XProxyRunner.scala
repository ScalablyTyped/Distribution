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
    Run: XCodeProxy => scala.Double,
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XProxyRunner = {
    val __obj = js.Dynamic.literal(Run = js.Any.fromFunction1(Run), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XProxyRunner]
  }
}

