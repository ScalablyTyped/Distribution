package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesSpacingScaleMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.SpacingToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  var `32`: SpacingToken[BaseToken]
  
  var `40`: SpacingToken[BaseToken]
  
  var `64`: SpacingToken[BaseToken]
}
object `32` {
  
  inline def apply(`32`: SpacingToken[BaseToken], `40`: SpacingToken[BaseToken], `64`: SpacingToken[BaseToken]): `32` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("32")(`32`.asInstanceOf[js.Any])
    __obj.updateDynamic("40")(`40`.asInstanceOf[js.Any])
    __obj.updateDynamic("64")(`64`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `32`] (val x: Self) extends AnyVal {
    
    inline def set32(value: SpacingToken[BaseToken]): Self = StObject.set(x, "32", value.asInstanceOf[js.Any])
    
    inline def set40(value: SpacingToken[BaseToken]): Self = StObject.set(x, "40", value.asInstanceOf[js.Any])
    
    inline def set64(value: SpacingToken[BaseToken]): Self = StObject.set(x, "64", value.asInstanceOf[js.Any])
  }
}
