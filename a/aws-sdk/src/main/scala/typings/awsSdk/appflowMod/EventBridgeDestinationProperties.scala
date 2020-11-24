package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBridgeDestinationProperties extends js.Object {
  
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.native
  
  /**
    *  The object specified in the Amazon EventBridge flow destination. 
    */
  var `object`: Object = js.native
}
object EventBridgeDestinationProperties {
  
  @scala.inline
  def apply(`object`: Object): EventBridgeDestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBridgeDestinationProperties]
  }
  
  @scala.inline
  implicit class EventBridgeDestinationPropertiesOps[Self <: EventBridgeDestinationProperties] (val x: Self) extends AnyVal {
    
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
    def setObject(value: Object): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = this.set("errorHandlingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorHandlingConfig: Self = this.set("errorHandlingConfig", js.undefined)
  }
}
