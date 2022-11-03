package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inverse17[BaseToken] extends StObject {
  
  var inverse: `17`[BaseToken]
}
object Inverse17 {
  
  inline def apply[BaseToken](inverse: `17`[BaseToken]): Inverse17[BaseToken] = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inverse17[BaseToken]]
  }
  
  extension [Self <: Inverse17[?], BaseToken](x: Self & Inverse17[BaseToken]) {
    
    inline def setInverse(value: `17`[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
  }
}
