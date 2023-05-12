package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberAssociation extends StObject {
  
  /**
    * The timestamp of the phone number association, in ISO 8601 format.
    */
  var AssociatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Defines the association with an Amazon Chime SDK account ID, user ID, Voice Connector ID, or Voice Connector group ID.
    */
  var Name: js.UndefOr[PhoneNumberAssociationName] = js.undefined
  
  /**
    * Contains the ID for the entity specified in Name.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object PhoneNumberAssociation {
  
  inline def apply(): PhoneNumberAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneNumberAssociation] (val x: Self) extends AnyVal {
    
    inline def setAssociatedTimestamp(value: js.Date): Self = StObject.set(x, "AssociatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setAssociatedTimestampUndefined: Self = StObject.set(x, "AssociatedTimestamp", js.undefined)
    
    inline def setName(value: PhoneNumberAssociationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
