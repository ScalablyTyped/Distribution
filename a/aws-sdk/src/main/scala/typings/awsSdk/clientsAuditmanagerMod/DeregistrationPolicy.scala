package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregistrationPolicy extends StObject {
  
  /**
    * Specifies which Audit Manager data will be deleted when you deregister Audit Manager.   If you set the value to ALL, all of your data is deleted within seven days of deregistration.   If you set the value to DEFAULT, none of your data is deleted at the time of deregistration. However, keep in mind that the Audit Manager data retention policy still applies. As a result, any evidence data will be deleted two years after its creation date. Your other Audit Manager resources will continue to exist indefinitely.  
    */
  var deleteResources: js.UndefOr[DeleteResources] = js.undefined
}
object DeregistrationPolicy {
  
  inline def apply(): DeregistrationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregistrationPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregistrationPolicy] (val x: Self) extends AnyVal {
    
    inline def setDeleteResources(value: DeleteResources): Self = StObject.set(x, "deleteResources", value.asInstanceOf[js.Any])
    
    inline def setDeleteResourcesUndefined: Self = StObject.set(x, "deleteResources", js.undefined)
  }
}
