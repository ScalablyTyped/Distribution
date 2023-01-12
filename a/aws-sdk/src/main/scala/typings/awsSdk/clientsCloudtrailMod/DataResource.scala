package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataResource extends StObject {
  
  /**
    * The resource type in which you want to log data events. You can specify the following basic event selector resource types:    AWS::S3::Object     AWS::Lambda::Function     AWS::DynamoDB::Table    The following resource types are also available through advanced event selectors. Basic event selector resource types are valid in advanced event selectors, but advanced event selector resource types are not valid in basic event selectors. For more information, see AdvancedFieldSelector$Field.    AWS::S3Outposts::Object     AWS::ManagedBlockchain::Node     AWS::S3ObjectLambda::AccessPoint     AWS::EC2::Snapshot     AWS::S3::AccessPoint     AWS::DynamoDB::Stream     AWS::Glue::Table   
    */
  var Type: js.UndefOr[String] = js.undefined
  
  /**
    * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.   To log data events for all objects in all S3 buckets in your Amazon Web Services account, specify the prefix as arn:aws:s3.  This also enables logging of data event activity performed by any user or role in your Amazon Web Services account, even if that activity is performed on a bucket that belongs to another Amazon Web Services account.    To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as arn:aws:s3:::bucket-1/. The trail logs data events for all objects in this S3 bucket.   To log data events for specific objects, specify the S3 bucket and object prefix such as arn:aws:s3:::bucket-1/example-images. The trail logs data events for objects in this S3 bucket that match the prefix.   To log data events for all Lambda functions in your Amazon Web Services account, specify the prefix as arn:aws:lambda.  This also enables logging of Invoke activity performed by any user or role in your Amazon Web Services account, even if that activity is performed on a function that belongs to another Amazon Web Services account.     To log data events for a specific Lambda function, specify the function ARN.  Lambda function ARNs are exact. For example, if you specify a function ARN arn:aws:lambda:us-west-2:111111111111:function:helloworld, data events will only be logged for arn:aws:lambda:us-west-2:111111111111:function:helloworld. They will not be logged for arn:aws:lambda:us-west-2:111111111111:function:helloworld2.    To log data events for all DynamoDB tables in your Amazon Web Services account, specify the prefix as arn:aws:dynamodb.  
    */
  var Values: js.UndefOr[DataResourceValues] = js.undefined
}
object DataResource {
  
  inline def apply(): DataResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataResource] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValues(value: DataResourceValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
