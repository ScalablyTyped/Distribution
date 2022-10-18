package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestTypeInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the extension. Conditional: You must specify Arn, or TypeName and Type.
    */
  var Arn: js.UndefOr[TypeArn] = js.undefined
  
  /**
    * The S3 bucket to which CloudFormation delivers the contract test execution logs. CloudFormation delivers the logs by the time contract testing has completed and the extension has been assigned a test type status of PASSED or FAILED. The user calling TestType must be able to access items in the specified S3 bucket. Specifically, the user needs the following permissions:    GetObject     PutObject    For more information, see Actions, Resources, and Condition Keys for Amazon S3 in the Amazon Web Services Identity and Access Management User Guide.
    */
  var LogDeliveryBucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The type of the extension to test. Conditional: You must specify Arn, or TypeName and Type.
    */
  var Type: js.UndefOr[ThirdPartyType] = js.undefined
  
  /**
    * The name of the extension to test. Conditional: You must specify Arn, or TypeName and Type.
    */
  var TypeName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TypeName] = js.undefined
  
  /**
    * The version of the extension to test. You can specify the version id with either Arn, or with TypeName and Type. If you don't specify a version, CloudFormation uses the default version of the extension in this account and region for testing.
    */
  var VersionId: js.UndefOr[TypeVersionId] = js.undefined
}
object TestTypeInput {
  
  inline def apply(): TestTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestTypeInput]
  }
  
  extension [Self <: TestTypeInput](x: Self) {
    
    inline def setArn(value: TypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setLogDeliveryBucket(value: S3Bucket): Self = StObject.set(x, "LogDeliveryBucket", value.asInstanceOf[js.Any])
    
    inline def setLogDeliveryBucketUndefined: Self = StObject.set(x, "LogDeliveryBucket", js.undefined)
    
    inline def setType(value: ThirdPartyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVersionId(value: TypeVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
