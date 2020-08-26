package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provide access to a collection of remote content providers.
  * @author Stephan Bergmann
  * @see XRemoteContentProviderAcceptor
  * @version 1.0
  */
@js.native
trait XRemoteContentProviderSupplier extends XInterface {
  /**
    * Get a factory through which a remote content provider's {@link UniversalContentBroker} service can be instantiated.
    * @param Identifier An arbitrary identifier uniquely identifying a remote content provider.
    * @returns the appropriate factory, or null if none is available.
    */
  def queryRemoteContentProvider(Identifier: String): XMultiServiceFactory = js.native
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
  implicit class XRemoteContentProviderSupplierOps[Self <: XRemoteContentProviderSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueryRemoteContentProvider(value: String => XMultiServiceFactory): Self = this.set("queryRemoteContentProvider", js.Any.fromFunction1(value))
  }
  
}

