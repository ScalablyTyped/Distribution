package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipartReadSetUploadListItem extends StObject {
  
  /**
    *  The time stamp for when a direct upload was created. 
    */
  var creationTime: js.Date
  
  /**
    *  The description of a read set. 
    */
  var description: js.UndefOr[ReadSetDescription] = js.undefined
  
  /**
    *  The source of an uploaded part. 
    */
  var generatedFrom: GeneratedFrom
  
  /**
    *  The name of a read set. 
    */
  var name: js.UndefOr[ReadSetName] = js.undefined
  
  /**
    *  The source's reference ARN. 
    */
  var referenceArn: ReferenceArn
  
  /**
    *  The read set source's sample ID. 
    */
  var sampleId: SampleId
  
  /**
    *  The sequence store ID used for the multipart upload. 
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    *  The type of file the read set originated from. 
    */
  var sourceFileType: FileType
  
  /**
    *  The read set source's subject ID. 
    */
  var subjectId: SubjectId
  
  /**
    *  Any tags you wish to add to a read set. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  The ID for the initiated multipart upload. 
    */
  var uploadId: UploadId
}
object MultipartReadSetUploadListItem {
  
  inline def apply(
    creationTime: js.Date,
    generatedFrom: GeneratedFrom,
    referenceArn: ReferenceArn,
    sampleId: SampleId,
    sequenceStoreId: SequenceStoreId,
    sourceFileType: FileType,
    subjectId: SubjectId,
    uploadId: UploadId
  ): MultipartReadSetUploadListItem = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], generatedFrom = generatedFrom.asInstanceOf[js.Any], referenceArn = referenceArn.asInstanceOf[js.Any], sampleId = sampleId.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], sourceFileType = sourceFileType.asInstanceOf[js.Any], subjectId = subjectId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartReadSetUploadListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultipartReadSetUploadListItem] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ReadSetDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGeneratedFrom(value: GeneratedFrom): Self = StObject.set(x, "generatedFrom", value.asInstanceOf[js.Any])
    
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
