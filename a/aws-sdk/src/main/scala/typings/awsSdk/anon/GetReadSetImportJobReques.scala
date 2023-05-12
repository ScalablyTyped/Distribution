package typings.awsSdk.anon

import typings.awsSdk.clientsOmicsMod.ImportJobId
import typings.awsSdk.clientsOmicsMod.SequenceStoreId
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/omics.GetReadSetImportJobRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetReadSetImportJobReques extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The job's ID.
    */
  var id: ImportJobId
  
  /**
    * The job's sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
}
object GetReadSetImportJobReques {
  
  inline def apply(id: ImportJobId, sequenceStoreId: SequenceStoreId): GetReadSetImportJobReques = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReadSetImportJobReques]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReadSetImportJobReques] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setId(value: ImportJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
  }
}
