package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionConfigurationRequest extends StObject {
  
  /**
    * A dead-letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see Dead-letter queues.
    */
  var DeadLetterConfig: js.UndefOr[typings.awsSdk.clientsLambdaMod.DeadLetterConfig] = js.undefined
  
  /**
    * A description of the function.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsLambdaMod.Description] = js.undefined
  
  /**
    * Environment variables that are accessible from function code during execution.
    */
  var Environment: js.UndefOr[typings.awsSdk.clientsLambdaMod.Environment] = js.undefined
  
  /**
    * The size of the function's /tmp directory in MB. The default value is 512, but can be any whole number between 512 and 10,240 MB.
    */
  var EphemeralStorage: js.UndefOr[typings.awsSdk.clientsLambdaMod.EphemeralStorage] = js.undefined
  
  /**
    * Connection settings for an Amazon EFS file system.
    */
  var FileSystemConfigs: js.UndefOr[FileSystemConfigList] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name – my-function.    Function ARN – arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN – 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.clientsLambdaMod.FunctionName
  
  /**
    * The name of the method within your code that Lambda calls to run your function. Handler is required if the deployment package is a .zip file archive. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see Lambda programming model.
    */
  var Handler: js.UndefOr[typings.awsSdk.clientsLambdaMod.Handler] = js.undefined
  
  /**
    *  Container image configuration values that override the values in the container image Docker file.
    */
  var ImageConfig: js.UndefOr[typings.awsSdk.clientsLambdaMod.ImageConfig] = js.undefined
  
  /**
    * The ARN of the Key Management Service (KMS) customer managed key that's used to encrypt your function's environment variables. When Lambda SnapStart is activated, this key is also used to encrypt your function's snapshot. If you don't provide a customer managed key, Lambda uses a default service key.
    */
  var KMSKeyArn: js.UndefOr[typings.awsSdk.clientsLambdaMod.KMSKeyArn] = js.undefined
  
  /**
    * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
    */
  var Layers: js.UndefOr[LayerList] = js.undefined
  
  /**
    * The amount of memory available to the function at runtime. Increasing the function memory also increases its CPU allocation. The default value is 128 MB. The value can be any multiple of 1 MB.
    */
  var MemorySize: js.UndefOr[typings.awsSdk.clientsLambdaMod.MemorySize] = js.undefined
  
  /**
    * Update the function only if the revision ID matches the ID that's specified. Use this option to avoid modifying a function that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the function's execution role.
    */
  var Role: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The identifier of the function's runtime. Runtime is required if the deployment package is a .zip file archive. The following list includes deprecated runtimes. For more information, see Runtime deprecation policy.
    */
  var Runtime: js.UndefOr[typings.awsSdk.clientsLambdaMod.Runtime] = js.undefined
  
  /**
    * The function's SnapStart setting.
    */
  var SnapStart: js.UndefOr[typings.awsSdk.clientsLambdaMod.SnapStart] = js.undefined
  
  /**
    * The amount of time (in seconds) that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds. For more information, see Lambda execution environment.
    */
  var Timeout: js.UndefOr[typings.awsSdk.clientsLambdaMod.Timeout] = js.undefined
  
  /**
    * Set Mode to Active to sample and trace a subset of incoming requests with X-Ray.
    */
  var TracingConfig: js.UndefOr[typings.awsSdk.clientsLambdaMod.TracingConfig] = js.undefined
  
  /**
    * For network connectivity to Amazon Web Services resources in a VPC, specify a list of security groups and subnets in the VPC. When you connect a function to a VPC, it can access resources and the internet only through that VPC. For more information, see Configuring a Lambda function to access resources in a VPC.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsLambdaMod.VpcConfig] = js.undefined
}
object UpdateFunctionConfigurationRequest {
  
  inline def apply(FunctionName: FunctionName): UpdateFunctionConfigurationRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFunctionConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setEphemeralStorage(value: EphemeralStorage): Self = StObject.set(x, "EphemeralStorage", value.asInstanceOf[js.Any])
    
    inline def setEphemeralStorageUndefined: Self = StObject.set(x, "EphemeralStorage", js.undefined)
    
    inline def setFileSystemConfigs(value: FileSystemConfigList): Self = StObject.set(x, "FileSystemConfigs", value.asInstanceOf[js.Any])
    
    inline def setFileSystemConfigsUndefined: Self = StObject.set(x, "FileSystemConfigs", js.undefined)
    
    inline def setFileSystemConfigsVarargs(value: FileSystemConfig*): Self = StObject.set(x, "FileSystemConfigs", js.Array(value*))
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: Handler): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
    
    inline def setImageConfig(value: ImageConfig): Self = StObject.set(x, "ImageConfig", value.asInstanceOf[js.Any])
    
    inline def setImageConfigUndefined: Self = StObject.set(x, "ImageConfig", js.undefined)
    
    inline def setKMSKeyArn(value: KMSKeyArn): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyArnUndefined: Self = StObject.set(x, "KMSKeyArn", js.undefined)
    
    inline def setLayers(value: LayerList): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    inline def setLayersVarargs(value: LayerVersionArn*): Self = StObject.set(x, "Layers", js.Array(value*))
    
    inline def setMemorySize(value: MemorySize): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setRole(value: RoleArn): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setRuntime(value: Runtime): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
    
    inline def setSnapStart(value: SnapStart): Self = StObject.set(x, "SnapStart", value.asInstanceOf[js.Any])
    
    inline def setSnapStartUndefined: Self = StObject.set(x, "SnapStart", js.undefined)
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    inline def setTracingConfig(value: TracingConfig): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
    
    inline def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
