package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a one-instance service that provides access to a set of Contents via ContentProviders.
  *
  * Traditionally, this service implements {@link com.sun.star.lang.XInitialization} and needed to be instantiated once with two arguments via {@link
  * com.sun.star.lang.XMultiComponentFactory.createInstanceWithArgumentsAndContext()} for configuration before it could be obtained via plain {@link
  * com.sun.star.lang.XMultiComponentFactory.createInstanceWithContext()} .
  *
  * However, the only pair of initialization arguments used in practice is `"Local"` / `"Office"` , so this service is simplified now to automatically
  * configure itself with that argument pair upon first instantiation.
  *
  * (For backwards compatibility, the service implementation still supports {@link com.sun.star.lang.XInitialization} and can still explicitly be
  * initialized via {@link com.sun.star.lang.XMultiComponentFactory.createInstanceWithArgumentsAndContext()} with two arguments of type string. These
  * strings are used as a pair of keys to retrieve a set of content provider descriptions from the configuration management (stored at
  * `org.openoffice.ucb.Configuration.ContentProviders.key1.SecondaryKeys.key2.ProviderData` within the configuration management's hierarchy). The
  * retrieved descriptions are in turn used to register the corresponding content provider services at the broker.)
  */
trait UniversalContentBroker extends XUniversalContentBroker {
  /**
    * The (default) constructor.
    *
    * (This default constructor is only mentioned explicitly for technical reasons, so that its implementation calls the service implementation's {@link
    * com.sun.star.lang.XInitialization.initialize()} .)
    */
  def create(): scala.Unit
}

object UniversalContentBroker {
  @scala.inline
  def apply(
    abort: scala.Double => scala.Unit,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => scala.Double,
    create: () => scala.Unit,
    createCommandIdentifier: () => scala.Double,
    createContentIdentifier: java.lang.String => XContentIdentifier,
    deregisterContentProvider: (XContentProvider, java.lang.String) => scala.Unit,
    dispose: () => scala.Unit,
    execute: (Command, scala.Double, XCommandEnvironment) => js.Any,
    queryContent: XContentIdentifier => XContent,
    queryContentProvider: java.lang.String => XContentProvider,
    queryContentProviders: () => stdLib.SafeArray[ContentProviderInfo],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerContentProvider: (XContentProvider, java.lang.String, scala.Boolean) => XContentProvider,
    release: () => scala.Unit,
    releaseCommandIdentifier: scala.Double => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): UniversalContentBroker = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), compareContentIds = js.Any.fromFunction2(compareContentIds), create = js.Any.fromFunction0(create), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterContentProvider = js.Any.fromFunction2(deregisterContentProvider), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), queryContent = js.Any.fromFunction1(queryContent), queryContentProvider = js.Any.fromFunction1(queryContentProvider), queryContentProviders = js.Any.fromFunction0(queryContentProviders), queryInterface = js.Any.fromFunction1(queryInterface), registerContentProvider = js.Any.fromFunction3(registerContentProvider), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[UniversalContentBroker]
  }
}

