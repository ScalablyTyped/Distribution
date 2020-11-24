package typings.ably.mod.Types

import typings.ably.ablyStrings.android
import typings.ably.ablyStrings.browser
import typings.ably.ablyStrings.car
import typings.ably.ablyStrings.desktop
import typings.ably.ablyStrings.embedded
import typings.ably.ablyStrings.ios
import typings.ably.ablyStrings.other
import typings.ably.ablyStrings.phone
import typings.ably.ablyStrings.tablet
import typings.ably.ablyStrings.tv
import typings.ably.ablyStrings.watch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceDetails extends js.Object {
  
  var clientId: js.UndefOr[String] = js.native
  
  var deviceSecret: js.UndefOr[String] = js.native
  
  var formFactor: phone | tablet | desktop | tv | watch | car | embedded | other = js.native
  
  var id: String = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var platform: android | ios | browser = js.native
  
  var push: DevicePushDetails = js.native
}
object DeviceDetails {
  
  @scala.inline
  def apply(
    formFactor: phone | tablet | desktop | tv | watch | car | embedded | other,
    id: String,
    platform: android | ios | browser,
    push: DevicePushDetails
  ): DeviceDetails = {
    val __obj = js.Dynamic.literal(formFactor = formFactor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDetails]
  }
  
  @scala.inline
  implicit class DeviceDetailsOps[Self <: DeviceDetails] (val x: Self) extends AnyVal {
    
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
    def setFormFactor(value: phone | tablet | desktop | tv | watch | car | embedded | other): Self = this.set("formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: android | ios | browser): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: DevicePushDetails): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setDeviceSecret(value: String): Self = this.set("deviceSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceSecret: Self = this.set("deviceSecret", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
