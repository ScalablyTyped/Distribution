package typings.activexDashScripting

import typings.activexDashScripting.Scripting.Dictionary
import typings.activexDashScripting.Scripting.Encoder
import typings.activexDashScripting.Scripting.FileSystemObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("Scripting.Dictionary")
  var ScriptingDotDictionary_Original: Dictionary[_, _] = js.native
  @JSName("Scripting.Encoder")
  var ScriptingDotEncoder_Original: Encoder = js.native
  @JSName("Scripting.FileSystemObject")
  var ScriptingDotFileSystemObject: FileSystemObject = js.native
  /** Set or get the item for a given key */
  @JSName("Scripting.Dictionary")
  def ScriptingDotDictionary(Key: js.Any): js.Any = js.native
  /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
  @JSName("Scripting.Encoder")
  def ScriptingDotEncoder(szExt: String, bstrStreamIn: String, cFlags: Double, bstrDefaultLang: String): String = js.native
}

