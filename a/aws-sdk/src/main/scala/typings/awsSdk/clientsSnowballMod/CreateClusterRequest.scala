package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterRequest extends StObject {
  
  /**
    * The ID for the address that you want the cluster shipped to.
    */
  var AddressId: typings.awsSdk.clientsSnowballMod.AddressId
  
  /**
    * An optional description of this specific cluster, for example Environmental Data Cluster-01.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Force to create cluster when user attempts to overprovision or underprovision a cluster. A cluster is overprovisioned or underprovisioned if the initial size of the cluster is more (overprovisioned) or less (underprovisioned) than what needed to meet capacity requirement specified with OnDeviceServiceConfiguration.
    */
  var ForceCreateJobs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The forwarding address ID for a cluster. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
  
  /**
    * If provided, each job will be automatically created and associated with the new cluster. If not provided, will be treated as 0.
    */
  var InitialClusterSize: js.UndefOr[typings.awsSdk.clientsSnowballMod.InitialClusterSize] = js.undefined
  
  /**
    * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE. For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide or "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide.
    */
  var JobType: typings.awsSdk.clientsSnowballMod.JobType
  
  /**
    * The KmsKeyARN value that you want to associate with this cluster. KmsKeyARN values are created by using the CreateKey API action in Key Management Service (KMS). 
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.clientsSnowballMod.KmsKeyARN] = js.undefined
  
  /**
    * Lists long-term pricing id that will be used to associate with jobs automatically created for the new cluster.
    */
  var LongTermPricingIds: js.UndefOr[LongTermPricingIdList] = js.undefined
  
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
    */
  var Notification: js.UndefOr[typings.awsSdk.clientsSnowballMod.Notification] = js.undefined
  
  /**
    * Specifies the service or services on the Snow Family device that your transferred data will be exported from or imported into. Amazon Web Services Snow Family device clusters support Amazon S3 and NFS (Network File System).
    */
  var OnDeviceServiceConfiguration: js.UndefOr[typings.awsSdk.clientsSnowballMod.OnDeviceServiceConfiguration] = js.undefined
  
  /**
    * Allows you to securely operate and manage Snow devices in a cluster remotely from outside of your internal network. When set to INSTALLED_AUTOSTART, remote management will automatically be available when the device arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
    */
  var RemoteManagement: js.UndefOr[typings.awsSdk.clientsSnowballMod.RemoteManagement] = js.undefined
  
  /**
    * The resources associated with the cluster job. These resources include Amazon S3 buckets and optional Lambda functions written in the Python language. 
    */
  var Resources: js.UndefOr[JobResource] = js.undefined
  
  /**
    * The RoleARN that you want to associate with this cluster. RoleArn values are created by using the CreateRole API action in Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typings.awsSdk.clientsSnowballMod.RoleARN] = js.undefined
  
  /**
    * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:    In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snow devices are delivered in one to seven days.   In the United States of America (US), you have access to one-day shipping and two-day shipping.     In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snow devices are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: typings.awsSdk.clientsSnowballMod.ShippingOption
  
  /**
    * If your job is being created in one of the US regions, you have the option of specifying what size Snow device you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity. For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide or "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined
  
  /**
    * The type of Snow Family devices to use for this cluster.   For cluster jobs, Amazon Web Services Snow Family currently supports only the EDGE device type.  For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide or "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide.
    */
  var SnowballType: typings.awsSdk.clientsSnowballMod.SnowballType
  
  /**
    * The tax documents required in your Amazon Web Services Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.clientsSnowballMod.TaxDocuments] = js.undefined
}
object CreateClusterRequest {
  
  inline def apply(AddressId: AddressId, JobType: JobType, ShippingOption: ShippingOption, SnowballType: SnowballType): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(AddressId = AddressId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], ShippingOption = ShippingOption.asInstanceOf[js.Any], SnowballType = SnowballType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
    
    inline def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setForceCreateJobs(value: Boolean): Self = StObject.set(x, "ForceCreateJobs", value.asInstanceOf[js.Any])
    
    inline def setForceCreateJobsUndefined: Self = StObject.set(x, "ForceCreateJobs", js.undefined)
    
    inline def setForwardingAddressId(value: AddressId): Self = StObject.set(x, "ForwardingAddressId", value.asInstanceOf[js.Any])
    
    inline def setForwardingAddressIdUndefined: Self = StObject.set(x, "ForwardingAddressId", js.undefined)
    
    inline def setInitialClusterSize(value: InitialClusterSize): Self = StObject.set(x, "InitialClusterSize", value.asInstanceOf[js.Any])
    
    inline def setInitialClusterSizeUndefined: Self = StObject.set(x, "InitialClusterSize", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyARN(value: KmsKeyARN): Self = StObject.set(x, "KmsKeyARN", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyARNUndefined: Self = StObject.set(x, "KmsKeyARN", js.undefined)
    
    inline def setLongTermPricingIds(value: LongTermPricingIdList): Self = StObject.set(x, "LongTermPricingIds", value.asInstanceOf[js.Any])
    
    inline def setLongTermPricingIdsUndefined: Self = StObject.set(x, "LongTermPricingIds", js.undefined)
    
    inline def setLongTermPricingIdsVarargs(value: LongTermPricingId*): Self = StObject.set(x, "LongTermPricingIds", js.Array(value*))
    
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
    
    inline def setSnowballCapacityPreference(value: SnowballCapacity): Self = StObject.set(x, "SnowballCapacityPreference", value.asInstanceOf[js.Any])
    
    inline def setSnowballCapacityPreferenceUndefined: Self = StObject.set(x, "SnowballCapacityPreference", js.undefined)
    
    inline def setSnowballType(value: SnowballType): Self = StObject.set(x, "SnowballType", value.asInstanceOf[js.Any])
    
    inline def setTaxDocuments(value: TaxDocuments): Self = StObject.set(x, "TaxDocuments", value.asInstanceOf[js.Any])
    
    inline def setTaxDocumentsUndefined: Self = StObject.set(x, "TaxDocuments", js.undefined)
  }
}
