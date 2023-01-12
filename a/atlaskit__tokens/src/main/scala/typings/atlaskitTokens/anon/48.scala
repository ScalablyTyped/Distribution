package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.SpacingToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48`[BaseToken] extends StObject {
  
  var `32`: SpacingToken[BaseToken]
  
  var `40`: SpacingToken[BaseToken]
  
  var `48`: SpacingToken[BaseToken]
}
object `48` {
  
  inline def apply[BaseToken](`32`: SpacingToken[BaseToken], `40`: SpacingToken[BaseToken], `48`: SpacingToken[BaseToken]): `48`[BaseToken] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("32")(`32`.asInstanceOf[js.Any])
    __obj.updateDynamic("40")(`40`.asInstanceOf[js.Any])
    __obj.updateDynamic("48")(`48`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`48`[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `48`[?], BaseToken] (val x: Self & `48`[BaseToken]) extends AnyVal {
    
    inline def set32(value: SpacingToken[BaseToken]): Self = StObject.set(x, "32", value.asInstanceOf[js.Any])
    
    inline def set40(value: SpacingToken[BaseToken]): Self = StObject.set(x, "40", value.asInstanceOf[js.Any])
    
    inline def set48(value: SpacingToken[BaseToken]): Self = StObject.set(x, "48", value.asInstanceOf[js.Any])
  }
}
