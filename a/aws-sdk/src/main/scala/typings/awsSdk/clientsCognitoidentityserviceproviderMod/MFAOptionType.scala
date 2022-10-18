package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MFAOptionType extends StObject {
  
  /**
    * The attribute name of the MFA option type. The only valid value is phone_number.
    */
  var AttributeName: js.UndefOr[AttributeNameType] = js.undefined
  
  /**
    * The delivery medium to send the MFA code. You can use this parameter to set only the SMS delivery medium value.
    */
  var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined
}
object MFAOptionType {
  
  inline def apply(): MFAOptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MFAOptionType]
  }
  
  extension [Self <: MFAOptionType](x: Self) {
    
    inline def setAttributeName(value: AttributeNameType): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setDeliveryMedium(value: DeliveryMediumType): Self = StObject.set(x, "DeliveryMedium", value.asInstanceOf[js.Any])
    
    inline def setDeliveryMediumUndefined: Self = StObject.set(x, "DeliveryMedium", js.undefined)
  }
}
