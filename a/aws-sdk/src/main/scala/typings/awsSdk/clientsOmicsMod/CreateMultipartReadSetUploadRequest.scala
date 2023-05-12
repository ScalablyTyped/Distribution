package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultipartReadSetUploadRequest extends StObject {
  
  /**
    *  An idempotency token that can be used to avoid triggering multiple multipart uploads. 
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    *  The description of the read set. 
    */
  var description: js.UndefOr[ReadSetDescription] = js.undefined
  
  /**
    *  Where the source originated. 
    */
  var generatedFrom: js.UndefOr[GeneratedFrom] = js.undefined
  
  /**
    *  The name of the read set. 
    */
  var name: ReadSetName
  
  /**
    *  The ARN of the reference. 
    */
  var referenceArn: ReferenceArn
  
  /**
    *  The source's sample ID. 
    */
  var sampleId: SampleId
  
  /**
    *  The sequence store ID for the store that is the destination of the multipart uploads. 
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    *  The type of file being uploaded. 
    */
  var sourceFileType: FileType
  
  /**
    *  The source's subject ID. 
    */
  var subjectId: SubjectId
  
  /**
    *  Any tags to add to the read set. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateMultipartReadSetUploadRequest {
  
  inline def apply(
    name: ReadSetName,
    referenceArn: ReferenceArn,
    sampleId: SampleId,
    sequenceStoreId: SequenceStoreId,
    sourceFileType: FileType,
    subjectId: SubjectId
  ): CreateMultipartReadSetUploadRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceArn = referenceArn.asInstanceOf[js.Any], sampleId = sampleId.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], sourceFileType = sourceFileType.asInstanceOf[js.Any], subjectId = subjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultipartReadSetUploadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMultipartReadSetUploadRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: ReadSetDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGeneratedFrom(value: GeneratedFrom): Self = StObject.set(x, "generatedFrom", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFromUndefined: Self = StObject.set(x, "generatedFrom", js.undefined)
    
    inline def setName(value: ReadSetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReferenceArn(value: ReferenceArn): Self = StObject.set(x, "referenceArn", value.asInstanceOf[js.Any])
    
    inline def setSampleId(value: SampleId): Self = StObject.set(x, "sampleId", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setSourceFileType(value: FileType): Self = StObject.set(x, "sourceFileType", value.asInstanceOf[js.Any])
    
    inline def setSubjectId(value: SubjectId): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
