package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportReferenceSourceItem extends StObject {
  
  /**
    * The source's description.
    */
  var description: js.UndefOr[ReferenceDescription] = js.undefined
  
  /**
    * The source's name.
    */
  var name: js.UndefOr[ReferenceName] = js.undefined
  
  /**
    * The source file's location in Amazon S3.
    */
  var sourceFile: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The source's status.
    */
  var status: ReferenceImportJobItemStatus
  
  /**
    * The source's status message.
    */
  var statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
  
  /**
    * The source's tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object ImportReferenceSourceItem {
  
  inline def apply(status: ReferenceImportJobItemStatus): ImportReferenceSourceItem = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportReferenceSourceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportReferenceSourceItem] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ReferenceDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ReferenceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSourceFile(value: S3Uri): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
    
    inline def setStatus(value: ReferenceImportJobItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: JobStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
