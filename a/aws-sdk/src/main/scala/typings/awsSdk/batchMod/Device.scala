package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends js.Object {
  
  /**
    * The path inside the container at which to expose the host device. By default the hostPath value is used.
    */
  var containerPath: js.UndefOr[String] = js.native
  
  /**
    * The path for the device on the host container instance.
    */
  var hostPath: String = js.native
  
  /**
    * The explicit permissions to provide to the container for the device. By default, the container has permissions for read, write, and mknod for the device.
    */
  var permissions: js.UndefOr[DeviceCgroupPermissions] = js.native
}
object Device {
  
  @scala.inline
  def apply(hostPath: String): Device = {
    val __obj = js.Dynamic.literal(hostPath = hostPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
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
    def setHostPath(value: String): Self = this.set("hostPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPath(value: String): Self = this.set("containerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerPath: Self = this.set("containerPath", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: DeviceCgroupPermission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: DeviceCgroupPermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
  }
}
