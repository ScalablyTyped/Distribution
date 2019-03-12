package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects which supply different modes. */
trait XModeSelector
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the current mode. */
  var Mode: java.lang.String
  /** @returns a sequence of all supported modes. */
  val SupportedModes: stdLib.SafeArray[java.lang.String]
  /** @returns the current mode. */
  def getMode(): java.lang.String
  /** @returns a sequence of all supported modes. */
  def getSupportedModes(): stdLib.SafeArray[java.lang.String]
  /** sets a new mode for the implementing object. */
  def setMode(aMode: java.lang.String): scala.Unit
  /** asks whether a mode is supported or not. */
  def supportsMode(aMode: java.lang.String): scala.Boolean
}

object XModeSelector {
  @scala.inline
  def apply(
    Mode: java.lang.String,
    SupportedModes: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getMode: () => java.lang.String,
    getSupportedModes: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setMode: java.lang.String => scala.Unit,
    supportsMode: java.lang.String => scala.Boolean
  ): XModeSelector = {
    val __obj = js.Dynamic.literal(Mode = Mode, SupportedModes = SupportedModes, acquire = js.Any.fromFunction0(acquire), getMode = js.Any.fromFunction0(getMode), getSupportedModes = js.Any.fromFunction0(getSupportedModes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMode = js.Any.fromFunction1(setMode), supportsMode = js.Any.fromFunction1(supportsMode))
  
    __obj.asInstanceOf[XModeSelector]
  }
}

