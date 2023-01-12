package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeDeliveryDetailsType extends StObject {
  
  /**
    * The name of the attribute that Amazon Cognito verifies with the code.
    */
  var AttributeName: js.UndefOr[AttributeNameType] = js.undefined
  
  /**
    * The method that Amazon Cognito used to send the code.
    */
  var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined
  
  /**
    * The email address or phone number destination where Amazon Cognito sent the code.
    */
  var Destination: js.UndefOr[StringType] = js.undefined
}
object CodeDeliveryDetailsType {
  
  inline def apply(): CodeDeliveryDetailsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeDeliveryDetailsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeDeliveryDetailsType] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: AttributeNameType): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setDeliveryMedium(value: DeliveryMediumType): Self = StObject.set(x, "DeliveryMedium", value.asInstanceOf[js.Any])
    
    inline def setDeliveryMediumUndefined: Self = StObject.set(x, "DeliveryMedium", js.undefined)
    
    inline def setDestination(value: StringType): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
  }
}
