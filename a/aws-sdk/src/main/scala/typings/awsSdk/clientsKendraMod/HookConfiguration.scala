package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookConfiguration extends StObject {
  
  /**
    * The condition used for when a Lambda function should be invoked. For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra should invoke a function that inserts the current date-time.
    */
  var InvocationCondition: js.UndefOr[DocumentAttributeCondition] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a role with permission to run a Lambda function during ingestion. For more information, see IAM roles for Amazon Kendra.
    */
  var LambdaArn: typings.awsSdk.clientsKendraMod.LambdaArn
  
  /**
    * Stores the original, raw documents or the structured, parsed documents before and after altering them. For more information, see Data contracts for Lambda functions.
    */
  var S3Bucket: S3BucketName
}
object HookConfiguration {
  
  inline def apply(LambdaArn: LambdaArn, S3Bucket: S3BucketName): HookConfiguration = {
    val __obj = js.Dynamic.literal(LambdaArn = LambdaArn.asInstanceOf[js.Any], S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookConfiguration]
  }
  
  extension [Self <: HookConfiguration](x: Self) {
    
    inline def setInvocationCondition(value: DocumentAttributeCondition): Self = StObject.set(x, "InvocationCondition", value.asInstanceOf[js.Any])
    
    inline def setInvocationConditionUndefined: Self = StObject.set(x, "InvocationCondition", js.undefined)
    
    inline def setLambdaArn(value: LambdaArn): Self = StObject.set(x, "LambdaArn", value.asInstanceOf[js.Any])
    
    inline def setS3Bucket(value: S3BucketName): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
  }
}
