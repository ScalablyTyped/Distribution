package typings.angularCompiler.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.mod.TagContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictnamespace
  extends StObject
     with /* namespace */ StringDictionary[TagContentType] {
  
  var default: TagContentType
}
object Dictnamespace {
  
  inline def apply(default: TagContentType): Dictnamespace = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictnamespace]
  }
  
  extension [Self <: Dictnamespace](x: Self) {
    
    inline def setDefault(value: TagContentType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
