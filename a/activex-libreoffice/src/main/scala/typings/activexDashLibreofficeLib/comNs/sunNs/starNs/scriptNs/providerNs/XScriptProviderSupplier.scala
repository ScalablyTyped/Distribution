package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows to get the scripting provider related to the object. */
trait XScriptProviderSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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

