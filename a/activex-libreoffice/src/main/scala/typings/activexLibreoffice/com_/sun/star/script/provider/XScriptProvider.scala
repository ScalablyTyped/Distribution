package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface provides a factory for obtaining objects implementing the {@link XScript} interface. */
@js.native
trait XScriptProvider extends XInterface {
  
  /**
    * a factory method for the creation of {@link XScript} implementations.
    * @param sScriptURI is the logical or language-dependent script URI
    * @returns an object implementing {@link com.sun.star.script.provider.XScript} representing the script
    * @throws com::sun::star::script::provider::ScriptFrameworkErrorException Framework error getting script for URI.
    */
  def getScript(sScriptURI: String): XScript = js.native
}
object XScriptProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getScript: String => XScript,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getScript = js.Any.fromFunction1(getScript), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScriptProvider]
  }
  
  @scala.inline
  implicit class XScriptProviderOps[Self <: XScriptProvider] (val x: Self) extends AnyVal {
    
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
    def setGetScript(value: String => XScript): Self = this.set("getScript", js.Any.fromFunction1(value))
  }
}
