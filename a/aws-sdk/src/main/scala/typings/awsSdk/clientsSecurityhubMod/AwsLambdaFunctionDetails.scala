package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaFunctionDetails extends StObject {
  
  /**
    * An AwsLambdaFunctionCode object.
    */
  var Code: js.UndefOr[AwsLambdaFunctionCode] = js.undefined
  
  /**
    * The SHA256 hash of the function's deployment package.
    */
  var CodeSha256: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The function's dead letter queue.
    */
  var DeadLetterConfig: js.UndefOr[AwsLambdaFunctionDeadLetterConfig] = js.undefined
  
  /**
    * The function's environment variables.
    */
  var Environment: js.UndefOr[AwsLambdaFunctionEnvironment] = js.undefined
  
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The function that Lambda calls to begin executing your function.
    */
  var Handler: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The KMS key that is used to encrypt the function's environment variables. This key is only returned if you've configured a customer managed customer managed key.
    */
  var KmsKeyArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the function was last updated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastModified: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The function's layers.
    */
  var Layers: js.UndefOr[AwsLambdaFunctionLayerList] = js.undefined
  
  /**
    * For Lambda@Edge functions, the ARN of the master function.
    */
  var MasterArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The memory that is allocated to the function.
    */
  var MemorySize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The latest updated revision of the function or alias.
    */
  var RevisionId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The function's execution role.
    */
  var Role: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The runtime environment for the Lambda function.
    */
  var Runtime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The amount of time that Lambda allows a function to run before stopping it.
    */
  var Timeout: js.UndefOr[Integer] = js.undefined
  
  /**
    * The function's X-Ray tracing configuration.
    */
  var TracingConfig: js.UndefOr[AwsLambdaFunctionTracingConfig] = js.undefined
  
  /**
    * The version of the Lambda function.
    */
  var Version: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The function's networking configuration.
    */
  var VpcConfig: js.UndefOr[AwsLambdaFunctionVpcConfig] = js.undefined
}
object AwsLambdaFunctionDetails {
  
  inline def apply(): AwsLambdaFunctionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsLambdaFunctionDetails] (val x: Self) extends AnyVal {
    
    inline def setCode(value: AwsLambdaFunctionCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeSha256(value: NonEmptyString): Self = StObject.set(x, "CodeSha256", value.asInstanceOf[js.Any])
    
    inline def setCodeSha256Undefined: Self = StObject.set(x, "CodeSha256", js.undefined)
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setDeadLetterConfig(value: AwsLambdaFunctionDeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
    
    inline def setEnvironment(value: AwsLambdaFunctionEnvironment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setFunctionName(value: NonEmptyString): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    inline def setHandler(value: NonEmptyString): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
    
    inline def setKmsKeyArn(value: NonEmptyString): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setLastModified(value: NonEmptyString): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setLayers(value: AwsLambdaFunctionLayerList): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    inline def setLayersVarargs(value: AwsLambdaFunctionLayer*): Self = StObject.set(x, "Layers", js.Array(value*))
    
    inline def setMasterArn(value: NonEmptyString): Self = StObject.set(x, "MasterArn", value.asInstanceOf[js.Any])
    
    inline def setMasterArnUndefined: Self = StObject.set(x, "MasterArn", js.undefined)
    
    inline def setMemorySize(value: Integer): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
    
    inline def setRevisionId(value: NonEmptyString): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setRole(value: NonEmptyString): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setRuntime(value: NonEmptyString): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
    
    inline def setTimeout(value: Integer): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    inline def setTracingConfig(value: AwsLambdaFunctionTracingConfig): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
    
    inline def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    
    inline def setVpcConfig(value: AwsLambdaFunctionVpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
