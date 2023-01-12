package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGroupMetadata extends StObject {
  
  /**
    * The date the billing group was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
}
object BillingGroupMetadata {
  
  inline def apply(): BillingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingGroupMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingGroupMetadata] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
  }
}
