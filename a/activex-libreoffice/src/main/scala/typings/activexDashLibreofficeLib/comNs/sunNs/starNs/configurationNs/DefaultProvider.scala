package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XLocalizable {
  /**
    * Property to enable/disable asynchronous write-back from in-memory cache to backend(s)
    * @since OOo 2.0
    */
  var EnableAsync: scala.Boolean = js.native
}

