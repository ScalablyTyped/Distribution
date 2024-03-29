package typings.awsSdk.anon

import typings.awsSdk.clientsOmicsMod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/omics.GetVariantStoreRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetVariantStoreRequestwai extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The store's name.
    */
  var name: String
}
object GetVariantStoreRequestwai {
  
  inline def apply(name: String): GetVariantStoreRequestwai = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVariantStoreRequestwai]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVariantStoreRequestwai] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
