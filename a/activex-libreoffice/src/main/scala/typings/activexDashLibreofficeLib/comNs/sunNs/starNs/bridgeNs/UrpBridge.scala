package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Concrete service of the meta service {@link Bridge} for the urp protocol.
  *
  * This bridge works with the urp protocol.
  * @see com.sun.star.bridge.Bridge
  */
trait UrpBridge
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with XBridge
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object UrpBridge {
  @scala.inline
  def apply(
    Description: java.lang.String,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getDescription: js.Function0[java.lang.String],
    getInstance: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getName: js.Function0[java.lang.String],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): UrpBridge = {
    val __obj = js.Dynamic.literal(Description = Description, Name = Name, acquire = acquire, addEventListener = addEventListener, dispose = dispose, getDescription = getDescription, getInstance = getInstance, getName = getName, initialize = initialize, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[UrpBridge]
  }
}

