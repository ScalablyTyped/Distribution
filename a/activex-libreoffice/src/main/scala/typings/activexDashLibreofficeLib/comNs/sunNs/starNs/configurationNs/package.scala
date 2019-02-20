package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configurationNs {
  /** is thrown when an application tries to create a configuration provider but the configuration can't be loaded */
  type CannotLoadConfigurationException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * This exception is thrown in case the global UI configuration (including menubars/toolbars and accelerators) does not exists or contains corrupted
    * data.
    * @since OOo 2.3
    */
  type CorruptedUIConfigurationException = CorruptedConfigurationException
  /** is thrown when creating a configuration provider fails because the user's installation for the is missing or incomplete */
  type InstallationIncompleteException = CannotLoadConfigurationException
  type Update = XUpdate
  /**
    * The default {@link ConfigurationProvider} .
    *
    * This singleton somewhat arbitrarily makes available the {@link com.sun.star.lang.XMultiServiceFactory} interface of the (old-style) {@link
    * DefaultProvider} service, as it is the most frequently used one. See the {@link DefaultProvider} service for details.
    * @since OOo 1.1.2
    */
  type theDefaultProvider = activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
}
