package typings.activexScripting

import typings.activexScripting.Scripting.Dictionary
import typings.activexScripting.Scripting.Encoder
import typings.activexScripting.Scripting.FileSystemObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  /** Set or get the item for a given key */
  @JSName("Scripting.Dictionary")
  def ScriptingDotDictionary(Key: js.Any): js.Any
  @JSName("Scripting.Dictionary")
  var ScriptingDotDictionary_Original: Dictionary[js.Any, js.Any]
  
  /** Call the Encoder determined by szExt, passing bstrStreamIn and optional arguments */
  @JSName("Scripting.Encoder")
  def ScriptingDotEncoder(szExt: String, bstrStreamIn: String, cFlags: Double, bstrDefaultLang: String): String
  @JSName("Scripting.Encoder")
  var ScriptingDotEncoder_Original: Encoder
  
  @JSName("Scripting.FileSystemObject")
  var ScriptingDotFileSystemObject: FileSystemObject
}
object ActiveXObjectNameMap {
  
  inline def apply(
    ScriptingDotDictionary: Dictionary[js.Any, js.Any],
    ScriptingDotEncoder: Encoder,
    ScriptingDotFileSystemObject: FileSystemObject
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Scripting.Dictionary")(ScriptingDotDictionary.asInstanceOf[js.Any])
    __obj.updateDynamic("Scripting.Encoder")(ScriptingDotEncoder.asInstanceOf[js.Any])
    __obj.updateDynamic("Scripting.FileSystemObject")(ScriptingDotFileSystemObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setScriptingDotDictionary(value: Dictionary[js.Any, js.Any]): Self = StObject.set(x, "Scripting.Dictionary", value.asInstanceOf[js.Any])
    
    inline def setScriptingDotEncoder(value: Encoder): Self = StObject.set(x, "Scripting.Encoder", value.asInstanceOf[js.Any])
    
    inline def setScriptingDotFileSystemObject(value: FileSystemObject): Self = StObject.set(x, "Scripting.FileSystemObject", value.asInstanceOf[js.Any])
  }
}
