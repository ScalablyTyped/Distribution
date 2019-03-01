package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides read access to a static or dynamically changing {@link ContentResultSet} .
  *
  * For example, a {@link DynamicResultSet} is returned from the open-command executed by an {@link XCommandProcessor} of the service {@link Content} .
  */
trait CachedDynamicResultSet
  extends XDynamicResultSet
     with XSourceInitialization

object CachedDynamicResultSet {
  @scala.inline
  def apply(
    Capabilities: scala.Double,
    StaticResultSet: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    connectToCache: js.Function1[XDynamicResultSet, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getCapabilities: js.Function0[scala.Double],
    getStaticResultSet: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setListener: js.Function1[XDynamicResultSetListener, scala.Unit],
    setSource: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): CachedDynamicResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Capabilities")(Capabilities)
    __obj.updateDynamic("StaticResultSet")(StaticResultSet)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("connectToCache")(connectToCache)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getCapabilities")(getCapabilities)
    __obj.updateDynamic("getStaticResultSet")(getStaticResultSet)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setListener")(setListener)
    __obj.updateDynamic("setSource")(setSource)
    __obj.asInstanceOf[CachedDynamicResultSet]
  }
}

