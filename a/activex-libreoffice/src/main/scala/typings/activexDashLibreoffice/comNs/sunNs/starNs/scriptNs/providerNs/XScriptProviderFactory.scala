package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.providerNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides a factory for obtaining objects implementing the {@link XScriptProvider} interface. */
trait XScriptProviderFactory extends XInterface {
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
    acquire: () => Unit,
    createScriptProvider: js.Any => XScriptProvider,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptProviderFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createScriptProvider = js.Any.fromFunction1(createScriptProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XScriptProviderFactory]
  }
}

