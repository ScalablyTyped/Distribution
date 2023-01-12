package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inverse19[BaseToken] extends StObject {
  
  var inverse: `19`[BaseToken]
}
object Inverse19 {
  
  inline def apply[BaseToken](inverse: `19`[BaseToken]): Inverse19[BaseToken] = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inverse19[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inverse19[?], BaseToken] (val x: Self & Inverse19[BaseToken]) extends AnyVal {
    
    inline def setInverse(value: `19`[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
  }
}
