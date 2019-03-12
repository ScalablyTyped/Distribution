package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationRegistry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.XSimpleRegistry
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushable

object ConfigurationRegistry {
  @scala.inline
  def apply(
    RootKey: activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.XRegistryKey,
    URL: java.lang.String,
    acquire: () => scala.Unit,
    addFlushListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener => scala.Unit,
    close: () => scala.Unit,
    destroy: () => scala.Unit,
    flush: () => scala.Unit,
    getRootKey: () => activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.XRegistryKey,
    getURL: () => java.lang.String,
    isReadOnly: () => scala.Boolean,
    isValid: () => scala.Boolean,
    mergeKey: (java.lang.String, java.lang.String) => scala.Unit,
    open: (java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeFlushListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener => scala.Unit
  ): ConfigurationRegistry = {
    val __obj = js.Dynamic.literal(RootKey = RootKey, URL = URL, acquire = js.Any.fromFunction0(acquire), addFlushListener = js.Any.fromFunction1(addFlushListener), close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), getRootKey = js.Any.fromFunction0(getRootKey), getURL = js.Any.fromFunction0(getURL), isReadOnly = js.Any.fromFunction0(isReadOnly), isValid = js.Any.fromFunction0(isValid), mergeKey = js.Any.fromFunction2(mergeKey), open = js.Any.fromFunction3(open), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFlushListener = js.Any.fromFunction1(removeFlushListener))
  
    __obj.asInstanceOf[ConfigurationRegistry]
  }
}

