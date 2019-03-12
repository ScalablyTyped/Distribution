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
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    connectToCache: XDynamicResultSet => scala.Unit,
    dispose: () => scala.Unit,
    getCapabilities: () => scala.Double,
    getStaticResultSet: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setListener: XDynamicResultSetListener => scala.Unit,
    setSource: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit
  ): CachedDynamicResultSet = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities, StaticResultSet = StaticResultSet, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), connectToCache = js.Any.fromFunction1(connectToCache), dispose = js.Any.fromFunction0(dispose), getCapabilities = js.Any.fromFunction0(getCapabilities), getStaticResultSet = js.Any.fromFunction0(getStaticResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setListener = js.Any.fromFunction1(setListener), setSource = js.Any.fromFunction1(setSource))
  
    __obj.asInstanceOf[CachedDynamicResultSet]
  }
}

