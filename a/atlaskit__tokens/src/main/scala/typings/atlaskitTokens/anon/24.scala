package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.SpacingToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24`[BaseToken] extends StObject {
  
  var `2`: SpacingToken[BaseToken]
  
  var `4`: SpacingToken[BaseToken]
  
  var `6`: SpacingToken[BaseToken]
  
  var `8`: SpacingToken[BaseToken]
}
object `24` {
  
  inline def apply[BaseToken](
    `2`: SpacingToken[BaseToken],
    `4`: SpacingToken[BaseToken],
    `6`: SpacingToken[BaseToken],
    `8`: SpacingToken[BaseToken]
  ): `24`[BaseToken] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`[BaseToken]]
  }
  
  extension [Self <: `24`[?], BaseToken](x: Self & `24`[BaseToken]) {
    
    inline def set2(value: SpacingToken[BaseToken]): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set4(value: SpacingToken[BaseToken]): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    inline def set6(value: SpacingToken[BaseToken]): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    
    inline def set8(value: SpacingToken[BaseToken]): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
  }
}
