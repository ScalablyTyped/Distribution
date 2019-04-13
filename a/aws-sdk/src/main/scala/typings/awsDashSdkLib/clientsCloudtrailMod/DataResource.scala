package typings
package awsDashSdkLib.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataResource extends js.Object {
  /**
    * The resource type in which you want to log data events. You can specify AWS::S3::Object or AWS::Lambda::Function resources.
    */
  var Type: js.UndefOr[String] = js.undefined
  /**
    * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.   To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as arn:aws:s3:::.   This will also enable logging of data event activity performed by any user or role in your AWS account, even if that activity is performed on a bucket that belongs to another AWS account.     To log data events for all objects in all S3 buckets that include my-bucket in their names, specify the prefix as aws:s3:::my-bucket. The trail logs data events for all objects in all buckets whose name contains a match for my-bucket.    To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as arn:aws:s3:::bucket-1/. The trail logs data events for all objects in this S3 bucket.   To log data events for specific objects, specify the S3 bucket and object prefix such as arn:aws:s3:::bucket-1/example-images. The trail logs data events for objects in this S3 bucket that match the prefix.   To log data events for all functions in your AWS account, specify the prefix as arn:aws:lambda.  This will also enable logging of Invoke activity performed by any user or role in your AWS account, even if that activity is performed on a function that belongs to another AWS account.     To log data eents for a specific Lambda function, specify the function ARN.  Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a function ARN arn:aws:lambda:us-west-2:111111111111:function:helloworld, data events will only be logged for arn:aws:lambda:us-west-2:111111111111:function:helloworld. They will not be logged for arn:aws:lambda:us-west-2:111111111111:function:helloworld2.   
    */
  var Values: js.UndefOr[DataResourceValues] = js.undefined
}

object DataResource {
  @scala.inline
  def apply(Type: String = null, Values: DataResourceValues = null): DataResource = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[DataResource]
  }
}

