package typings.analyticsNode.anon

import typings.analyticsNode.mod.AnalyticsNode.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserId
  extends StObject
     with Identity {
  
  var userId: String | Double
}
object UserId {
  
  inline def apply(userId: String | Double): UserId = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserId] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
