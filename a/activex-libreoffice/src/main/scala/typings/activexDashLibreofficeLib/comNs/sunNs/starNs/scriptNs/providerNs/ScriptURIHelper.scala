package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

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
  def create(language: java.lang.String, location: java.lang.String): scala.Unit
}

object ScriptURIHelper {
  @scala.inline
  def apply(
    RootStorageURI: java.lang.String,
    acquire: () => scala.Unit,
    create: (java.lang.String, java.lang.String) => scala.Unit,
    getRootStorageURI: () => java.lang.String,
    getScriptURI: java.lang.String => java.lang.String,
    getStorageURI: java.lang.String => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): ScriptURIHelper = {
    val __obj = js.Dynamic.literal(RootStorageURI = RootStorageURI, acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction2(create), getRootStorageURI = js.Any.fromFunction0(getRootStorageURI), getScriptURI = js.Any.fromFunction1(getScriptURI), getStorageURI = js.Any.fromFunction1(getStorageURI), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ScriptURIHelper]
  }
}

