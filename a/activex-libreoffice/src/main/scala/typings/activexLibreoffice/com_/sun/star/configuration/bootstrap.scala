package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.com_.sun.star.uno.XComponentContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("com.sun.star.configuration.bootstrap")
@js.native
object bootstrap extends js.Object {
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

