package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTableInput extends StObject {
  
  /**
    * Providing a ClientToken makes the call to ImportTableInput idempotent, meaning that multiple identical calls have the same effect as one single call. A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 8 hours, or the result might not be idempotent. If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ClientToken] = js.undefined
  
  /**
    *  Type of compression to be used on the input coming from the imported table. 
    */
  var InputCompressionType: js.UndefOr[typings.awsSdk.clientsDynamodbMod.InputCompressionType] = js.undefined
  
  /**
    *  The format of the source data. Valid values for ImportFormat are CSV, DYNAMODB_JSON or ION. 
    */
  var InputFormat: typings.awsSdk.clientsDynamodbMod.InputFormat
  
  /**
    *  Additional properties that specify how the input is formatted, 
    */
  var InputFormatOptions: js.UndefOr[typings.awsSdk.clientsDynamodbMod.InputFormatOptions] = js.undefined
  
  /**
    *  The S3 bucket that provides the source for the import. 
    */
  var S3BucketSource: typings.awsSdk.clientsDynamodbMod.S3BucketSource
  
  /**
    * Parameters for the table to import the data into. 
    */
  var TableCreationParameters: typings.awsSdk.clientsDynamodbMod.TableCreationParameters
}
object ImportTableInput {
  
  inline def apply(
    InputFormat: InputFormat,
    S3BucketSource: S3BucketSource,
    TableCreationParameters: TableCreationParameters
  ): ImportTableInput = {
    val __obj = js.Dynamic.literal(InputFormat = InputFormat.asInstanceOf[js.Any], S3BucketSource = S3BucketSource.asInstanceOf[js.Any], TableCreationParameters = TableCreationParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportTableInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setInputCompressionType(value: InputCompressionType): Self = StObject.set(x, "InputCompressionType", value.asInstanceOf[js.Any])
    
    inline def setInputCompressionTypeUndefined: Self = StObject.set(x, "InputCompressionType", js.undefined)
    
    inline def setInputFormat(value: InputFormat): Self = StObject.set(x, "InputFormat", value.asInstanceOf[js.Any])
    
    inline def setInputFormatOptions(value: InputFormatOptions): Self = StObject.set(x, "InputFormatOptions", value.asInstanceOf[js.Any])
    
    inline def setInputFormatOptionsUndefined: Self = StObject.set(x, "InputFormatOptions", js.undefined)
    
    inline def setS3BucketSource(value: S3BucketSource): Self = StObject.set(x, "S3BucketSource", value.asInstanceOf[js.Any])
    
    inline def setTableCreationParameters(value: TableCreationParameters): Self = StObject.set(x, "TableCreationParameters", value.asInstanceOf[js.Any])
  }
}
