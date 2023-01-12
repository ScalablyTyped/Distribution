package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14`[BaseToken] extends StObject {
  
  var `[default]`: DefaultHoveredPressed[BaseToken]
}
object `14` {
  
  inline def apply[BaseToken](`[default]`: DefaultHoveredPressed[BaseToken]): `14`[BaseToken] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`[?], BaseToken] (val x: Self & `14`[BaseToken]) extends AnyVal {
    
    inline def `set[default]`(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
