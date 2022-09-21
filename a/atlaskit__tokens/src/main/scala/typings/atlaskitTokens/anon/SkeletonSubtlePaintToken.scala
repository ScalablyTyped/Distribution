package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkeletonSubtlePaintToken extends StObject {
  
  var skeleton: SubtlePaintToken
}
object SkeletonSubtlePaintToken {
  
  inline def apply(skeleton: SubtlePaintToken): SkeletonSubtlePaintToken = {
    val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonSubtlePaintToken]
  }
  
  extension [Self <: SkeletonSubtlePaintToken](x: Self) {
    
    inline def setSkeleton(value: SubtlePaintToken): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
  }
}
