package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects which supply different modes. */
trait XModeSelector extends XInterface {
  /** @returns the current mode. */
  var Mode: String
  /** @returns a sequence of all supported modes. */
  val SupportedModes: SafeArray[String]
  /** @returns the current mode. */
  def getMode(): String
  /** @returns a sequence of all supported modes. */
  def getSupportedModes(): SafeArray[String]
  /** sets a new mode for the implementing object. */
  def setMode(aMode: String): Unit
  /** asks whether a mode is supported or not. */
  def supportsMode(aMode: String): Boolean
}

object XModeSelector {
  @scala.inline
  def apply(
    Mode: String,
    SupportedModes: SafeArray[String],
    acquire: () => Unit,
    getMode: () => String,
    getSupportedModes: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setMode: String => Unit,
    supportsMode: String => Boolean
  ): XModeSelector = {
    val __obj = js.Dynamic.literal(Mode = Mode, SupportedModes = SupportedModes, acquire = js.Any.fromFunction0(acquire), getMode = js.Any.fromFunction0(getMode), getSupportedModes = js.Any.fromFunction0(getSupportedModes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMode = js.Any.fromFunction1(setMode), supportsMode = js.Any.fromFunction1(supportsMode))
  
    __obj.asInstanceOf[XModeSelector]
  }
}

