package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.registry.XRegistryKey
import typings.activexLibreoffice.com_.sun.star.registry.XSimpleRegistry
import typings.activexLibreoffice.com_.sun.star.util.XFlushListener
import typings.activexLibreoffice.com_.sun.star.util.XFlushable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationRegistry
  extends XSimpleRegistry
     with XFlushable
object ConfigurationRegistry {
  
  @scala.inline
  def apply(
    RootKey: XRegistryKey,
    URL: String,
    acquire: () => Unit,
    addFlushListener: XFlushListener => Unit,
    close: () => Unit,
    destroy: () => Unit,
    flush: () => Unit,
    getRootKey: () => XRegistryKey,
    getURL: () => String,
    isReadOnly: () => Boolean,
    isValid: () => Boolean,
    mergeKey: (String, String) => Unit,
    open: (String, Boolean, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeFlushListener: XFlushListener => Unit
  ): ConfigurationRegistry = {
    val __obj = js.Dynamic.literal(RootKey = RootKey.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), getRootKey = js.Any.fromFunction0(getRootKey), getURL = js.Any.fromFunction0(getURL), isReadOnly = js.Any.fromFunction0(isReadOnly), isValid = js.Any.fromFunction0(isValid), mergeKey = js.Any.fromFunction2(mergeKey), open = js.Any.fromFunction3(open), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFlushListener = js.Any.fromFunction1(removeFlushListener))
    __obj.asInstanceOf[ConfigurationRegistry]
  }
}
