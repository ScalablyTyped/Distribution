package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetOwnerInfo extends StObject {
  
  /**
    * Email address for the Dataset owner.
    */
  var email: js.UndefOr[Email] = js.undefined
  
  /**
    * The name of the Dataset owner.
    */
  var name: js.UndefOr[OwnerName] = js.undefined
  
  /**
    * Phone number for the Dataset owner.
    */
  var phoneNumber: js.UndefOr[PhoneNumber] = js.undefined
}
object DatasetOwnerInfo {
  
  inline def apply(): DatasetOwnerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetOwnerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetOwnerInfo] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: Email): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: OwnerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
