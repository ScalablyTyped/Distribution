package typings.awsSdk.anon

import typings.awsSdk.clientsProtonMod.ResourceName
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/proton.GetServiceInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetServiceInputwaiterWait extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the service that you want to get the detailed data for.
    */
  var name: ResourceName
}
object GetServiceInputwaiterWait {
  
  inline def apply(name: ResourceName): GetServiceInputwaiterWait = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceInputwaiterWait]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceInputwaiterWait] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
