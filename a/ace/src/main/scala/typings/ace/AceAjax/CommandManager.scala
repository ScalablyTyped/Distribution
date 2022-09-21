package typings.ace.AceAjax

import org.scalablytyped.runtime.StringDictionary
import typings.ace.aceStrings.afterExec
import typings.ace.aceStrings.exec
import typings.ace.anon.Command
import typings.ace.anon.HashId
import typings.ace.anon.Mac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandManager extends StObject {
  
  def addCommand(command: EditorCommand): Unit = js.native
  
  def addCommands(commands: js.Array[EditorCommand]): Unit = js.native
  
  def addEventListener(name: String, callback: js.Function): Unit = js.native
  def addEventListener(name: String, callback: js.Function, capturing: Boolean): Unit = js.native
  
  def bindKey(key: String, command: CommandLike): Unit = js.native
  def bindKey(key: String, command: CommandLike, position: Double): Unit = js.native
  def bindKey(key: Mac, command: CommandLike): Unit = js.native
  def bindKey(key: Mac, command: CommandLike, position: Double): Unit = js.native
  
  def bindKeys(keys: StringDictionary[js.Function]): Unit = js.native
  
  var byName: CommandMap = js.native
  
  var commands: CommandMap = js.native
  
  def exec(command: String, editor: Editor, args: Any): Boolean = js.native
  
  def findKeyCommand(hashId: Double, keyString: String): js.UndefOr[String] = js.native
  
  def getStatusText(editor: Editor, data: js.Object): String = js.native
  
  def handleKeyboard(data: js.Object, hashId: Double, keyString: String, keyCode: String): Unit | Command = js.native
  def handleKeyboard(data: js.Object, hashId: Double, keyString: String, keyCode: Double): Unit | Command = js.native
  
  def off(name: String, callback: js.Function): Unit = js.native
  
  def on(name: String, callback: js.Function): js.Function = js.native
  def on(name: String, callback: js.Function, capturing: Boolean): js.Function = js.native
  @JSName("on")
  def on_afterExec(name: afterExec, callback: execEventHandler): js.Function = js.native
  @JSName("on")
  def on_exec(name: exec, callback: execEventHandler): js.Function = js.native
  
  def once(name: String, callback: js.Function): Unit = js.native
  
  def parseKeys(keyPart: String): HashId = js.native
  
  var platform: String = js.native
  
  def removeCommand(command: String): Unit = js.native
  def removeCommand(command: String, keepCommand: Boolean): Unit = js.native
  def removeCommand(command: EditorCommand): Unit = js.native
  def removeCommand(command: EditorCommand, keepCommand: Boolean): Unit = js.native
  
  def removeCommands(command: js.Array[EditorCommand]): Unit = js.native
  
  def removeDefaultHandler(name: String, callback: js.Function): Unit = js.native
  
  def removeEventListener(name: String, callback: js.Function): Unit = js.native
  
  def removeListener(name: String, callback: js.Function): Unit = js.native
  
  def replay(editor: Editor): Unit = js.native
  
  def setDefaultHandler(name: String, callback: js.Function): Unit = js.native
  
  def toggleRecording(editor: Editor): Unit = js.native
}
