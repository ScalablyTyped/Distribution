package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThesaurusRequest extends StObject {
  
  /**
    * A new description for the thesaurus.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * The identifier of the thesaurus you want to update.
    */
  var Id: ThesaurusId
  
  /**
    * The identifier of the index for the thesaurus.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * A new name for the thesaurus.
    */
  var Name: js.UndefOr[ThesaurusName] = js.undefined
  
  /**
    * An IAM role that gives Amazon Kendra permissions to access thesaurus file specified in SourceS3Path.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
  
  var SourceS3Path: js.UndefOr[S3Path] = js.undefined
}
object UpdateThesaurusRequest {
  
  inline def apply(Id: ThesaurusId, IndexId: IndexId): UpdateThesaurusRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThesaurusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateThesaurusRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: ThesaurusId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ThesaurusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSourceS3Path(value: S3Path): Self = StObject.set(x, "SourceS3Path", value.asInstanceOf[js.Any])
    
    inline def setSourceS3PathUndefined: Self = StObject.set(x, "SourceS3Path", js.undefined)
  }
}
