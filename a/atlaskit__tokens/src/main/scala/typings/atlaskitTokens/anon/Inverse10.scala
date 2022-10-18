package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inverse10[BaseToken] extends StObject {
  
  var inverse: `10`[BaseToken]
}
object Inverse10 {
  
  inline def apply[BaseToken](inverse: `10`[BaseToken]): Inverse10[BaseToken] = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inverse10[BaseToken]]
  }
  
  extension [Self <: Inverse10[?], BaseToken](x: Self & Inverse10[BaseToken]) {
    
    inline def setInverse(value: `10`[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
  }
}
