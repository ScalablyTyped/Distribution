package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link RemoteAccessContentProvider} is a {@link ContentProvider} that provides access to contents available at other (remote) UCBs. */
trait RemoteAccessContentProvider extends ContentProvider

object RemoteAccessContentProvider {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    compareContentIds: js.Function2[XContentIdentifier, XContentIdentifier, scala.Double],
    createContentIdentifier: js.Function1[java.lang.String, XContentIdentifier],
    deregisterInstance: js.Function2[java.lang.String, java.lang.String, XContentProvider],
    queryContent: js.Function1[XContentIdentifier, XContent],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerInstance: js.Function3[java.lang.String, java.lang.String, scala.Boolean, XContentProvider],
    release: js.Function0[scala.Unit]
  ): RemoteAccessContentProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire, compareContentIds = compareContentIds, createContentIdentifier = createContentIdentifier, deregisterInstance = deregisterInstance, queryContent = queryContent, queryInterface = queryInterface, registerInstance = registerInstance, release = release)
  
    __obj.asInstanceOf[RemoteAccessContentProvider]
  }
}

