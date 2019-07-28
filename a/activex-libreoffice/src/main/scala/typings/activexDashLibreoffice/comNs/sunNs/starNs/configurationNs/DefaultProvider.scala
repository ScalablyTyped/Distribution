package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XLocalizable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XFlushable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a {@link ConfigurationProvider} , that is the default {@link ConfigurationProvider} for its {@link com.sun.star.uno.XComponentContext} .
  *
  * This object is accessible as singleton {@link theDefaultProvider}
  *
  * .
  * @since OOo 1.1.2
  */
@js.native
trait DefaultProvider
  extends ConfigurationProvider
     with XRefreshable
     with XFlushable
     with XLocalizable {
  /**
    * Property to enable/disable asynchronous write-back from in-memory cache to backend(s)
    * @since OOo 2.0
    */
  var EnableAsync: Boolean = js.native
}

