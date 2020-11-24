package typings.analyticsNode.anon

import typings.analyticsNode.mod.AnalyticsNode.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnonymousId extends Identity {
  
  var anonymousId: String | Double = js.native
  
  var userId: js.UndefOr[String | Double] = js.native
}
object AnonymousId {
  
  @scala.inline
  def apply(anonymousId: String | Double): AnonymousId = {
    val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonymousId]
  }
  
  @scala.inline
  implicit class AnonymousIdOps[Self <: AnonymousId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnonymousId(value: String | Double): Self = this.set("anonymousId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String | Double): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
