package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesSpacingScaleMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.SpacingToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var `2`: SpacingToken[BaseToken]
  
  var `4`: SpacingToken[BaseToken]
  
  var `6`: SpacingToken[BaseToken]
  
  var `8`: SpacingToken[BaseToken]
}
object `4` {
  
  inline def apply(
    `2`: SpacingToken[BaseToken],
    `4`: SpacingToken[BaseToken],
    `6`: SpacingToken[BaseToken],
    `8`: SpacingToken[BaseToken]
  ): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def set2(value: SpacingToken[BaseToken]): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set4(value: SpacingToken[BaseToken]): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    inline def set6(value: SpacingToken[BaseToken]): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    
    inline def set8(value: SpacingToken[BaseToken]): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
  }
}
