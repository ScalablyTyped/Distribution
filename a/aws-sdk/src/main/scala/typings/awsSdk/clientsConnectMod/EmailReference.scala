package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailReference extends StObject {
  
  /**
    * Identifier of the email reference.
    */
  var Name: js.UndefOr[ReferenceKey] = js.undefined
  
  /**
    * A valid email address.
    */
  var Value: js.UndefOr[ReferenceValue] = js.undefined
}
object EmailReference {
  
  inline def apply(): EmailReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailReference] (val x: Self) extends AnyVal {
    
    inline def setName(value: ReferenceKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: ReferenceValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
