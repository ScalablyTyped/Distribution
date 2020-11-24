package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationComponent extends js.Object {
  
  /**
    * The name of the component.
    */
  var ComponentName: js.UndefOr[typings.awsSdk.applicationinsightsMod.ComponentName] = js.native
  
  /**
    * Indicates whether the application component is monitored. 
    */
  var Monitor: js.UndefOr[typings.awsSdk.applicationinsightsMod.Monitor] = js.native
  
  /**
    * The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB, Application ELB, and SQS Queue.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceType] = js.native
  
  /**
    * The stack tier of the application component.
    */
  var Tier: js.UndefOr[typings.awsSdk.applicationinsightsMod.Tier] = js.native
}
object ApplicationComponent {
  
  @scala.inline
  def apply(): ApplicationComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationComponent]
  }
  
  @scala.inline
  implicit class ApplicationComponentOps[Self <: ApplicationComponent] (val x: Self) extends AnyVal {
    
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
    def setComponentName(value: ComponentName): Self = this.set("ComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentName: Self = this.set("ComponentName", js.undefined)
    
    @scala.inline
    def setMonitor(value: Monitor): Self = this.set("Monitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitor: Self = this.set("Monitor", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    
    @scala.inline
    def setTier(value: Tier): Self = this.set("Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
  }
}
