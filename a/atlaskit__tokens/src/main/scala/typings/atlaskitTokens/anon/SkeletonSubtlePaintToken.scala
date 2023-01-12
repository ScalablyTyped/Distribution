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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkeletonSubtlePaintToken] (val x: Self) extends AnyVal {
    
    inline def setSkeleton(value: SubtlePaintToken): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
  }
}
