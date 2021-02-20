package typings.aceBuilds.mod.Ace

import typings.aceBuilds.aceBuildsStrings.afterExec
import typings.aceBuilds.aceBuildsStrings.exec
import typings.aceBuilds.anon.Mac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandManager extends EventEmitter {
  
  def addCommand(command: Command): Unit = js.native
  
  def bindKey(key: String, command: CommandLike): Unit = js.native
  def bindKey(key: String, command: CommandLike, position: Double): Unit = js.native
  def bindKey(key: Mac, command: CommandLike): Unit = js.native
  def bindKey(key: Mac, command: CommandLike, position: Double): Unit = js.native
  
  var byName: CommandMap = js.native
  
  var commands: CommandMap = js.native
  
  def exec(command: String, editor: Editor, args: js.Any): Boolean = js.native
  
  @JSName("on")
  def on_afterExec(name: afterExec, callback: execEventHandler): js.Function = js.native
  @JSName("on")
  def on_exec(name: exec, callback: execEventHandler): js.Function = js.native
  
  def removeCommand(command: String): Unit = js.native
  def removeCommand(command: String, keepCommand: Boolean): Unit = js.native
  def removeCommand(command: Command): Unit = js.native
  def removeCommand(command: Command, keepCommand: Boolean): Unit = js.native
  
  def replay(editor: Editor): Unit = js.native
  
  def toggleRecording(editor: Editor): Unit = js.native
}
