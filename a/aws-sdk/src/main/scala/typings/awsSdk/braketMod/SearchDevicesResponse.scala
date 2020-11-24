package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDevicesResponse extends js.Object {
  
  /**
    * An array of DeviceSummary objects for devices that match the specified filter values.
    */
  var devices: DeviceSummaryList = js.native
  
  /**
    * A token used for pagination of results, or null if there are no additional results. Use the token value in a subsequent request to continue results where the previous request ended.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object SearchDevicesResponse {
  
  @scala.inline
  def apply(devices: DeviceSummaryList): SearchDevicesResponse = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDevicesResponse]
  }
  
  @scala.inline
  implicit class SearchDevicesResponseOps[Self <: SearchDevicesResponse] (val x: Self) extends AnyVal {
    
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
    def setDevicesVarargs(value: DeviceSummary*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: DeviceSummaryList): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
