package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralMapEntry extends StObject {
  
  def isEquivalent(e: LiteralMapEntry): Boolean
  
  var key: String
  
  var quoted: Boolean
  
  var value: Expression
}
object LiteralMapEntry {
  
  inline def apply(isEquivalent: LiteralMapEntry => Boolean, key: String, quoted: Boolean, value: Expression): LiteralMapEntry = {
    val __obj = js.Dynamic.literal(isEquivalent = js.Any.fromFunction1(isEquivalent), key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralMapEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiteralMapEntry] (val x: Self) extends AnyVal {
    
    inline def setIsEquivalent(value: LiteralMapEntry => Boolean): Self = StObject.set(x, "isEquivalent", js.Any.fromFunction1(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
