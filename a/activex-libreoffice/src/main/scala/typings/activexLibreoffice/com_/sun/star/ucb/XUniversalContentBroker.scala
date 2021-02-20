package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.0 */
@js.native
trait XUniversalContentBroker
  extends XCommandProcessor2
     with XComponent
     with XContentProvider
     with XContentProviderManager
     with XContentIdentifierFactory
object XUniversalContentBroker {
  
  @scala.inline
  def apply(
    abort: Double => Unit,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    createCommandIdentifier: () => Double,
    createContentIdentifier: String => XContentIdentifier,
    deregisterContentProvider: (XContentProvider, String) => Unit,
    dispose: () => Unit,
    execute: (Command, Double, XCommandEnvironment) => js.Any,
    queryContent: XContentIdentifier => XContent,
    queryContentProvider: String => XContentProvider,
    queryContentProviders: () => SafeArray[ContentProviderInfo],
    queryInterface: `type` => js.Any,
    registerContentProvider: (XContentProvider, String, Boolean) => XContentProvider,
    release: () => Unit,
    releaseCommandIdentifier: Double => Unit,
    removeEventListener: XEventListener => Unit
  ): XUniversalContentBroker = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), compareContentIds = js.Any.fromFunction2(compareContentIds), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterContentProvider = js.Any.fromFunction2(deregisterContentProvider), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), queryContent = js.Any.fromFunction1(queryContent), queryContentProvider = js.Any.fromFunction1(queryContentProvider), queryContentProviders = js.Any.fromFunction0(queryContentProviders), queryInterface = js.Any.fromFunction1(queryInterface), registerContentProvider = js.Any.fromFunction3(registerContentProvider), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XUniversalContentBroker]
  }
}
