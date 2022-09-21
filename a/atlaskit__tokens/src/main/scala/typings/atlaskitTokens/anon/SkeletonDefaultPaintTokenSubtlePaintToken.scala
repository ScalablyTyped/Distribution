package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkeletonDefaultPaintTokenSubtlePaintToken[BaseToken] extends StObject {
  
  var skeleton: DefaultPaintTokenSubtlePaintToken[BaseToken]
}
object SkeletonDefaultPaintTokenSubtlePaintToken {
  
  inline def apply[BaseToken](skeleton: DefaultPaintTokenSubtlePaintToken[BaseToken]): SkeletonDefaultPaintTokenSubtlePaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonDefaultPaintTokenSubtlePaintToken[BaseToken]]
  }
  
  extension [Self <: SkeletonDefaultPaintTokenSubtlePaintToken[?], BaseToken](x: Self & SkeletonDefaultPaintTokenSubtlePaintToken[BaseToken]) {
    
    inline def setSkeleton(value: DefaultPaintTokenSubtlePaintToken[BaseToken]): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
  }
}
