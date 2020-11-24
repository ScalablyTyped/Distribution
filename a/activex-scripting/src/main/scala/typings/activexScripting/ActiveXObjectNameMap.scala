package typings.activexScripting

import typings.activexScripting.Scripting.Dictionary
import typings.activexScripting.Scripting.Encoder
import typings.activexScripting.Scripting.FileSystemObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends js.Object {
  
  /** Set or get the item for a given key */
  @JSName("Scripting.Dictionary")
  def ScriptingDotDictionary(Key: js.Any): js.Any = js.native
  @JSName("Scripting.Dictionary")
  var ScriptingDotDictionary_Original: Dictionary[_, _] = js.native
  
  /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
  @JSName("Scripting.Encoder")
  def ScriptingDotEncoder(szExt: String, bstrStreamIn: String, cFlags: Double, bstrDefaultLang: String): String = js.native
  @JSName("Scripting.Encoder")
  var ScriptingDotEncoder_Original: Encoder = js.native
  
  @JSName("Scripting.FileSystemObject")
  var ScriptingDotFileSystemObject: FileSystemObject = js.native
}
