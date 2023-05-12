package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadSetListItem extends StObject {
  
  /**
    * The read set's ARN.
    */
  var arn: ReadSetArn
  
  /**
    * When the read set was created.
    */
  var creationTime: js.Date
  
  /**
    * The read set's description.
    */
  var description: js.UndefOr[ReadSetDescription] = js.undefined
  
  /**
    * The read set's file type.
    */
  var fileType: FileType
  
  /**
    * The read set's ID.
    */
  var id: ReadSetId
  
  /**
    * The read set's name.
    */
  var name: js.UndefOr[ReadSetName] = js.undefined
  
  /**
    * The read set's genome reference ARN.
    */
  var referenceArn: js.UndefOr[ReferenceArn] = js.undefined
  
  /**
    * The read set's sample ID.
    */
  var sampleId: js.UndefOr[SampleId] = js.undefined
  
  var sequenceInformation: js.UndefOr[SequenceInformation] = js.undefined
  
  /**
    * The read set's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    * The read set's status.
    */
  var status: ReadSetStatus
  
  /**
    *  The status for a read set. It provides more detail as to why the read set has a status. 
    */
  var statusMessage: js.UndefOr[ReadSetStatusMessage] = js.undefined
  
  /**
    * The read set's subject ID.
    */
  var subjectId: js.UndefOr[SubjectId] = js.undefined
}
object ReadSetListItem {
  
  inline def apply(
    arn: ReadSetArn,
    creationTime: js.Date,
    fileType: FileType,
    id: ReadSetId,
    sequenceStoreId: SequenceStoreId,
    status: ReadSetStatus
  ): ReadSetListItem = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadSetListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadSetListItem] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ReadSetArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ReadSetDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFileType(value: FileType): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setId(value: ReadSetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: ReadSetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferenceArn(value: ReferenceArn): Self = StObject.set(x, "referenceArn", value.asInstanceOf[js.Any])
    
    inline def setReferenceArnUndefined: Self = StObject.set(x, "referenceArn", js.undefined)
    
    inline def setSampleId(value: SampleId): Self = StObject.set(x, "sampleId", value.asInstanceOf[js.Any])
    
    inline def setSampleIdUndefined: Self = StObject.set(x, "sampleId", js.undefined)
    
    inline def setSequenceInformation(value: SequenceInformation): Self = StObject.set(x, "sequenceInformation", value.asInstanceOf[js.Any])
    
    inline def setSequenceInformationUndefined: Self = StObject.set(x, "sequenceInformation", js.undefined)
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReadSetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: ReadSetStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setSubjectId(value: SubjectId): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setSubjectIdUndefined: Self = StObject.set(x, "subjectId", js.undefined)
  }
}
