package typings.awsSdk.anon

import typings.awsSdk.clientsGroundstationMod.Uuid
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/groundstation.DescribeContactRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeContactRequestwai extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * UUID of a contact.
    */
  var contactId: Uuid
}
object DescribeContactRequestwai {
  
  inline def apply(contactId: Uuid): DescribeContactRequestwai = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContactRequestwai]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeContactRequestwai] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setContactId(value: Uuid): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
  }
}
