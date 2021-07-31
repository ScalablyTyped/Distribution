package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides read access to a static or dynamically changing {@link ContentResultSet} .
  *
  * For example, a {@link DynamicResultSet} is returned from the open-command executed by an {@link XCommandProcessor} of the service {@link Content} .
  */
trait CachedDynamicResultSetStub
  extends StObject
     with XDynamicResultSet
     with XSourceInitialization
object CachedDynamicResultSetStub {
  
  @scala.inline
  def apply(
    Capabilities: Double,
    StaticResultSet: XResultSet,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    connectToCache: XDynamicResultSet => Unit,
    dispose: () => Unit,
    getCapabilities: () => Double,
    getStaticResultSet: () => XResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setListener: XDynamicResultSetListener => Unit,
    setSource: XInterface => Unit
  ): CachedDynamicResultSetStub = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], StaticResultSet = StaticResultSet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), connectToCache = js.Any.fromFunction1(connectToCache), dispose = js.Any.fromFunction0(dispose), getCapabilities = js.Any.fromFunction0(getCapabilities), getStaticResultSet = js.Any.fromFunction0(getStaticResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setListener = js.Any.fromFunction1(setListener), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[CachedDynamicResultSetStub]
  }
}
