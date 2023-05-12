package typings.awsSdk.anon

import typings.awsSdk.clientsOmicsMod.ImportJobId
import typings.awsSdk.clientsOmicsMod.ReferenceStoreId
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/omics.GetReferenceImportJobRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetReferenceImportJobRequ extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The job's ID.
    */
  var id: ImportJobId
  
  /**
    * The job's reference store ID.
    */
  var referenceStoreId: ReferenceStoreId
}
object GetReferenceImportJobRequ {
  
  inline def apply(id: ImportJobId, referenceStoreId: ReferenceStoreId): GetReferenceImportJobRequ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referenceStoreId = referenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReferenceImportJobRequ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReferenceImportJobRequ] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setId(value: ImportJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReferenceStoreId(value: ReferenceStoreId): Self = StObject.set(x, "referenceStoreId", value.asInstanceOf[js.Any])
  }
}
