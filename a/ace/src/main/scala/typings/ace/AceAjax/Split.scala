package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Split extends StObject {
  
  var BELOW: Double = js.native
  
  var BESIDE: Double = js.native
  
  /**
    * Blurs the current editor.
    **/
  def blur(): Unit = js.native
  
  /**
    * Focuses the current editor.
    **/
  def focus(): Unit = js.native
  
  /**
    * Executes `callback` on all of the available editors.
    * @param callback A callback function to execute
    * @param scope The default scope for the callback
    **/
  def forEach(callback: js.Function, scope: String): Unit = js.native
  
  /**
    * Returns the current editor.
    **/
  def getCurrentEditor(): Editor = js.native
  
  /**
    * Returns the editor identified by the index `idx`.
    * @param idx The index of the editor you want
    **/
  def getEditor(idx: Double): Editor = js.native
  
  /**
    * Returns the orientation.
    **/
  def getOrientation(): Double = js.native
  
  /**
    * Returns the number of splits.
    **/
  def getSplits(): Double = js.native
  
  /**
    * Resizes the editor.
    **/
  def resize(): Unit = js.native
  
  /**
    * Sets the font size, in pixels, for all the available editors.
    * @param size The new font size
    **/
  def setFontSize(size: Double): Unit = js.native
  
  /**
    * Sets the keyboard handler for the editor.
    * @param keybinding
    **/
  def setKeyboardHandler(keybinding: String): Unit = js.native
  
  /**
    * Sets the orientation.
    * @param orientation The new orientation value
    **/
  def setOrientation(orientation: Double): Unit = js.native
  
  /**
    * Sets a new [[EditSession `EditSession`]] for the indicated editor.
    * @param session The new edit session
    * @param idx The editor's index you're interested in
    **/
  def setSession(session: IEditSession, idx: Double): Unit = js.native
  
  /**
    * Set the number of splits.
    * @param splits The number of splits
    **/
  def setSplits(): Unit = js.native
  def setSplits(splits: Double): Unit = js.native
  
  /**
    * Sets a theme for each of the available editors.
    * @param theme The name of the theme to set
    **/
  def setTheme(theme: String): Unit = js.native
}
