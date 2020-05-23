package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides a factory for obtaining objects implementing the {@link XScript} interface. */
trait XScriptProvider extends XInterface {
  /**
    * a factory method for the creation of {@link XScript} implementations.
    * @param sScriptURI is the logical or language-dependent script URI
    * @returns an object implementing {@link com.sun.star.script.provider.XScript} representing the script
    * @throws com::sun::star::script::provider::ScriptFrameworkErrorException Framework error getting script for URI.
    */
  def getScript(sScriptURI: String): XScript
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
}

