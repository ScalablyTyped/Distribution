package typings.analyticsNode.mod.AnalyticsNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.analyticsNode.anon.UserId
  - typings.analyticsNode.anon.AnonymousId
*/
trait Identity extends js.Object
object Identity {
  
  @scala.inline
  def UserId(userId: String | Double): Identity = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  def AnonymousId(anonymousId: String | Double): Identity = {
    val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}
