package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BolderPaintToken[BaseToken] extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var bolder: PaintToken[BaseToken]
}
object BolderPaintToken {
  
  inline def apply[BaseToken](`[default]`: PaintToken[BaseToken], bolder: PaintToken[BaseToken]): BolderPaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(bolder = bolder.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BolderPaintToken[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BolderPaintToken[?], BaseToken] (val x: Self & BolderPaintToken[BaseToken]) extends AnyVal {
    
    inline def setBolder(value: PaintToken[BaseToken]): Self = StObject.set(x, "bolder", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
