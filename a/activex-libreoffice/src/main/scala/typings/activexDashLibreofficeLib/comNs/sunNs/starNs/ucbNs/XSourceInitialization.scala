package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the initialization of a component with any source object. */
trait XSourceInitialization
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides the initialization of a component with any source object.
    *
    * The service description has to specify which type of interface must be set as parameter.
    *
    * Hopefully you will only use this, when **Source** is an {@link com.sun.star.lang.XComponent} and this is an {@link com.sun.star.lang.XEventListener} .
    * Than you should call {@link com.sun.star.lang.XComponent.addEventListener()} from inside the implementation of this method.
    * @param Source the source.
    * @throws AlreadyInitializedException if this method is called more than once during the lifetime of the object implementing this interface.
    */
  def setSource(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
}

object XSourceInitialization {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setSource: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XSourceInitialization = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setSource")(setSource)
    __obj.asInstanceOf[XSourceInitialization]
  }
}

