package typings.awsSdk.anon

import typings.awsSdk.clientsOmicsMod.RunExport
import typings.awsSdk.clientsOmicsMod.RunExportList
import typings.awsSdk.clientsOmicsMod.RunId
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/omics.GetRunRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetRunRequestwaiterWaiter extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The run's export format.
    */
  var `export`: js.UndefOr[RunExportList] = js.undefined
  
  /**
    * The run's ID.
    */
  var id: RunId
}
object GetRunRequestwaiterWaiter {
  
  inline def apply(id: RunId): GetRunRequestwaiterWaiter = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRunRequestwaiterWaiter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRunRequestwaiterWaiter] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setExport(value: RunExportList): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExportVarargs(value: RunExport*): Self = StObject.set(x, "export", js.Array(value*))
    
    inline def setId(value: RunId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
