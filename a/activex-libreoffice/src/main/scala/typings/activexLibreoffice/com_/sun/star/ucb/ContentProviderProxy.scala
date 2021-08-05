package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a proxy for a content provider.
  *
  * Implementing a content provider proxy can be useful if the creation of the real content provider object shall be deferred for some reason (i.e.
  * performance) until the first method gets called on it. Instead of instantiating and registering the real provider at the UCB, a proxy for the real
  * provider can be created and registered at the UCB.
  * @see XContentProviderProxyFactory
  */
trait ContentProviderProxy
  extends StObject
     with XContentProviderSupplier
     with XContentProvider
     with XParameterizedContentProvider
object ContentProviderProxy {
  
  inline def apply(
    ContentProvider: XContentProvider,
    acquire: () => Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    deregisterInstance: (String, String) => XContentProvider,
    getContentProvider: () => XContentProvider,
    queryContent: XContentIdentifier => XContent,
    queryInterface: `type` => js.Any,
    registerInstance: (String, String, Boolean) => XContentProvider,
    release: () => Unit
  ): ContentProviderProxy = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), compareContentIds = js.Any.fromFunction2(compareContentIds), deregisterInstance = js.Any.fromFunction2(deregisterInstance), getContentProvider = js.Any.fromFunction0(getContentProvider), queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), registerInstance = js.Any.fromFunction3(registerInstance), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ContentProviderProxy]
  }
}
