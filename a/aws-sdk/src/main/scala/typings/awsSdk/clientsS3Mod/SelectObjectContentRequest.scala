package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectObjectContentRequest extends StObject {
  
  /**
    * The S3 bucket.
    */
  var Bucket: BucketName
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The expression that is used to query the object.
    */
  var Expression: typings.awsSdk.clientsS3Mod.Expression
  
  /**
    * The type of the provided expression (for example, SQL).
    */
  var ExpressionType: typings.awsSdk.clientsS3Mod.ExpressionType
  
  /**
    * Describes the format of the data in the object that is being queried.
    */
  var InputSerialization: typings.awsSdk.clientsS3Mod.InputSerialization
  
  /**
    * The object key.
    */
  var Key: ObjectKey
  
  /**
    * Describes the format of the data that you want Amazon S3 to return in response.
    */
  var OutputSerialization: typings.awsSdk.clientsS3Mod.OutputSerialization
  
  /**
    * Specifies if periodic request progress information should be enabled.
    */
  var RequestProgress: js.UndefOr[typings.awsSdk.clientsS3Mod.RequestProgress] = js.undefined
  
  /**
    * The server-side encryption (SSE) algorithm used to encrypt the object. This parameter is needed only when the object was created using a checksum algorithm. For more information, see Protecting data using SSE-C keys in the Amazon S3 User Guide.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    * The server-side encryption (SSE) customer managed key. This parameter is needed only when the object was created using a checksum algorithm. For more information, see Protecting data using SSE-C keys in the Amazon S3 User Guide.
    */
  var SSECustomerKey: js.UndefOr[typings.awsSdk.clientsS3Mod.SSECustomerKey] = js.undefined
  
  /**
    * The MD5 server-side encryption (SSE) customer managed key. This parameter is needed only when the object was created using a checksum algorithm. For more information, see Protecting data using SSE-C keys in the Amazon S3 User Guide.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  
  /**
    * Specifies the byte range of the object to get the records from. A record is processed when its first byte is contained by the range. This parameter is optional, but when specified, it must not be empty. See RFC 2616, Section 14.35.1 about how to specify the start and end of the range.  ScanRangemay be used in the following ways:    &lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;end&gt;100&lt;/end&gt;&lt;/scanrange&gt; - process only the records starting between the bytes 50 and 100 (inclusive, counting from zero)    &lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt; - process only the records starting after the byte 50    &lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt; - process only the records within the last 50 bytes of the file.  
    */
  var ScanRange: js.UndefOr[typings.awsSdk.clientsS3Mod.ScanRange] = js.undefined
}
object SelectObjectContentRequest {
  
  inline def apply(
    Bucket: BucketName,
    Expression: Expression,
    ExpressionType: ExpressionType,
    InputSerialization: InputSerialization,
    Key: ObjectKey,
    OutputSerialization: OutputSerialization
  ): SelectObjectContentRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectObjectContentRequest]
  }
  
  extension [Self <: SelectObjectContentRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionType(value: ExpressionType): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
    
    inline def setInputSerialization(value: InputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setOutputSerialization(value: OutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
    
    inline def setRequestProgress(value: RequestProgress): Self = StObject.set(x, "RequestProgress", value.asInstanceOf[js.Any])
    
    inline def setRequestProgressUndefined: Self = StObject.set(x, "RequestProgress", js.undefined)
    
    inline def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    inline def setSSECustomerKey(value: SSECustomerKey): Self = StObject.set(x, "SSECustomerKey", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    inline def setSSECustomerKeyUndefined: Self = StObject.set(x, "SSECustomerKey", js.undefined)
    
    inline def setScanRange(value: ScanRange): Self = StObject.set(x, "ScanRange", value.asInstanceOf[js.Any])
    
    inline def setScanRangeUndefined: Self = StObject.set(x, "ScanRange", js.undefined)
  }
}
