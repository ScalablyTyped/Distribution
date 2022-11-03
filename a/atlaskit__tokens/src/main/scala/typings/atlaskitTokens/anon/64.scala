package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.SpacingToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64`[BaseToken] extends StObject {
  
  var `32`: SpacingToken[BaseToken]
  
  var `40`: SpacingToken[BaseToken]
  
  var `64`: SpacingToken[BaseToken]
}
object `64` {
  
  inline def apply[BaseToken](`32`: SpacingToken[BaseToken], `40`: SpacingToken[BaseToken], `64`: SpacingToken[BaseToken]): `64`[BaseToken] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("32")(`32`.asInstanceOf[js.Any])
    __obj.updateDynamic("40")(`40`.asInstanceOf[js.Any])
    __obj.updateDynamic("64")(`64`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`64`[BaseToken]]
  }
  
  extension [Self <: `64`[?], BaseToken](x: Self & `64`[BaseToken]) {
    
    inline def set32(value: SpacingToken[BaseToken]): Self = StObject.set(x, "32", value.asInstanceOf[js.Any])
    
    inline def set40(value: SpacingToken[BaseToken]): Self = StObject.set(x, "40", value.asInstanceOf[js.Any])
    
    inline def set64(value: SpacingToken[BaseToken]): Self = StObject.set(x, "64", value.asInstanceOf[js.Any])
  }
}
