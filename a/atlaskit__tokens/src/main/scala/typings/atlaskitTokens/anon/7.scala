package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[BaseToken] extends StObject {
  
  var `[default]`: DefaultHoveredPressed[BaseToken]
}
object `7` {
  
  inline def apply[BaseToken](`[default]`: DefaultHoveredPressed[BaseToken]): `7`[BaseToken] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`[BaseToken]]
  }
  
  extension [Self <: `7`[?], BaseToken](x: Self & `7`[BaseToken]) {
    
    inline def `set[default]`(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
