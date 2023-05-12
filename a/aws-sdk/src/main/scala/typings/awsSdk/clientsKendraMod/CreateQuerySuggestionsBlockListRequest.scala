package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuerySuggestionsBlockListRequest extends StObject {
  
  /**
    * A token that you provide to identify the request to create a query suggestions block list.
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.undefined
  
  /**
    * A description for the block list. For example, the description "List of all offensive words that can appear in user queries and need to be blocked from suggestions."
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * The identifier of the index you want to create a query suggestions block list for.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * A name for the block list. For example, the name 'offensive-words', which includes all offensive words that could appear in user queries and need to be blocked from suggestions.
    */
  var Name: QuerySuggestionsBlockListName
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role with permission to access your S3 bucket that contains the block list text file. For more information, see IAM access roles for Amazon Kendra.
    */
  var RoleArn: typings.awsSdk.clientsKendraMod.RoleArn
  
  /**
    * The S3 path to your block list text file in your S3 bucket. Each block word or phrase should be on a separate line in a text file. For information on the current quota limits for block lists, see Quotas for Amazon Kendra.
    */
  var SourceS3Path: S3Path
  
  /**
    * A list of key-value pairs that identify or categorize the block list. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + - @.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateQuerySuggestionsBlockListRequest {
  
  inline def apply(IndexId: IndexId, Name: QuerySuggestionsBlockListName, RoleArn: RoleArn, SourceS3Path: S3Path): CreateQuerySuggestionsBlockListRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SourceS3Path = SourceS3Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQuerySuggestionsBlockListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateQuerySuggestionsBlockListRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientTokenName): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setName(value: QuerySuggestionsBlockListName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSourceS3Path(value: S3Path): Self = StObject.set(x, "SourceS3Path", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
