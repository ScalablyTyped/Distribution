package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a proxy for a content provider.
  *
  * Implementing a content provider proxy can be useful if the creation of the real content provider object shall be deferred for some reason (i.e.
  * performance) until the first method gets called on it. Instead of instantiating and registering the real provider at the UCB, a proxy for the real
  * provider can be created and registered at the UCB.
  * @see XContentProviderProxyFactory
  */
trait ContentProviderProxy
  extends XContentProviderSupplier
     with XContentProvider
     with XParameterizedContentProvider

