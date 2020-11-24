package typings.apolloReportingProtobuf.protobufMod.Trace

import typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CachePolicy. */
@js.native
trait ICachePolicy extends js.Object {
  
  /** CachePolicy maxAgeNs */
  var maxAgeNs: js.UndefOr[Double | Null] = js.native
  
  /** CachePolicy scope */
  var scope: js.UndefOr[Scope | Null] = js.native
}
object ICachePolicy {
  
  @scala.inline
  def apply(): ICachePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICachePolicy]
  }
  
  @scala.inline
  implicit class ICachePolicyOps[Self <: ICachePolicy] (val x: Self) extends AnyVal {
    
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
    def setMaxAgeNs(value: Double): Self = this.set("maxAgeNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAgeNs: Self = this.set("maxAgeNs", js.undefined)
    
    @scala.inline
    def setMaxAgeNsNull: Self = this.set("maxAgeNs", null)
    
    @scala.inline
    def setScope(value: Scope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setScopeNull: Self = this.set("scope", null)
  }
}
