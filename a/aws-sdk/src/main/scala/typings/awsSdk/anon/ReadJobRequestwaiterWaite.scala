package typings.awsSdk.anon

import typings.awsSdk.clientsElastictranscoderMod.Id
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/elastictranscoder.ReadJobRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait ReadJobRequestwaiterWaite extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The identifier of the job for which you want to get detailed information.
    */
  var Id: typings.awsSdk.clientsElastictranscoderMod.Id
}
object ReadJobRequestwaiterWaite {
  
  inline def apply(Id: Id): ReadJobRequestwaiterWaite = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadJobRequestwaiterWaite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadJobRequestwaiterWaite] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
