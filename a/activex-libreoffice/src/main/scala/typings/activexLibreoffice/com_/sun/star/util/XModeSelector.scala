package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is supported by objects which supply different modes. */
@js.native
trait XModeSelector extends XInterface {
  
  /** @returns the current mode. */
  var Mode: String = js.native
  
  /** @returns a sequence of all supported modes. */
  val SupportedModes: SafeArray[String] = js.native
  
  /** @returns the current mode. */
  def getMode(): String = js.native
  
  /** @returns a sequence of all supported modes. */
  def getSupportedModes(): SafeArray[String] = js.native
  
  /** sets a new mode for the implementing object. */
  def setMode(aMode: String): Unit = js.native
  
  /** asks whether a mode is supported or not. */
  def supportsMode(aMode: String): Boolean = js.native
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
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], SupportedModes = SupportedModes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMode = js.Any.fromFunction0(getMode), getSupportedModes = js.Any.fromFunction0(getSupportedModes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMode = js.Any.fromFunction1(setMode), supportsMode = js.Any.fromFunction1(supportsMode))
    __obj.asInstanceOf[XModeSelector]
  }
  
  @scala.inline
  implicit class XModeSelectorOps[Self <: XModeSelector] (val x: Self) extends AnyVal {
    
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
    def setMode(value: String): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedModes(value: SafeArray[String]): Self = this.set("SupportedModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMode(value: () => String): Self = this.set("getMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedModes(value: () => SafeArray[String]): Self = this.set("getSupportedModes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMode(value: String => Unit): Self = this.set("setMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSupportsMode(value: String => Boolean): Self = this.set("supportsMode", js.Any.fromFunction1(value))
  }
}
