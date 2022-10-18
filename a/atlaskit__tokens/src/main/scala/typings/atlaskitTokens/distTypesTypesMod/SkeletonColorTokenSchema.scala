package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.SkeletonDefaultPaintTokenSubtlePaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkeletonColorTokenSchema[BaseToken] extends StObject {
  
  var color: SkeletonDefaultPaintTokenSubtlePaintToken[BaseToken]
}
object SkeletonColorTokenSchema {
  
  inline def apply[BaseToken](color: SkeletonDefaultPaintTokenSubtlePaintToken[BaseToken]): SkeletonColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonColorTokenSchema[BaseToken]]
  }
  
  extension [Self <: SkeletonColorTokenSchema[?], BaseToken](x: Self & SkeletonColorTokenSchema[BaseToken]) {
    
    inline def setColor(value: SkeletonDefaultPaintTokenSubtlePaintToken[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
