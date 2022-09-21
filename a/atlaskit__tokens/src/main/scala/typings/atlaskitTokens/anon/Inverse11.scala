package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inverse11[BaseToken] extends StObject {
  
  var inverse: `11`[BaseToken]
}
object Inverse11 {
  
  inline def apply[BaseToken](inverse: `11`[BaseToken]): Inverse11[BaseToken] = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inverse11[BaseToken]]
  }
  
  extension [Self <: Inverse11[?], BaseToken](x: Self & Inverse11[BaseToken]) {
    
    inline def setInverse(value: `11`[BaseToken]): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
  }
}
