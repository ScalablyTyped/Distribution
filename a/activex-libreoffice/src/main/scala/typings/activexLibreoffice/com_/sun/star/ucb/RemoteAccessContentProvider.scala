package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A {@link RemoteAccessContentProvider} is a {@link ContentProvider} that provides access to contents available at other (remote) UCBs. */
@js.native
trait RemoteAccessContentProvider
  extends XContentProvider
     with XContentIdentifierFactory
     with XParameterizedContentProvider
object RemoteAccessContentProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    createContentIdentifier: String => XContentIdentifier,
    deregisterInstance: (String, String) => XContentProvider,
    queryContent: XContentIdentifier => XContent,
    queryInterface: `type` => js.Any,
    registerInstance: (String, String, Boolean) => XContentProvider,
    release: () => Unit
  ): RemoteAccessContentProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compareContentIds = js.Any.fromFunction2(compareContentIds), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterInstance = js.Any.fromFunction2(deregisterInstance), queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), registerInstance = js.Any.fromFunction3(registerInstance), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[RemoteAccessContentProvider]
  }
}
