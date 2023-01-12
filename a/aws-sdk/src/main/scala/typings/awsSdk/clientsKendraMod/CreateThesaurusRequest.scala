package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThesaurusRequest extends StObject {
  
  /**
    * A token that you provide to identify the request to create a thesaurus. Multiple calls to the CreateThesaurus API with the same client token will create only one thesaurus. 
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.undefined
  
  /**
    * A description for the thesaurus.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * The identifier of the index for the thesaurus.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * A name for the thesaurus.
    */
  var Name: ThesaurusName
  
  /**
    * An IAM role that gives Amazon Kendra permissions to access thesaurus file specified in SourceS3Path. 
    */
  var RoleArn: typings.awsSdk.clientsKendraMod.RoleArn
  
  /**
    * The path to the thesaurus file in S3.
    */
  var SourceS3Path: S3Path
  
  /**
    * A list of key-value pairs that identify the thesaurus. You can use the tags to identify and organize your resources and to control access to resources. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateThesaurusRequest {
  
  inline def apply(IndexId: IndexId, Name: ThesaurusName, RoleArn: RoleArn, SourceS3Path: S3Path): CreateThesaurusRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SourceS3Path = SourceS3Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThesaurusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateThesaurusRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientTokenName): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ThesaurusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSourceS3Path(value: S3Path): Self = StObject.set(x, "SourceS3Path", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
