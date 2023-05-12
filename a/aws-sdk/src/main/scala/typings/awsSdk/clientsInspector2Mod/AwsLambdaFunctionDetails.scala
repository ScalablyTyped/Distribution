package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaFunctionDetails extends StObject {
  
  /**
    * The instruction set architecture that the AWS Lambda function supports. Architecture is a string array with one of the valid values. The default architecture value is x86_64.
    */
  var architectures: js.UndefOr[ArchitectureList] = js.undefined
  
  /**
    * The SHA256 hash of the AWS Lambda function's deployment package.
    */
  var codeSha256: NonEmptyString
  
  /**
    * The AWS Lambda function's execution role.
    */
  var executionRoleArn: ExecutionRoleArn
  
  /**
    * The name of the AWS Lambda function.
    */
  var functionName: FunctionName
  
  /**
    * The date and time that a user last updated the configuration, in ISO 8601 format 
    */
  var lastModifiedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The AWS Lambda function's  layers. A Lambda function can have up to five layers.
    */
  var layers: js.UndefOr[LayerList] = js.undefined
  
  /**
    * The type of deployment package. Set to Image for container image and set Zip for .zip file archive.
    */
  var packageType: js.UndefOr[PackageType] = js.undefined
  
  /**
    * The runtime environment for the AWS Lambda function.
    */
  var runtime: Runtime
  
  /**
    * The version of the AWS Lambda function.
    */
  var version: Version
  
  /**
    * The AWS Lambda function's networking configuration.
    */
  var vpcConfig: js.UndefOr[LambdaVpcConfig] = js.undefined
}
object AwsLambdaFunctionDetails {
  
  inline def apply(
    codeSha256: NonEmptyString,
    executionRoleArn: ExecutionRoleArn,
    functionName: FunctionName,
    runtime: Runtime,
    version: Version
  ): AwsLambdaFunctionDetails = {
    val __obj = js.Dynamic.literal(codeSha256 = codeSha256.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsLambdaFunctionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsLambdaFunctionDetails] (val x: Self) extends AnyVal {
    
    inline def setArchitectures(value: ArchitectureList): Self = StObject.set(x, "architectures", value.asInstanceOf[js.Any])
    
    inline def setArchitecturesUndefined: Self = StObject.set(x, "architectures", js.undefined)
    
    inline def setArchitecturesVarargs(value: Architecture*): Self = StObject.set(x, "architectures", js.Array(value*))
    
    inline def setCodeSha256(value: NonEmptyString): Self = StObject.set(x, "codeSha256", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedAtUndefined: Self = StObject.set(x, "lastModifiedAt", js.undefined)
    
    inline def setLayers(value: LayerList): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: LambdaLayerArn*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setPackageType(value: PackageType): Self = StObject.set(x, "packageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "packageType", js.undefined)
    
    inline def setRuntime(value: Runtime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVpcConfig(value: LambdaVpcConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
