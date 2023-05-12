package typings.analyticsNode.anon

import typings.analyticsNode.mod.AnalyticsNode.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnonymousId
  extends StObject
     with Identity {
  
  var anonymousId: String | Double
}
object AnonymousId {
  
  inline def apply(anonymousId: String | Double): AnonymousId = {
    val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnonymousId] (val x: Self) extends AnyVal {
    
    inline def setAnonymousId(value: String | Double): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
  }
}
