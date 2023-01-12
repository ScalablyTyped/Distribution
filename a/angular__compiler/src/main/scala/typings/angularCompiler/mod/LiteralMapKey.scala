package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralMapKey extends StObject {
  
  var key: String
  
  var quoted: Boolean
}
object LiteralMapKey {
  
  inline def apply(key: String, quoted: Boolean): LiteralMapKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralMapKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiteralMapKey] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
  }
}
