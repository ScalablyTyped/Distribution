package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is supported by objects which supply different modes. */
trait XModeSelector
  extends StObject
     with XInterface {
  
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
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], SupportedModes = SupportedModes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMode = js.Any.fromFunction0(getMode), getSupportedModes = js.Any.fromFunction0(getSupportedModes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMode = js.Any.fromFunction1(setMode), supportsMode = js.Any.fromFunction1(supportsMode))
    __obj.asInstanceOf[XModeSelector]
  }
  
  @scala.inline
  implicit class XModeSelectorMutableBuilder[Self <: XModeSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMode(value: () => String): Self = StObject.set(x, "getMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedModes(value: () => SafeArray[String]): Self = StObject.set(x, "getSupportedModes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetMode(value: String => Unit): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSupportedModes(value: SafeArray[String]): Self = StObject.set(x, "SupportedModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsMode(value: String => Boolean): Self = StObject.set(x, "supportsMode", js.Any.fromFunction1(value))
  }
}
