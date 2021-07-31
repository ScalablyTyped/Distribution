package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provide access to a collection of remote content providers.
  * @author Stephan Bergmann
  * @see XRemoteContentProviderAcceptor
  * @version 1.0
  */
trait XRemoteContentProviderSupplier
  extends StObject
     with XInterface {
  
  /**
    * Get a factory through which a remote content provider's {@link UniversalContentBroker} service can be instantiated.
    * @param Identifier An arbitrary identifier uniquely identifying a remote content provider.
    * @returns the appropriate factory, or null if none is available.
    */
  def queryRemoteContentProvider(Identifier: String): XMultiServiceFactory
}
object XRemoteContentProviderSupplier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    queryRemoteContentProvider: String => XMultiServiceFactory,
    release: () => Unit
  ): XRemoteContentProviderSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), queryRemoteContentProvider = js.Any.fromFunction1(queryRemoteContentProvider), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRemoteContentProviderSupplier]
  }
  
  @scala.inline
  implicit class XRemoteContentProviderSupplierMutableBuilder[Self <: XRemoteContentProviderSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryRemoteContentProvider(value: String => XMultiServiceFactory): Self = StObject.set(x, "queryRemoteContentProvider", js.Any.fromFunction1(value))
  }
}
