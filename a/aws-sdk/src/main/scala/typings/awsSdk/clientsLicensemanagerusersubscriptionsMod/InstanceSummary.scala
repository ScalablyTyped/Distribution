package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceSummary extends StObject {
  
  /**
    * The ID of the EC2 instance, which provides user-based subscriptions.
    */
  var InstanceId: String
  
  /**
    * The date of the last status check.
    */
  var LastStatusCheckDate: js.UndefOr[String] = js.undefined
  
  /**
    * A list of provided user-based subscription products.
    */
  var Products: StringList
  
  /**
    * The status of an EC2 instance resource.
    */
  var Status: String
  
  /**
    * The status message for an EC2 instance.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object InstanceSummary {
  
  inline def apply(InstanceId: String, Products: StringList, Status: String): InstanceSummary = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Products = Products.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceSummary] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setLastStatusCheckDate(value: String): Self = StObject.set(x, "LastStatusCheckDate", value.asInstanceOf[js.Any])
    
    inline def setLastStatusCheckDateUndefined: Self = StObject.set(x, "LastStatusCheckDate", js.undefined)
    
    inline def setProducts(value: StringList): Self = StObject.set(x, "Products", value.asInstanceOf[js.Any])
    
    inline def setProductsVarargs(value: String*): Self = StObject.set(x, "Products", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
