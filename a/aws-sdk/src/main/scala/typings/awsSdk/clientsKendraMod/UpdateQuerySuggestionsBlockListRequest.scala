package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQuerySuggestionsBlockListRequest extends StObject {
  
  /**
    * A new description for the block list.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * The identifier of the block list you want to update.
    */
  var Id: QuerySuggestionsBlockListId
  
  /**
    * The identifier of the index for the block list.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * A new name for the block list.
    */
  var Name: js.UndefOr[QuerySuggestionsBlockListName] = js.undefined
  
  /**
    * The IAM (Identity and Access Management) role used to access the block list text file in S3.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
  
  /**
    * The S3 path where your block list text file sits in S3. If you update your block list and provide the same path to the block list text file in S3, then Amazon Kendra reloads the file to refresh the block list. Amazon Kendra does not automatically refresh your block list. You need to call the UpdateQuerySuggestionsBlockList API to refresh you block list. If you update your block list, then Amazon Kendra asynchronously refreshes all query suggestions with the latest content in the S3 file. This means changes might not take effect immediately.
    */
  var SourceS3Path: js.UndefOr[S3Path] = js.undefined
}
object UpdateQuerySuggestionsBlockListRequest {
  
  inline def apply(Id: QuerySuggestionsBlockListId, IndexId: IndexId): UpdateQuerySuggestionsBlockListRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQuerySuggestionsBlockListRequest]
  }
  
  extension [Self <: UpdateQuerySuggestionsBlockListRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: QuerySuggestionsBlockListId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setName(value: QuerySuggestionsBlockListName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSourceS3Path(value: S3Path): Self = StObject.set(x, "SourceS3Path", value.asInstanceOf[js.Any])
    
    inline def setSourceS3PathUndefined: Self = StObject.set(x, "SourceS3Path", js.undefined)
  }
}
