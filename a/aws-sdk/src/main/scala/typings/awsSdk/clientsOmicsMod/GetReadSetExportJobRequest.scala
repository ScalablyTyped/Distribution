package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadSetExportJobRequest extends StObject {
  
  /**
    * The job's ID.
    */
  var id: ExportJobId
  
  /**
    * The job's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
}
object GetReadSetExportJobRequest {
  
  inline def apply(id: ExportJobId, sequenceStoreId: SequenceStoreId): GetReadSetExportJobRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReadSetExportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReadSetExportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ExportJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
  }
}
