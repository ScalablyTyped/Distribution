package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Skeleton extends StObject {
  
  var skeleton: DefaultSubtle
}
object Skeleton {
  
  inline def apply(skeleton: DefaultSubtle): Skeleton = {
    val __obj = js.Dynamic.literal(skeleton = skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skeleton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Skeleton] (val x: Self) extends AnyVal {
    
    inline def setSkeleton(value: DefaultSubtle): Self = StObject.set(x, "skeleton", value.asInstanceOf[js.Any])
  }
}
