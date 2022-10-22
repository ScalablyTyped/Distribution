package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.SpacingToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GutterSpacingToken[BaseToken] extends StObject {
  
  var gutter: SpacingToken[BaseToken]
}
object GutterSpacingToken {
  
  inline def apply[BaseToken](gutter: SpacingToken[BaseToken]): GutterSpacingToken[BaseToken] = {
    val __obj = js.Dynamic.literal(gutter = gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GutterSpacingToken[BaseToken]]
  }
  
  extension [Self <: GutterSpacingToken[?], BaseToken](x: Self & GutterSpacingToken[BaseToken]) {
    
    inline def setGutter(value: SpacingToken[BaseToken]): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
  }
}
