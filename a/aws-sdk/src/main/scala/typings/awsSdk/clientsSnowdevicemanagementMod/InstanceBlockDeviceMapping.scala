package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceBlockDeviceMapping extends StObject {
  
  /**
    * The block device name.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The parameters used to automatically set up Amazon Elastic Block Store (Amazon EBS) volumes when the instance is launched. 
    */
  var ebs: js.UndefOr[EbsInstanceBlockDevice] = js.undefined
}
object InstanceBlockDeviceMapping {
  
  inline def apply(): InstanceBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceBlockDeviceMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceBlockDeviceMapping] (val x: Self) extends AnyVal {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setEbs(value: EbsInstanceBlockDevice): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsUndefined: Self = StObject.set(x, "ebs", js.undefined)
  }
}
