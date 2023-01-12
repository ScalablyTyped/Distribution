package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesSpacingScaleMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.SpacingToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40` extends StObject {
  
  var `32`: SpacingToken[BaseToken]
  
  var `40`: SpacingToken[BaseToken]
  
  var `48`: SpacingToken[BaseToken]
}
object `40` {
  
  inline def apply(`32`: SpacingToken[BaseToken], `40`: SpacingToken[BaseToken], `48`: SpacingToken[BaseToken]): `40` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("32")(`32`.asInstanceOf[js.Any])
    __obj.updateDynamic("40")(`40`.asInstanceOf[js.Any])
    __obj.updateDynamic("48")(`48`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `40`] (val x: Self) extends AnyVal {
    
    inline def set32(value: SpacingToken[BaseToken]): Self = StObject.set(x, "32", value.asInstanceOf[js.Any])
    
    inline def set40(value: SpacingToken[BaseToken]): Self = StObject.set(x, "40", value.asInstanceOf[js.Any])
    
    inline def set48(value: SpacingToken[BaseToken]): Self = StObject.set(x, "48", value.asInstanceOf[js.Any])
  }
}
