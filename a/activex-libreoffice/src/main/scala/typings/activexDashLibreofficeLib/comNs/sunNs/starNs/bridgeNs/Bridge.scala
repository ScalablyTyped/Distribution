package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This meta service allows the bridgefactory service to instantiate an interprocess bridge using a certain transfer protocol.
  *
  * Components, that support a certain protocol, must have at least two service names:
  *
  * {@link com.sun.star.bridge.Bridge}arbitrary-module-path.ProtocolnameBridge
  *
  * The protocol name should be written as common servicenames, first letter is a capital letter, the rest in small letters postfixed by {@link Bridge}
  * (e.g.: `com.sun.star.bridge.UrpBridge` would be correct servicename for the "urp" protocol). However, the protocol names are compared case
  * insensitive. If there exist two services supporting the same protocol, it is arbitrary which one is chosen, so this should be omitted.
  */
trait Bridge
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with XBridge
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object Bridge {
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
  ): Bridge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getDescription")(getDescription)
    __obj.updateDynamic("getInstance")(getInstance)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[Bridge]
  }
}

