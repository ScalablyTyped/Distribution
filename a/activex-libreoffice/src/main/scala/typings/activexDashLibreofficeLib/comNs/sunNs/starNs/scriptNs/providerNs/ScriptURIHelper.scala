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

