package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * An array of objects representing the add-ons enabled on the instance.
    */
  var addOns: js.UndefOr[AddOnList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the instance (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The blueprint ID (e.g., os_amlinux_2016_03).
    */
  var blueprintId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The friendly name of the blueprint (e.g., Amazon Linux).
    */
  var blueprintName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The bundle for the instance (e.g., micro_1_0).
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The timestamp when the instance was created (e.g., 1479734909.17) in Unix time format.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The size of the vCPU and the amount of RAM for the instance.
    */
  var hardware: js.UndefOr[InstanceHardware] = js.undefined
  
  /**
    * The IP address type of the instance. The possible values are ipv4 for IPv4 only, and dualstack for IPv4 and IPv6.
    */
  var ipAddressType: js.UndefOr[IpAddressType] = js.undefined
  
  /**
    * The IPv6 addresses of the instance.
    */
  var ipv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
  
  /**
    * A Boolean value indicating whether this instance has a static IP assigned to it.
    */
  var isStaticIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The region name and Availability Zone where the instance is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The metadata options for the Amazon Lightsail instance.
    */
  var metadataOptions: js.UndefOr[InstanceMetadataOptions] = js.undefined
  
  /**
    * The name the user gave the instance (e.g., Amazon_Linux-1GB-Ohio-1).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Information about the public ports and monthly data transfer rates for the instance.
    */
  var networking: js.UndefOr[InstanceNetworking] = js.undefined
  
  /**
    * The private IP address of the instance.
    */
  var privateIpAddress: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The public IP address of the instance.
    */
  var publicIpAddress: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The type of resource (usually Instance).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The name of the SSH key being used to connect to the instance (e.g., LightsailDefaultKeyPair).
    */
  var sshKeyName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The status code and the state (e.g., running) for the instance.
    */
  var state: js.UndefOr[InstanceState] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Amazon Lightsail Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The user name for connecting to the instance (e.g., ec2-user).
    */
  var username: js.UndefOr[NonEmptyString] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    inline def setAddOns(value: AddOnList): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    inline def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    inline def setAddOnsVarargs(value: AddOn*): Self = StObject.set(x, "addOns", js.Array(value*))
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBlueprintId(value: NonEmptyString): Self = StObject.set(x, "blueprintId", value.asInstanceOf[js.Any])
    
    inline def setBlueprintIdUndefined: Self = StObject.set(x, "blueprintId", js.undefined)
    
    inline def setBlueprintName(value: NonEmptyString): Self = StObject.set(x, "blueprintName", value.asInstanceOf[js.Any])
    
    inline def setBlueprintNameUndefined: Self = StObject.set(x, "blueprintName", js.undefined)
    
    inline def setBundleId(value: NonEmptyString): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setHardware(value: InstanceHardware): Self = StObject.set(x, "hardware", value.asInstanceOf[js.Any])
    
    inline def setHardwareUndefined: Self = StObject.set(x, "hardware", js.undefined)
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "ipAddressType", js.undefined)
    
    inline def setIpv6Addresses(value: Ipv6AddressList): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: Ipv6Address*): Self = StObject.set(x, "ipv6Addresses", js.Array(value*))
    
    inline def setIsStaticIp(value: Boolean): Self = StObject.set(x, "isStaticIp", value.asInstanceOf[js.Any])
    
    inline def setIsStaticIpUndefined: Self = StObject.set(x, "isStaticIp", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMetadataOptions(value: InstanceMetadataOptions): Self = StObject.set(x, "metadataOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptionsUndefined: Self = StObject.set(x, "metadataOptions", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworking(value: InstanceNetworking): Self = StObject.set(x, "networking", value.asInstanceOf[js.Any])
    
    inline def setNetworkingUndefined: Self = StObject.set(x, "networking", js.undefined)
    
    inline def setPrivateIpAddress(value: IpAddress): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
    
    inline def setPublicIpAddress(value: IpAddress): Self = StObject.set(x, "publicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPublicIpAddressUndefined: Self = StObject.set(x, "publicIpAddress", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSshKeyName(value: ResourceName): Self = StObject.set(x, "sshKeyName", value.asInstanceOf[js.Any])
    
    inline def setSshKeyNameUndefined: Self = StObject.set(x, "sshKeyName", js.undefined)
    
    inline def setState(value: InstanceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUsername(value: NonEmptyString): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
