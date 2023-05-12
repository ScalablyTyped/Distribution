package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQuerySuggestionsBlockListResponse extends StObject {
  
  /**
    * The Unix timestamp when a block list for query suggestions was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description for the block list.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * The error message containing details if there are issues processing the block list.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsKendraMod.ErrorMessage] = js.undefined
  
  /**
    * The current size of the block list text file in S3.
    */
  var FileSizeBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The identifier of the block list.
    */
  var Id: js.UndefOr[QuerySuggestionsBlockListId] = js.undefined
  
  /**
    * The identifier of the index for the block list.
    */
  var IndexId: js.UndefOr[typings.awsSdk.clientsKendraMod.IndexId] = js.undefined
  
  /**
    * The current number of valid, non-empty words or phrases in the block list text file.
    */
  var ItemCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the block list.
    */
  var Name: js.UndefOr[QuerySuggestionsBlockListName] = js.undefined
  
  /**
    * The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in S3. The role needs S3 read permissions to your file in S3 and needs to give STS (Security Token Service) assume role permissions to Amazon Kendra.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
  
  /**
    * Shows the current S3 path to your block list text file in your S3 bucket. Each block word or phrase should be on a separate line in a text file. For information on the current quota limits for block lists, see Quotas for Amazon Kendra.
    */
  var SourceS3Path: js.UndefOr[S3Path] = js.undefined
  
  /**
    * The current status of the block list. When the value is ACTIVE, the block list is ready for use.
    */
  var Status: js.UndefOr[QuerySuggestionsBlockListStatus] = js.undefined
  
  /**
    * The Unix timestamp when a block list for query suggestions was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DescribeQuerySuggestionsBlockListResponse {
  
  inline def apply(): DescribeQuerySuggestionsBlockListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQuerySuggestionsBlockListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeQuerySuggestionsBlockListResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setFileSizeBytes(value: Long): Self = StObject.set(x, "FileSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setFileSizeBytesUndefined: Self = StObject.set(x, "FileSizeBytes", js.undefined)
    
    inline def setId(value: QuerySuggestionsBlockListId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "IndexId", js.undefined)
    
    inline def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setName(value: QuerySuggestionsBlockListName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSourceS3Path(value: S3Path): Self = StObject.set(x, "SourceS3Path", value.asInstanceOf[js.Any])
    
    inline def setSourceS3PathUndefined: Self = StObject.set(x, "SourceS3Path", js.undefined)
    
    inline def setStatus(value: QuerySuggestionsBlockListStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
