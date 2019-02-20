package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The description of a change to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait RemoteContentProviderChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** An indicator whether a remote content provider has been added or removed. */
  var Action: RemoteContentProviderChangeAction
  /** The identifier with which the remote content provider is registered at the {@link com.sun.star.ucb.XRemoteContentProviderSupplier} . */
  var Identifier: java.lang.String
}

