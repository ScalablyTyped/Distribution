package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessControlAttribute extends StObject {
  
  /**
    * The name of the attribute associated with your identities in your identity source. This is used to map a specified attribute in your identity source with an attribute in IAM Identity Center.
    */
  var Key: AccessControlAttributeKey
  
  /**
    * The value used for mapping a specified attribute to an identity source.
    */
  var Value: AccessControlAttributeValue
}
object AccessControlAttribute {
  
  inline def apply(Key: AccessControlAttributeKey, Value: AccessControlAttributeValue): AccessControlAttribute = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessControlAttribute] (val x: Self) extends AnyVal {
    
    inline def setKey(value: AccessControlAttributeKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AccessControlAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
