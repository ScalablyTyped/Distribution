package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows to get the scripting provider related to the object. */
trait XScriptProviderSupplier extends XInterface {
  /**
    * returns scripting provider related to the object.
    * @returns an object implementing {@link com.sun.star.script.provider.XScriptProvider} representing the script provider
    */
  val ScriptProvider: XScriptProvider
  /**
    * returns scripting provider related to the object.
    * @returns an object implementing {@link com.sun.star.script.provider.XScriptProvider} representing the script provider
    */
  def getScriptProvider(): XScriptProvider
}

object XScriptProviderSupplier {
  @scala.inline
  def apply(
    ScriptProvider: XScriptProvider,
    acquire: () => Unit,
    getScriptProvider: () => XScriptProvider,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptProviderSupplier = {
    val __obj = js.Dynamic.literal(ScriptProvider = ScriptProvider.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getScriptProvider = js.Any.fromFunction0(getScriptProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScriptProviderSupplier]
  }
}

