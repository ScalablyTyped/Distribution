package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutAssetPropertyErrorEntry extends StObject {
  
  /**
    * The ID of the failed entry.
    */
  var entryId: EntryId
  
  /**
    * The list of update property value errors.
    */
  var errors: BatchPutAssetPropertyErrors
}
object BatchPutAssetPropertyErrorEntry {
  
  inline def apply(entryId: EntryId, errors: BatchPutAssetPropertyErrors): BatchPutAssetPropertyErrorEntry = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAssetPropertyErrorEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchPutAssetPropertyErrorEntry] (val x: Self) extends AnyVal {
    
    inline def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: BatchPutAssetPropertyErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchPutAssetPropertyError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
