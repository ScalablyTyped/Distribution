package typings.awsSdk.anon

import typings.awsSdk.clientsOmicsMod.ResourceId
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/omics.GetVariantImportRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetVariantImportRequestwa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The job's ID.
    */
  var jobId: ResourceId
}
object GetVariantImportRequestwa {
  
  inline def apply(jobId: ResourceId): GetVariantImportRequestwa = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVariantImportRequestwa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVariantImportRequestwa] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setJobId(value: ResourceId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
