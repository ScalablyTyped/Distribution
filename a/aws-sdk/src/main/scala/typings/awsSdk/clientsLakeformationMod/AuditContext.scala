package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditContext extends StObject {
  
  /**
    * The filter engine can populate the 'AdditionalAuditContext' information with the request ID for you to track. This information will be displayed in CloudTrail log in your account.
    */
  var AdditionalAuditContext: js.UndefOr[AuditContextString] = js.undefined
}
object AuditContext {
  
  inline def apply(): AuditContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditContext] (val x: Self) extends AnyVal {
    
    inline def setAdditionalAuditContext(value: AuditContextString): Self = StObject.set(x, "AdditionalAuditContext", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuditContextUndefined: Self = StObject.set(x, "AdditionalAuditContext", js.undefined)
  }
}
