package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultipartReadSetUploadResponse extends StObject {
  
  /**
    *  The creation time of the multipart upload. 
    */
  var creationTime: js.Date
  
  /**
    *  The description of the read set. 
    */
  var description: js.UndefOr[ReadSetDescription] = js.undefined
  
  /**
    *  The source of the read set. 
    */
  var generatedFrom: js.UndefOr[GeneratedFrom] = js.undefined
  
  /**
    *  The name of the read set. 
    */
  var name: js.UndefOr[ReadSetName] = js.undefined
  
  /**
    *  The read set source's reference ARN. 
    */
  var referenceArn: ReferenceArn
  
  /**
    *  The source's sample ID. 
    */
  var sampleId: SampleId
  
  /**
    *  The sequence store ID for the store that the read set will be created in. 
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    *  The file type of the read set source. 
    */
  var sourceFileType: FileType
  
  /**
    *  The source's subject ID. 
    */
  var subjectId: SubjectId
  
  /**
    *  The tags to add to the read set. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  he ID for the initiated multipart upload. 
    */
  var uploadId: UploadId
}
object CreateMultipartReadSetUploadResponse {
  
  inline def apply(
    creationTime: js.Date,
    referenceArn: ReferenceArn,
    sampleId: SampleId,
    sequenceStoreId: SequenceStoreId,
    sourceFileType: FileType,
    subjectId: SubjectId,
    uploadId: UploadId
  ): CreateMultipartReadSetUploadResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], referenceArn = referenceArn.asInstanceOf[js.Any], sampleId = sampleId.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], sourceFileType = sourceFileType.asInstanceOf[js.Any], subjectId = subjectId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultipartReadSetUploadResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMultipartReadSetUploadResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ReadSetDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGeneratedFrom(value: GeneratedFrom): Self = StObject.set(x, "generatedFrom", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFromUndefined: Self = StObject.set(x, "generatedFrom", js.undefined)
    
    inline def setName(value: ReadSetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferenceArn(value: ReferenceArn): Self = StObject.set(x, "referenceArn", value.asInstanceOf[js.Any])
    
    inline def setSampleId(value: SampleId): Self = StObject.set(x, "sampleId", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setSourceFileType(value: FileType): Self = StObject.set(x, "sourceFileType", value.asInstanceOf[js.Any])
    
    inline def setSubjectId(value: SubjectId): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
