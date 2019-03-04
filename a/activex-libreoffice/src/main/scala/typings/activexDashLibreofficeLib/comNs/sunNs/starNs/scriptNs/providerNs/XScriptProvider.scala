package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides a factory for obtaining objects implementing the {@link XScript} interface. */
trait XScriptProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * a factory method for the creation of {@link XScript} implementations.
    * @param sScriptURI is the logical or language-dependent script URI
    * @returns an object implementing {@link com.sun.star.script.provider.XScript} representing the script
    * @throws com::sun::star::script::provider::ScriptFrameworkErrorException Framework error getting script for URI.
    */
  def getScript(sScriptURI: java.lang.String): XScript
}

object XScriptProvider {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getScript: js.Function1[java.lang.String, XScript],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XScriptProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire, getScript = getScript, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XScriptProvider]
  }
}

