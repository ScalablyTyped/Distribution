package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides a factory for obtaining objects implementing the {@link XScriptProvider} interface. */
@js.native
trait XScriptProviderFactory extends XInterface {
  /**
    * a factory method for the creation of XScriptProviders implementations.
    * @param Context is context for which the {@link ScriptProvider} is to be created for
    * @returns an object implementing {@link com.sun.star.script.provider.XScriptProvider}
    * @throws com::sun::star::lang::IllegalArgumentException if illegal or unknown context is passed
    */
  def createScriptProvider(Context: js.Any): XScriptProvider = js.native
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
  @scala.inline
  implicit class XScriptProviderFactoryOps[Self <: XScriptProviderFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateScriptProvider(value: js.Any => XScriptProvider): Self = this.set("createScriptProvider", js.Any.fromFunction1(value))
  }
  
}

