package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XComponentContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bootstrapNs {
  /**
    * provides access to a component context that is enhanced with bootstrap parameters for configuration services from the associated metaconfiguration
    * mechanism.
    *
    * The contained settings are used to initialize the {@link com.sun.star.configuration.DefaultProvider} and {@link
    * com.sun.star.configuration.backend.DefaultBackend} of the component context.
    *
    * The implementation is usually available as a singleton in the context that it wraps..
    * @deprecated Deprecated
    * @since OOo 1.1.2
    */
  type BootstrapContext = XComponentContext
}
