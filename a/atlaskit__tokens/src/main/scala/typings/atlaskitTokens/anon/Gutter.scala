package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesSpacingScaleMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.SpacingToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gutter extends StObject {
  
  var gutter: SpacingToken[BaseToken]
}
object Gutter {
  
  inline def apply(gutter: SpacingToken[BaseToken]): Gutter = {
    val __obj = js.Dynamic.literal(gutter = gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gutter]
  }
  
  extension [Self <: Gutter](x: Self) {
    
    inline def setGutter(value: SpacingToken[BaseToken]): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
  }
}
