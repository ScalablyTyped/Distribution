package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobRequest extends StObject {
  
  /**
    * The ID for the address that you want the Snow device shipped to.
    */
  var AddressId: js.UndefOr[typings.awsSdk.clientsSnowballMod.AddressId] = js.undefined
  
  /**
    * The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this clusterId value. The other job attributes are inherited from the cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.clientsSnowballMod.ClusterId] = js.undefined
  
  /**
    * Defines an optional description of this specific job, for example Important Photos 2016-08-11.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the device configuration for an Snowcone job. For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide or "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide.
    */
  var DeviceConfiguration: js.UndefOr[typings.awsSdk.clientsSnowballMod.DeviceConfiguration] = js.undefined
  
  /**
    * The forwarding address ID for a job. This field is not supported in most Regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
  
  /**
    * Defines the type of job that you're creating. 
    */
  var JobType: js.UndefOr[typings.awsSdk.clientsSnowballMod.JobType] = js.undefined
  
  /**
    * The KmsKeyARN that you want to associate with this job. KmsKeyARNs are created using the CreateKey Key Management Service (KMS) API action.
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.clientsSnowballMod.KmsKeyARN] = js.undefined
  
  /**
    * The ID of the long-term pricing type for the device.
    */
  var LongTermPricingId: js.UndefOr[typings.awsSdk.clientsSnowballMod.LongTermPricingId] = js.undefined
  
  /**
    * Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
    */
  var Notification: js.UndefOr[typings.awsSdk.clientsSnowballMod.Notification] = js.undefined
  
  /**
    * Specifies the service or services on the Snow Family device that your transferred data will be exported from or imported into. Amazon Web Services Snow Family supports Amazon S3 and NFS (Network File System) and the Amazon Web Services Storage Gateway service Tape Gateway type.
    */
  var OnDeviceServiceConfiguration: js.UndefOr[typings.awsSdk.clientsSnowballMod.OnDeviceServiceConfiguration] = js.undefined
  
  /**
    * Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network. When set to INSTALLED_AUTOSTART, remote management will automatically be available when the device arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
    */
  var RemoteManagement: js.UndefOr[typings.awsSdk.clientsSnowballMod.RemoteManagement] = js.undefined
  
  /**
    * Defines the Amazon S3 buckets associated with this job. With IMPORT jobs, you specify the bucket or buckets that your transferred data will be imported into. With EXPORT jobs, you specify the bucket or buckets that your transferred data will be exported from. Optionally, you can also specify a KeyRange value. If you choose to export a range, you define the length of the range by providing either an inclusive BeginMarker value, an inclusive EndMarker value, or both. Ranges are UTF-8 binary sorted.
    */
  var Resources: js.UndefOr[JobResource] = js.undefined
  
  /**
    * The RoleARN that you want to associate with this job. RoleArns are created using the CreateRole Identity and Access Management (IAM) API action.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.clientsSnowballMod.RoleARN] = js.undefined
  
  /**
    * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snow devices are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.clientsSnowballMod.ShippingOption] = js.undefined
  
  /**
    * If your job is being created in one of the US regions, you have the option of specifying what size Snow device you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity. For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide or "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined
  
  /**
    * The type of Snow Family devices to use for this job.   For cluster jobs, Amazon Web Services Snow Family currently supports only the EDGE device type.  The type of Amazon Web Services Snow device to use for this job. Currently, the only supported device type for cluster jobs is EDGE. For more information, see Snowball Edge Device Options in the Snowball Edge Developer Guide. For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide or "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide.
    */
  var SnowballType: js.UndefOr[typings.awsSdk.clientsSnowballMod.SnowballType] = js.undefined
  
  /**
    * The tax documents required in your Amazon Web Services Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.clientsSnowballMod.TaxDocuments] = js.undefined
}
object CreateJobRequest {
  
  inline def apply(): CreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    
    inline def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    inline def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceConfiguration(value: DeviceConfiguration): Self = StObject.set(x, "DeviceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigurationUndefined: Self = StObject.set(x, "DeviceConfiguration", js.undefined)
    
    inline def setForwardingAddressId(value: AddressId): Self = StObject.set(x, "ForwardingAddressId", value.asInstanceOf[js.Any])
    
    inline def setForwardingAddressIdUndefined: Self = StObject.set(x, "ForwardingAddressId", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    inline def setKmsKeyARN(value: KmsKeyARN): Self = StObject.set(x, "KmsKeyARN", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyARNUndefined: Self = StObject.set(x, "KmsKeyARN", js.undefined)
    
    inline def setLongTermPricingId(value: LongTermPricingId): Self = StObject.set(x, "LongTermPricingId", value.asInstanceOf[js.Any])
    
    inline def setLongTermPricingIdUndefined: Self = StObject.set(x, "LongTermPricingId", js.undefined)
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
    
    inline def setOnDeviceServiceConfiguration(value: OnDeviceServiceConfiguration): Self = StObject.set(x, "OnDeviceServiceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOnDeviceServiceConfigurationUndefined: Self = StObject.set(x, "OnDeviceServiceConfiguration", js.undefined)
    
    inline def setRemoteManagement(value: RemoteManagement): Self = StObject.set(x, "RemoteManagement", value.asInstanceOf[js.Any])
    
    inline def setRemoteManagementUndefined: Self = StObject.set(x, "RemoteManagement", js.undefined)
    
    inline def setResources(value: JobResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setShippingOption(value: ShippingOption): Self = StObject.set(x, "ShippingOption", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionUndefined: Self = StObject.set(x, "ShippingOption", js.undefined)
    
    inline def setSnowballCapacityPreference(value: SnowballCapacity): Self = StObject.set(x, "SnowballCapacityPreference", value.asInstanceOf[js.Any])
    
    inline def setSnowballCapacityPreferenceUndefined: Self = StObject.set(x, "SnowballCapacityPreference", js.undefined)
    
    inline def setSnowballType(value: SnowballType): Self = StObject.set(x, "SnowballType", value.asInstanceOf[js.Any])
    
    inline def setSnowballTypeUndefined: Self = StObject.set(x, "SnowballType", js.undefined)
    
    inline def setTaxDocuments(value: TaxDocuments): Self = StObject.set(x, "TaxDocuments", value.asInstanceOf[js.Any])
    
    inline def setTaxDocumentsUndefined: Self = StObject.set(x, "TaxDocuments", js.undefined)
  }
}
