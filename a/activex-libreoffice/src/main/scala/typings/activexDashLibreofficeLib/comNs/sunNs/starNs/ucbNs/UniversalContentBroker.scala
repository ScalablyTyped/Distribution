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

