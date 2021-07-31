package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String
  
  var quoted: Boolean
  
  var value: typings.angularCompiler.outputAstMod.Expression
}
object Key {
  
  @scala.inline
  def apply(key: String, quoted: Boolean, value: typings.angularCompiler.outputAstMod.Expression): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: typings.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
