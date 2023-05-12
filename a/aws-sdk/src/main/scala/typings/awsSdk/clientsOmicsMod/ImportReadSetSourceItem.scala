package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportReadSetSourceItem extends StObject {
  
  /**
    * The source's description.
    */
  var description: js.UndefOr[ReadSetDescription] = js.undefined
  
  /**
    * Where the source originated.
    */
  var generatedFrom: js.UndefOr[GeneratedFrom] = js.undefined
  
  /**
    * The source's name.
    */
  var name: js.UndefOr[ReadSetName] = js.undefined
  
  /**
    * The source's genome reference ARN.
    */
  var referenceArn: js.UndefOr[ReferenceArn] = js.undefined
  
  /**
    * The source's sample ID.
    */
  var sampleId: SampleId
  
  /**
    * The source's file type.
    */
  var sourceFileType: FileType
  
  /**
    * The source files' location in Amazon S3.
    */
  var sourceFiles: SourceFiles
  
  /**
    * The source's status.
    */
  var status: ReadSetImportJobItemStatus
  
  /**
    * The source's status message.
    */
  var statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
  
  /**
    * The source's subject ID.
    */
  var subjectId: SubjectId
  
  /**
    * The source's tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object ImportReadSetSourceItem {
  
  inline def apply(
    sampleId: SampleId,
    sourceFileType: FileType,
    sourceFiles: SourceFiles,
    status: ReadSetImportJobItemStatus,
    subjectId: SubjectId
  ): ImportReadSetSourceItem = {
    val __obj = js.Dynamic.literal(sampleId = sampleId.asInstanceOf[js.Any], sourceFileType = sourceFileType.asInstanceOf[js.Any], sourceFiles = sourceFiles.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subjectId = subjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportReadSetSourceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportReadSetSourceItem] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ReadSetDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGeneratedFrom(value: GeneratedFrom): Self = StObject.set(x, "generatedFrom", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFromUndefined: Self = StObject.set(x, "generatedFrom", js.undefined)
    
    inline def setName(value: ReadSetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferenceArn(value: ReferenceArn): Self = StObject.set(x, "referenceArn", value.asInstanceOf[js.Any])
    
    inline def setReferenceArnUndefined: Self = StObject.set(x, "referenceArn", js.undefined)
    
    inline def setSampleId(value: SampleId): Self = StObject.set(x, "sampleId", value.asInstanceOf[js.Any])
    
    inline def setSourceFileType(value: FileType): Self = StObject.set(x, "sourceFileType", value.asInstanceOf[js.Any])
    
    inline def setSourceFiles(value: SourceFiles): Self = StObject.set(x, "sourceFiles", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReadSetImportJobItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: JobStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setSubjectId(value: SubjectId): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
