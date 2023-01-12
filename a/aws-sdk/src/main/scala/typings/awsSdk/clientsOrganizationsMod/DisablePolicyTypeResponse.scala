package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisablePolicyTypeResponse extends StObject {
  
  /**
    * A structure that shows the root with the updated list of enabled policy types.
    */
  var Root: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.Root] = js.undefined
}
object DisablePolicyTypeResponse {
  
  inline def apply(): DisablePolicyTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisablePolicyTypeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisablePolicyTypeResponse] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Root): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
  }
}
