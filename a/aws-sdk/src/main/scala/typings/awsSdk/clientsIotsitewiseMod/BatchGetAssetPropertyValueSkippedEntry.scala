package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyValueSkippedEntry extends StObject {
  
  /**
    * The completion status of each entry that is associated with the BatchGetAssetPropertyValue request.
    */
  var completionStatus: BatchEntryCompletionStatus
  
  /**
    * The ID of the entry.
    */
  var entryId: EntryId
  
  /**
    * The error information, such as the error code and the timestamp.
    */
  var errorInfo: js.UndefOr[BatchGetAssetPropertyValueErrorInfo] = js.undefined
}
object BatchGetAssetPropertyValueSkippedEntry {
  
  inline def apply(completionStatus: BatchEntryCompletionStatus, entryId: EntryId): BatchGetAssetPropertyValueSkippedEntry = {
    val __obj = js.Dynamic.literal(completionStatus = completionStatus.asInstanceOf[js.Any], entryId = entryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyValueSkippedEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetAssetPropertyValueSkippedEntry] (val x: Self) extends AnyVal {
    
    inline def setCompletionStatus(value: BatchEntryCompletionStatus): Self = StObject.set(x, "completionStatus", value.asInstanceOf[js.Any])
    
    inline def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setErrorInfo(value: BatchGetAssetPropertyValueErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
  }
}
