package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGrantResponse extends StObject {
  
  /**
    * Grant details.
    */
  var Grant: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.Grant] = js.undefined
}
object GetGrantResponse {
  
  inline def apply(): GetGrantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGrantResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGrantResponse] (val x: Self) extends AnyVal {
    
    inline def setGrant(value: Grant): Self = StObject.set(x, "Grant", value.asInstanceOf[js.Any])
    
    inline def setGrantUndefined: Self = StObject.set(x, "Grant", js.undefined)
  }
}
