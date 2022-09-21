package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyBinding extends StObject {
  
  def addKeyboardHandler(handler: KeyboardHandler): Unit = js.native
  def addKeyboardHandler(handler: KeyboardHandler, pos: Double): Unit = js.native
  
  def getKeyboardHandler(): KeyboardHandler = js.native
  
  def getStatusText(): String = js.native
  
  def onCommandKey(e: Any, hashId: Double, keyCode: Double): Boolean = js.native
  
  def onTextInput(text: String): Boolean = js.native
  
  def removeKeyboardHandler(handler: KeyboardHandler): Boolean = js.native
  
  def setDefaultHandler(handler: KeyboardHandler): Unit = js.native
  
  def setKeyboardHandler(handler: KeyboardHandler): Unit = js.native
}
