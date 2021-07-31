package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralMapKey extends StObject {
  
  var key: String
  
  var quoted: Boolean
}
object LiteralMapKey {
  
  @scala.inline
  def apply(key: String, quoted: Boolean): LiteralMapKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralMapKey]
  }
  
  @scala.inline
  implicit class LiteralMapKeyMutableBuilder[Self <: LiteralMapKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
  }
}
