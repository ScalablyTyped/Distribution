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
    acquire: js.Function0[scala.Unit],
    addFlushListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener, scala.Unit],
    close: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    getRootKey: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.XRegistryKey],
    getURL: js.Function0[java.lang.String],
    isReadOnly: js.Function0[scala.Boolean],
    isValid: js.Function0[scala.Boolean],
    mergeKey: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    open: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeFlushListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener, scala.Unit]
  ): ConfigurationRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RootKey")(RootKey)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addFlushListener")(addFlushListener)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("getRootKey")(getRootKey)
    __obj.updateDynamic("getURL")(getURL)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("mergeKey")(mergeKey)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeFlushListener")(removeFlushListener)
    __obj.asInstanceOf[ConfigurationRegistry]
  }
}

