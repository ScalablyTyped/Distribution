package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThesaurusResponse extends StObject {
  
  /**
    * The Unix timestamp when the thesaurus was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The thesaurus description.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * When the Status field value is FAILED, the ErrorMessage field provides more information. 
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsKendraMod.ErrorMessage] = js.undefined
  
  /**
    * The size of the thesaurus file in bytes.
    */
  var FileSizeBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The identifier of the thesaurus.
    */
  var Id: js.UndefOr[ThesaurusId] = js.undefined
  
  /**
    * The identifier of the index for the thesaurus.
    */
  var IndexId: js.UndefOr[typings.awsSdk.clientsKendraMod.IndexId] = js.undefined
  
  /**
    * The thesaurus name.
    */
  var Name: js.UndefOr[ThesaurusName] = js.undefined
  
  /**
    * An IAM role that gives Amazon Kendra permissions to access thesaurus file specified in SourceS3Path. 
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
  
  var SourceS3Path: js.UndefOr[S3Path] = js.undefined
  
  /**
    * The current status of the thesaurus. When the value is ACTIVE, queries are able to use the thesaurus. If the Status field value is FAILED, the ErrorMessage field provides more information.  If the status is ACTIVE_BUT_UPDATE_FAILED, it means that Amazon Kendra could not ingest the new thesaurus file. The old thesaurus file is still active. 
    */
  var Status: js.UndefOr[ThesaurusStatus] = js.undefined
  
  /**
    * The number of synonym rules in the thesaurus file.
    */
  var SynonymRuleCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of unique terms in the thesaurus file. For example, the synonyms a,b,c and a=&gt;d, the term count would be 4. 
    */
  var TermCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The Unix timestamp when the thesaurus was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DescribeThesaurusResponse {
  
  inline def apply(): DescribeThesaurusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThesaurusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeThesaurusResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setFileSizeBytes(value: Long): Self = StObject.set(x, "FileSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setFileSizeBytesUndefined: Self = StObject.set(x, "FileSizeBytes", js.undefined)
    
    inline def setId(value: ThesaurusId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "IndexId", js.undefined)
    
    inline def setName(value: ThesaurusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSourceS3Path(value: S3Path): Self = StObject.set(x, "SourceS3Path", value.asInstanceOf[js.Any])
    
    inline def setSourceS3PathUndefined: Self = StObject.set(x, "SourceS3Path", js.undefined)
    
    inline def setStatus(value: ThesaurusStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSynonymRuleCount(value: Long): Self = StObject.set(x, "SynonymRuleCount", value.asInstanceOf[js.Any])
    
    inline def setSynonymRuleCountUndefined: Self = StObject.set(x, "SynonymRuleCount", js.undefined)
    
    inline def setTermCount(value: Long): Self = StObject.set(x, "TermCount", value.asInstanceOf[js.Any])
    
    inline def setTermCountUndefined: Self = StObject.set(x, "TermCount", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
