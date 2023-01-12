package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesSpacingScaleMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.SpacingToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var `12`: SpacingToken[BaseToken]
  
  var `16`: SpacingToken[BaseToken]
  
  var `20`: SpacingToken[BaseToken]
  
  var `24`: SpacingToken[BaseToken]
}
object `16` {
  
  inline def apply(
    `12`: SpacingToken[BaseToken],
    `16`: SpacingToken[BaseToken],
    `20`: SpacingToken[BaseToken],
    `24`: SpacingToken[BaseToken]
  ): `16` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("12")(`12`.asInstanceOf[js.Any])
    __obj.updateDynamic("16")(`16`.asInstanceOf[js.Any])
    __obj.updateDynamic("20")(`20`.asInstanceOf[js.Any])
    __obj.updateDynamic("24")(`24`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `16`] (val x: Self) extends AnyVal {
    
    inline def set12(value: SpacingToken[BaseToken]): Self = StObject.set(x, "12", value.asInstanceOf[js.Any])
    
    inline def set16(value: SpacingToken[BaseToken]): Self = StObject.set(x, "16", value.asInstanceOf[js.Any])
    
    inline def set20(value: SpacingToken[BaseToken]): Self = StObject.set(x, "20", value.asInstanceOf[js.Any])
    
    inline def set24(value: SpacingToken[BaseToken]): Self = StObject.set(x, "24", value.asInstanceOf[js.Any])
  }
}
