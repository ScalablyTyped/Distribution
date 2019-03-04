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
trait CachedDynamicResultSetStub
  extends XDynamicResultSet
     with XSourceInitialization

object CachedDynamicResultSetStub {
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
  ): CachedDynamicResultSetStub = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities, StaticResultSet = StaticResultSet, acquire = acquire, addEventListener = addEventListener, connectToCache = connectToCache, dispose = dispose, getCapabilities = getCapabilities, getStaticResultSet = getStaticResultSet, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setListener = setListener, setSource = setSource)
  
    __obj.asInstanceOf[CachedDynamicResultSetStub]
  }
}

