package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Origination extends js.Object {
  
  /**
    * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of 20.
    */
  var Routes: js.UndefOr[OriginationRouteList] = js.native
}
object Origination {
  
  @scala.inline
  def apply(): Origination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origination]
  }
  
  @scala.inline
  implicit class OriginationOps[Self <: Origination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: OriginationRoute*): Self = this.set("Routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: OriginationRouteList): Self = this.set("Routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("Routes", js.undefined)
  }
}
