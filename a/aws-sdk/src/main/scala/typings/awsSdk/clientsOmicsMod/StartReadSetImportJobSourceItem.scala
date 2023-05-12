package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReadSetImportJobSourceItem extends StObject {
  
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
    * The source's reference ARN.
    */
  var referenceArn: ReferenceArn
  
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
    * The source's subject ID.
    */
  var subjectId: SubjectId
  
  /**
    * The source's tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object StartReadSetImportJobSourceItem {
  
  inline def apply(
    referenceArn: ReferenceArn,
    sampleId: SampleId,
    sourceFileType: FileType,
    sourceFiles: SourceFiles,
    subjectId: SubjectId
  ): StartReadSetImportJobSourceItem = {
    val __obj = js.Dynamic.literal(referenceArn = referenceArn.asInstanceOf[js.Any], sampleId = sampleId.asInstanceOf[js.Any], sourceFileType = sourceFileType.asInstanceOf[js.Any], sourceFiles = sourceFiles.asInstanceOf[js.Any], subjectId = subjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReadSetImportJobSourceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReadSetImportJobSourceItem] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ReadSetDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGeneratedFrom(value: GeneratedFrom): Self = StObject.set(x, "generatedFrom", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFromUndefined: Self = StObject.set(x, "generatedFrom", js.undefined)
    
    inline def setName(value: ReadSetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferenceArn(value: ReferenceArn): Self = StObject.set(x, "referenceArn", value.asInstanceOf[js.Any])
    
    inline def setSampleId(value: SampleId): Self = StObject.set(x, "sampleId", value.asInstanceOf[js.Any])
    
    inline def setSourceFileType(value: FileType): Self = StObject.set(x, "sourceFileType", value.asInstanceOf[js.Any])
    
    inline def setSourceFiles(value: SourceFiles): Self = StObject.set(x, "sourceFiles", value.asInstanceOf[js.Any])
    
    inline def setSubjectId(value: SubjectId): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
