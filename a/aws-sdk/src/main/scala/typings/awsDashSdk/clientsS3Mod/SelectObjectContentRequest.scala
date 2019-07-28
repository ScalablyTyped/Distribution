package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectObjectContentRequest extends js.Object {
  /**
    * The S3 bucket.
    */
  var Bucket: BucketName
  /**
    * The expression that is used to query the object.
    */
  var Expression: typings.awsDashSdk.clientsS3Mod.Expression
  /**
    * The type of the provided expression (for example., SQL).
    */
  var ExpressionType: typings.awsDashSdk.clientsS3Mod.ExpressionType
  /**
    * Describes the format of the data in the object that is being queried.
    */
  var InputSerialization: typings.awsDashSdk.clientsS3Mod.InputSerialization
  /**
    * The object key.
    */
  var Key: ObjectKey
  /**
    * Describes the format of the data that you want Amazon S3 to return in response.
    */
  var OutputSerialization: typings.awsDashSdk.clientsS3Mod.OutputSerialization
  /**
    * Specifies if periodic request progress information should be enabled.
    */
  var RequestProgress: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestProgress] = js.undefined
  /**
    * The SSE Algorithm used to encrypt the object. For more information, see  Server-Side Encryption (Using Customer-Provided Encryption Keys. 
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  /**
    * The SSE Customer Key. For more information, see  Server-Side Encryption (Using Customer-Provided Encryption Keys. 
    */
  var SSECustomerKey: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKey] = js.undefined
  /**
    * The SSE Customer Key MD5. For more information, see  Server-Side Encryption (Using Customer-Provided Encryption Keys. 
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
}

object SelectObjectContentRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Expression: Expression,
    ExpressionType: ExpressionType,
    InputSerialization: InputSerialization,
    Key: ObjectKey,
    OutputSerialization: OutputSerialization,
    RequestProgress: RequestProgress = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKey: SSECustomerKey = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null
  ): SelectObjectContentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Expression = Expression, ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization, Key = Key, OutputSerialization = OutputSerialization)
    if (RequestProgress != null) __obj.updateDynamic("RequestProgress")(RequestProgress)
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    if (SSECustomerKey != null) __obj.updateDynamic("SSECustomerKey")(SSECustomerKey.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5)
    __obj.asInstanceOf[SelectObjectContentRequest]
  }
}

