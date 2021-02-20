package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumber extends StObject {
  
  /**
    * The phone number associations.
    */
  var Associations: js.UndefOr[PhoneNumberAssociationList] = js.native
  
  /**
    * The outbound calling name associated with the phone number.
    */
  var CallingName: js.UndefOr[typings.awsSdk.chimeMod.CallingName] = js.native
  
  /**
    * The outbound calling name status.
    */
  var CallingNameStatus: js.UndefOr[typings.awsSdk.chimeMod.CallingNameStatus] = js.native
  
  /**
    * The phone number capabilities.
    */
  var Capabilities: js.UndefOr[PhoneNumberCapabilities] = js.native
  
  /**
    * The phone number creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * The deleted phone number timestamp, in ISO 8601 format.
    */
  var DeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.E164PhoneNumber] = js.native
  
  /**
    * The phone number ID.
    */
  var PhoneNumberId: js.UndefOr[String] = js.native
  
  /**
    * The phone number product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
  
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[PhoneNumberStatus] = js.native
  
  /**
    * The phone number type.
    */
  var Type: js.UndefOr[PhoneNumberType] = js.native
  
  /**
    * The updated phone number timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
}
object PhoneNumber {
  
  @scala.inline
  def apply(): PhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumber]
  }
  
  @scala.inline
  implicit class PhoneNumberMutableBuilder[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: PhoneNumberAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    @scala.inline
    def setAssociationsVarargs(value: PhoneNumberAssociation*): Self = StObject.set(x, "Associations", js.Array(value :_*))
    
    @scala.inline
    def setCallingName(value: CallingName): Self = StObject.set(x, "CallingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallingNameStatus(value: CallingNameStatus): Self = StObject.set(x, "CallingNameStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallingNameStatusUndefined: Self = StObject.set(x, "CallingNameStatus", js.undefined)
    
    @scala.inline
    def setCallingNameUndefined: Self = StObject.set(x, "CallingName", js.undefined)
    
    @scala.inline
    def setCapabilities(value: PhoneNumberCapabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setDeletionTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "DeletionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTimestampUndefined: Self = StObject.set(x, "DeletionTimestamp", js.undefined)
    
    @scala.inline
    def setE164PhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "E164PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE164PhoneNumberUndefined: Self = StObject.set(x, "E164PhoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneNumberId(value: String): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
    
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
    
    @scala.inline
    def setStatus(value: PhoneNumberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setType(value: PhoneNumberType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
