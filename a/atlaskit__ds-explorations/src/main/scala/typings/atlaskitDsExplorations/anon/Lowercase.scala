package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lowercase extends StObject {
  
  var lowercase: SerializedStyles
  
  var none: SerializedStyles
  
  var uppercase: SerializedStyles
}
object Lowercase {
  
  inline def apply(lowercase: SerializedStyles, none: SerializedStyles, uppercase: SerializedStyles): Lowercase = {
    val __obj = js.Dynamic.literal(lowercase = lowercase.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], uppercase = uppercase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lowercase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lowercase] (val x: Self) extends AnyVal {
    
    inline def setLowercase(value: SerializedStyles): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
    
    inline def setNone(value: SerializedStyles): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setUppercase(value: SerializedStyles): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
  }
}
