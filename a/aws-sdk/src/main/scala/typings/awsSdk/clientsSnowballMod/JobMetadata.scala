package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobMetadata extends StObject {
  
  /**
    * The ID for the address that you want the Snow device shipped to.
    */
  var AddressId: js.UndefOr[typings.awsSdk.clientsSnowballMod.AddressId] = js.undefined
  
  /**
    * The 39-character ID for the cluster, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The creation date for this job.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A value that defines the real-time status of a Snow device's data transfer while the device is at Amazon Web Services. This data is only available while a job has a JobState value of InProgress, for both import and export jobs.
    */
  var DataTransferProgress: js.UndefOr[DataTransfer] = js.undefined
  
  /**
    * The description of the job, provided at job creation.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  var DeviceConfiguration: js.UndefOr[typings.awsSdk.clientsSnowballMod.DeviceConfiguration] = js.undefined
  
  /**
    * The ID of the address that you want a job shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
  
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: js.UndefOr[String] = js.undefined
  
  /**
    * Links to Amazon S3 presigned URLs for the job report and logs. For import jobs, the PDF job report becomes available at the end of the import process. For export jobs, your job report typically becomes available while the Snow device for your job part is being delivered to you.
    */
  var JobLogInfo: js.UndefOr[JobLogs] = js.undefined
  
  /**
    * The current status of the jobs.
    */
  var JobState: js.UndefOr[typings.awsSdk.clientsSnowballMod.JobState] = js.undefined
  
  /**
    * The type of job.
    */
  var JobType: js.UndefOr[typings.awsSdk.clientsSnowballMod.JobType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the Key Management Service (KMS) key associated with this job. This ARN was created using the CreateKey API action in KMS.
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.clientsSnowballMod.KmsKeyARN] = js.undefined
  
  /**
    * The ID of the long-term pricing type for the device.
    */
  var LongTermPricingId: js.UndefOr[typings.awsSdk.clientsSnowballMod.LongTermPricingId] = js.undefined
  
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The Notification object is returned as a part of the response syntax of the DescribeJob action in the JobMetadata data type.
    */
  var Notification: js.UndefOr[typings.awsSdk.clientsSnowballMod.Notification] = js.undefined
  
  /**
    * Represents metadata and configuration settings for services on an Amazon Web Services Snow Family device.
    */
  var OnDeviceServiceConfiguration: js.UndefOr[typings.awsSdk.clientsSnowballMod.OnDeviceServiceConfiguration] = js.undefined
  
  /**
    * Allows you to securely operate and manage Snowcone devices remotely from outside of your internal network. When set to INSTALLED_AUTOSTART, remote management will automatically be available when the device arrives at your location. Otherwise, you need to use the Snowball Client to manage the device.
    */
  var RemoteManagement: js.UndefOr[typings.awsSdk.clientsSnowballMod.RemoteManagement] = js.undefined
  
  /**
    * An array of S3Resource objects. Each S3Resource object represents an Amazon S3 bucket that your transferred data will be exported from or imported into.
    */
  var Resources: js.UndefOr[JobResource] = js.undefined
  
  /**
    * The role ARN associated with this job. This ARN was created using the CreateRole API action in Identity and Access Management.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.clientsSnowballMod.RoleARN] = js.undefined
  
  /**
    * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
    */
  var ShippingDetails: js.UndefOr[typings.awsSdk.clientsSnowballMod.ShippingDetails] = js.undefined
  
  /**
    * The Snow device capacity preference for this job, specified at job creation. In US regions, you can choose between 50 TB and 80 TB Snowballs. All other regions use 80 TB capacity Snowballs. For more information, see "https://docs.aws.amazon.com/snowball/latest/snowcone-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide or "https://docs.aws.amazon.com/snowball/latest/developer-guide/snow-device-types.html" (Snow Family Devices and Capacity) in the Snowcone User Guide.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined
  
  /**
    * The type of device used with this job.
    */
  var SnowballType: js.UndefOr[typings.awsSdk.clientsSnowballMod.SnowballType] = js.undefined
  
  /**
    * The metadata associated with the tax documents required in your Amazon Web Services Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.clientsSnowballMod.TaxDocuments] = js.undefined
}
object JobMetadata {
  
  inline def apply(): JobMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMetadata]
  }
  
  extension [Self <: JobMetadata](x: Self) {
    
    inline def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    inline def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
    
    inline def setClusterId(value: String): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDataTransferProgress(value: DataTransfer): Self = StObject.set(x, "DataTransferProgress", value.asInstanceOf[js.Any])
    
    inline def setDataTransferProgressUndefined: Self = StObject.set(x, "DataTransferProgress", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceConfiguration(value: DeviceConfiguration): Self = StObject.set(x, "DeviceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigurationUndefined: Self = StObject.set(x, "DeviceConfiguration", js.undefined)
    
    inline def setForwardingAddressId(value: AddressId): Self = StObject.set(x, "ForwardingAddressId", value.asInstanceOf[js.Any])
    
    inline def setForwardingAddressIdUndefined: Self = StObject.set(x, "ForwardingAddressId", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobLogInfo(value: JobLogs): Self = StObject.set(x, "JobLogInfo", value.asInstanceOf[js.Any])
    
    inline def setJobLogInfoUndefined: Self = StObject.set(x, "JobLogInfo", js.undefined)
    
    inline def setJobState(value: JobState): Self = StObject.set(x, "JobState", value.asInstanceOf[js.Any])
    
    inline def setJobStateUndefined: Self = StObject.set(x, "JobState", js.undefined)
    
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
    
    inline def setShippingDetails(value: ShippingDetails): Self = StObject.set(x, "ShippingDetails", value.asInstanceOf[js.Any])
    
    inline def setShippingDetailsUndefined: Self = StObject.set(x, "ShippingDetails", js.undefined)
    
    inline def setSnowballCapacityPreference(value: SnowballCapacity): Self = StObject.set(x, "SnowballCapacityPreference", value.asInstanceOf[js.Any])
    
    inline def setSnowballCapacityPreferenceUndefined: Self = StObject.set(x, "SnowballCapacityPreference", js.undefined)
    
    inline def setSnowballType(value: SnowballType): Self = StObject.set(x, "SnowballType", value.asInstanceOf[js.Any])
    
    inline def setSnowballTypeUndefined: Self = StObject.set(x, "SnowballType", js.undefined)
    
    inline def setTaxDocuments(value: TaxDocuments): Self = StObject.set(x, "TaxDocuments", value.asInstanceOf[js.Any])
    
    inline def setTaxDocumentsUndefined: Self = StObject.set(x, "TaxDocuments", js.undefined)
  }
}
