package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockDeviceMapping extends StObject {
  
  /**
    * The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh). For more information, see Device Naming on Linux Instances in the Amazon EC2 User Guide for Linux Instances.
    */
  var DeviceName: XmlStringMaxLen255 = js.native
  
  /**
    * Parameters used to automatically set up EBS volumes when an instance is launched. You can specify either VirtualName or Ebs, but not both.
    */
  var Ebs: js.UndefOr[typings.awsSdk.autoscalingMod.Ebs] = js.native
  
  /**
    * Setting this value to true suppresses the specified device included in the block device mapping of the AMI. If NoDevice is true for the root device, instances might fail the EC2 health check. In that case, Amazon EC2 Auto Scaling launches replacement instances. If you specify NoDevice, you cannot specify Ebs.
    */
  var NoDevice: js.UndefOr[typings.awsSdk.autoscalingMod.NoDevice] = js.native
  
  /**
    * The name of the virtual device (for example, ephemeral0). You can specify either VirtualName or Ebs, but not both.
    */
  var VirtualName: js.UndefOr[XmlStringMaxLen255] = js.native
}
object BlockDeviceMapping {
  
  @scala.inline
  def apply(DeviceName: XmlStringMaxLen255): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal(DeviceName = DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDeviceMapping]
  }
  
  @scala.inline
  implicit class BlockDeviceMappingMutableBuilder[Self <: BlockDeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: XmlStringMaxLen255): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbs(value: Ebs): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsUndefined: Self = StObject.set(x, "Ebs", js.undefined)
    
    @scala.inline
    def setNoDevice(value: NoDevice): Self = StObject.set(x, "NoDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDeviceUndefined: Self = StObject.set(x, "NoDevice", js.undefined)
    
    @scala.inline
    def setVirtualName(value: XmlStringMaxLen255): Self = StObject.set(x, "VirtualName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNameUndefined: Self = StObject.set(x, "VirtualName", js.undefined)
  }
}
