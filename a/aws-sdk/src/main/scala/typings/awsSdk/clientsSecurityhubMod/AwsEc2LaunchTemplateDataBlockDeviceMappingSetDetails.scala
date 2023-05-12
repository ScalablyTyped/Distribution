package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails extends StObject {
  
  /**
    *  The device name. 
    */
  var DeviceName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Parameters used to automatically set up Amazon EBS volumes when the instance is launched. 
    */
  var Ebs: js.UndefOr[AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails] = js.undefined
  
  /**
    *  Omits the device from the block device mapping when an empty string is specified. 
    */
  var NoDevice: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with 2 available instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of available instance store volumes depends on the instance type. 
    */
  var VirtualName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails] (val x: Self) extends AnyVal {
    
    inline def setDeviceName(value: NonEmptyString): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setEbs(value: AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsUndefined: Self = StObject.set(x, "Ebs", js.undefined)
    
    inline def setNoDevice(value: NonEmptyString): Self = StObject.set(x, "NoDevice", value.asInstanceOf[js.Any])
    
    inline def setNoDeviceUndefined: Self = StObject.set(x, "NoDevice", js.undefined)
    
    inline def setVirtualName(value: NonEmptyString): Self = StObject.set(x, "VirtualName", value.asInstanceOf[js.Any])
    
    inline def setVirtualNameUndefined: Self = StObject.set(x, "VirtualName", js.undefined)
  }
}
