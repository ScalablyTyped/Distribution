package typings.activexLibreoffice.com_.sun.star.mozilla

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface run Mozilla XPCOM code in a managed environment
  * @see com.sun.star.mozilla.XProfileDiscover
  * @see com.sun.star.mozilla.MozillaBootstrap
  */
trait XProxyRunner extends XInterface {
  /**
    * attempts to Run XPCOM code in a managed environment
    * @param aCode is a com:sun:star:mozilla: {@link XCodeProxy} object to be run.
    * @returns the error code, is 0 when no error happened.
    */
  def Run(aCode: XCodeProxy): Double
}

object XProxyRunner {
  @scala.inline
  def apply(
    Run: XCodeProxy => Double,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XProxyRunner = {
    val __obj = js.Dynamic.literal(Run = js.Any.fromFunction1(Run), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XProxyRunner]
  }
}

