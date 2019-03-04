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
    abort: js.Function1[scala.Double, scala.Unit],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    compareContentIds: js.Function2[XContentIdentifier, XContentIdentifier, scala.Double],
    create: js.Function0[scala.Unit],
    createCommandIdentifier: js.Function0[scala.Double],
    createContentIdentifier: js.Function1[java.lang.String, XContentIdentifier],
    deregisterContentProvider: js.Function2[XContentProvider, java.lang.String, scala.Unit],
    dispose: js.Function0[scala.Unit],
    execute: js.Function3[Command, scala.Double, XCommandEnvironment, js.Any],
    queryContent: js.Function1[XContentIdentifier, XContent],
    queryContentProvider: js.Function1[java.lang.String, XContentProvider],
    queryContentProviders: js.Function0[activexDashInteropLib.SafeArray[ContentProviderInfo]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerContentProvider: js.Function3[XContentProvider, java.lang.String, scala.Boolean, XContentProvider],
    release: js.Function0[scala.Unit],
    releaseCommandIdentifier: js.Function1[scala.Double, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): UniversalContentBroker = {
    val __obj = js.Dynamic.literal(abort = abort, acquire = acquire, addEventListener = addEventListener, compareContentIds = compareContentIds, create = create, createCommandIdentifier = createCommandIdentifier, createContentIdentifier = createContentIdentifier, deregisterContentProvider = deregisterContentProvider, dispose = dispose, execute = execute, queryContent = queryContent, queryContentProvider = queryContentProvider, queryContentProviders = queryContentProviders, queryInterface = queryInterface, registerContentProvider = registerContentProvider, release = release, releaseCommandIdentifier = releaseCommandIdentifier, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[UniversalContentBroker]
  }
}

