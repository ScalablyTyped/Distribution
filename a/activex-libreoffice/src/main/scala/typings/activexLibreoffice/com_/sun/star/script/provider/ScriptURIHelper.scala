package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is used to help transform Scripting Framework storage locations to Scripting Framework script URIs and vice versa. */
trait ScriptURIHelper extends XScriptURIHelper {
  /**
    * create a new {@link ScriptURIHelper}
    * @param language The name of the scripting language for which this {@link ScriptURIHelper} is being created. It should be the same as the language name u
    * @param location This location which was passed to the {@link LanguageScriptProvider} by the Scripting Framework on its creation
    * @throws com::sun::star::lang::IllegalArgumentException
    */
  def create(language: String, location: String): Unit
}

object ScriptURIHelper {
  @scala.inline
  def apply(
    RootStorageURI: String,
    acquire: () => Unit,
    create: (String, String) => Unit,
    getRootStorageURI: () => String,
    getScriptURI: String => String,
    getStorageURI: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ScriptURIHelper = {
    val __obj = js.Dynamic.literal(RootStorageURI = RootStorageURI.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction2(create), getRootStorageURI = js.Any.fromFunction0(getRootStorageURI), getScriptURI = js.Any.fromFunction1(getScriptURI), getStorageURI = js.Any.fromFunction1(getStorageURI), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ScriptURIHelper]
  }
}

