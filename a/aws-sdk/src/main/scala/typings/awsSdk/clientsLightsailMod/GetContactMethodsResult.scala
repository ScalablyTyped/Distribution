package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactMethodsResult extends StObject {
  
  /**
    * An array of objects that describe the contact methods.
    */
  var contactMethods: js.UndefOr[ContactMethodsList] = js.undefined
}
object GetContactMethodsResult {
  
  inline def apply(): GetContactMethodsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactMethodsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContactMethodsResult] (val x: Self) extends AnyVal {
    
    inline def setContactMethods(value: ContactMethodsList): Self = StObject.set(x, "contactMethods", value.asInstanceOf[js.Any])
    
    inline def setContactMethodsUndefined: Self = StObject.set(x, "contactMethods", js.undefined)
    
    inline def setContactMethodsVarargs(value: ContactMethod*): Self = StObject.set(x, "contactMethods", js.Array(value*))
  }
}
