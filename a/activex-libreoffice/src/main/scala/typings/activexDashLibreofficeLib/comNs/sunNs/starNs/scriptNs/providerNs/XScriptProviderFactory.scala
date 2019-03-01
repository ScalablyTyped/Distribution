package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides a factory for obtaining objects implementing the {@link XScriptProvider} interface. */
trait XScriptProviderFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * a factory method for the creation of XScriptProviders implementations.
    * @param Context is context for which the {@link ScriptProvider} is to be created for
    * @returns an object implementing {@link com.sun.star.script.provider.XScriptProvider}
    * @throws com::sun::star::lang::IllegalArgumentException if illegal or unknown context is passed
    */
  def createScriptProvider(Context: js.Any): XScriptProvider
}

object XScriptProviderFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createScriptProvider: js.Function1[js.Any, XScriptProvider],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XScriptProviderFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createScriptProvider")(createScriptProvider)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XScriptProviderFactory]
  }
}

