package typings.atom.toolBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBarManager extends js.Object {
  
  /** Adds a button. The input to this function is a `ButtonOptions` object */
  def addButton(options: ButtonOptions): ToolBarButtonView = js.native
  
  /** Adds a spacer. Optionally, you can pass a `SpacerOptions` object */
  def addSpacer(): ToolBarSpacerView = js.native
  def addSpacer(options: SpacerOptions): ToolBarSpacerView = js.native
  
  /** The onDidDestroy method takes a function that will be called when the tool-bar package is destroyed. This is useful if your package needs to do cleanup when the tool-bar is deactivated but your package continues running.
    */
  def onDidDestroy(callback: js.Function0[Unit]): Unit = js.native
  
  /** Use the method removeItems to remove the buttons added by your package. This is particular useful in your package deactivate method, but can be used at any time.
    */
  def removeItems(): Unit = js.native
}
