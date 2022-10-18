package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMLTransformRequest extends StObject {
  
  /**
    * A description of the machine learning transform that is being defined. The default is an empty string.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * This value determines which version of Glue this machine learning transform is compatible with. Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more information, see Glue Versions in the developer guide.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.undefined
  
  /**
    * A list of Glue table definitions used by the transform.
    */
  var InputRecordTables: GlueTables
  
  /**
    * The number of Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the Glue pricing page.   MaxCapacity is a mutually exclusive option with NumberOfWorkers and WorkerType.   If either NumberOfWorkers or WorkerType is set, then MaxCapacity cannot be set.   If MaxCapacity is set then neither NumberOfWorkers or WorkerType can be set.   If WorkerType is set, then NumberOfWorkers is required (and vice versa).    MaxCapacity and NumberOfWorkers must both be at least 1.   When the WorkerType field is set to a value other than Standard, the MaxCapacity field is set automatically and becomes read-only. When the WorkerType field is set to a value other than Standard, the MaxCapacity field is set automatically and becomes read-only.
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * The maximum number of times to retry a task for this transform after a task run fails.
    */
  var MaxRetries: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The unique name that you give the transform when you create it.
    */
  var Name: NameString
  
  /**
    * The number of workers of a defined workerType that are allocated when this task runs. If WorkerType is set, then NumberOfWorkers is required (and vice versa).
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type.
    */
  var Parameters: TransformParameters
  
  /**
    * The name or Amazon Resource Name (ARN) of the IAM role with the required permissions. The required permissions include both Glue service role permissions to Glue resources, and Amazon S3 permissions required by the transform.    This role needs Glue service role permissions to allow access to resources in Glue. See Attach a Policy to IAM Users That Access Glue.   This role needs permission to your Amazon Simple Storage Service (Amazon S3) sources, targets, temporary directory, scripts, and any libraries used by the task run for this transform.  
    */
  var Role: RoleString
  
  /**
    * The tags to use with this machine learning transform. You may use tags to limit access to the machine learning transform. For more information about tags in Glue, see Amazon Web Services Tags in Glue in the developer guide.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * The timeout of the task run for this transform in minutes. This is the maximum time that a task run for this transform can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsSdk.clientsGlueMod.Timeout] = js.undefined
  
  /**
    * The encryption-at-rest settings of the transform that apply to accessing user data. Machine learning transforms can access user data encrypted in Amazon S3 using KMS.
    */
  var TransformEncryption: js.UndefOr[typings.awsSdk.clientsGlueMod.TransformEncryption] = js.undefined
  
  /**
    * The type of predefined worker that is allocated when this task runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.    MaxCapacity is a mutually exclusive option with NumberOfWorkers and WorkerType.   If either NumberOfWorkers or WorkerType is set, then MaxCapacity cannot be set.   If MaxCapacity is set then neither NumberOfWorkers or WorkerType can be set.   If WorkerType is set, then NumberOfWorkers is required (and vice versa).    MaxCapacity and NumberOfWorkers must both be at least 1.  
    */
  var WorkerType: js.UndefOr[typings.awsSdk.clientsGlueMod.WorkerType] = js.undefined
}
object CreateMLTransformRequest {
  
  inline def apply(InputRecordTables: GlueTables, Name: NameString, Parameters: TransformParameters, Role: RoleString): CreateMLTransformRequest = {
    val __obj = js.Dynamic.literal(InputRecordTables = InputRecordTables.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMLTransformRequest]
  }
  
  extension [Self <: CreateMLTransformRequest](x: Self) {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlueVersion(value: GlueVersionString): Self = StObject.set(x, "GlueVersion", value.asInstanceOf[js.Any])
    
    inline def setGlueVersionUndefined: Self = StObject.set(x, "GlueVersion", js.undefined)
    
    inline def setInputRecordTables(value: GlueTables): Self = StObject.set(x, "InputRecordTables", value.asInstanceOf[js.Any])
    
    inline def setInputRecordTablesVarargs(value: GlueTable*): Self = StObject.set(x, "InputRecordTables", js.Array(value*))
    
    inline def setMaxCapacity(value: NullableDouble): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setMaxRetries(value: NullableInteger): Self = StObject.set(x, "MaxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "MaxRetries", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    inline def setParameters(value: TransformParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setRole(value: RoleString): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    inline def setTransformEncryption(value: TransformEncryption): Self = StObject.set(x, "TransformEncryption", value.asInstanceOf[js.Any])
    
    inline def setTransformEncryptionUndefined: Self = StObject.set(x, "TransformEncryption", js.undefined)
    
    inline def setWorkerType(value: WorkerType): Self = StObject.set(x, "WorkerType", value.asInstanceOf[js.Any])
    
    inline def setWorkerTypeUndefined: Self = StObject.set(x, "WorkerType", js.undefined)
  }
}
