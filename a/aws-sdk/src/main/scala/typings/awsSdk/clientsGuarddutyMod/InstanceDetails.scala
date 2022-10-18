package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceDetails extends StObject {
  
  /**
    * The Availability Zone of the EC2 instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The profile information of the EC2 instance.
    */
  var IamInstanceProfile: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.IamInstanceProfile] = js.undefined
  
  /**
    * The image description of the EC2 instance.
    */
  var ImageDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The image ID of the EC2 instance.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the EC2 instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the EC2 instance.
    */
  var InstanceState: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the EC2 instance.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The launch time of the EC2 instance.
    */
  var LaunchTime: js.UndefOr[String] = js.undefined
  
  /**
    * The elastic network interface information of the EC2 instance.
    */
  var NetworkInterfaces: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.NetworkInterfaces] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services Outpost. Only applicable to Amazon Web Services Outposts instances.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The platform of the EC2 instance.
    */
  var Platform: js.UndefOr[String] = js.undefined
  
  /**
    * The product code of the EC2 instance.
    */
  var ProductCodes: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ProductCodes] = js.undefined
  
  /**
    * The tags of the EC2 instance.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Tags] = js.undefined
}
object InstanceDetails {
  
  inline def apply(): InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceDetails]
  }
  
  extension [Self <: InstanceDetails](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setIamInstanceProfile(value: IamInstanceProfile): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageDescription(value: String): Self = StObject.set(x, "ImageDescription", value.asInstanceOf[js.Any])
    
    inline def setImageDescriptionUndefined: Self = StObject.set(x, "ImageDescription", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceState(value: String): Self = StObject.set(x, "InstanceState", value.asInstanceOf[js.Any])
    
    inline def setInstanceStateUndefined: Self = StObject.set(x, "InstanceState", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLaunchTime(value: String): Self = StObject.set(x, "LaunchTime", value.asInstanceOf[js.Any])
    
    inline def setLaunchTimeUndefined: Self = StObject.set(x, "LaunchTime", js.undefined)
    
    inline def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value*))
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setProductCodes(value: ProductCodes): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
