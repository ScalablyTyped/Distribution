package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSourceServersRequest extends StObject {
  
  /**
    * Application ID.
    */
  var applicationID: ApplicationID
  
  /**
    * Source server IDs list.
    */
  var sourceServerIDs: AssociateSourceServersRequestSourceServerIDs
}
object AssociateSourceServersRequest {
  
  inline def apply(applicationID: ApplicationID, sourceServerIDs: AssociateSourceServersRequestSourceServerIDs): AssociateSourceServersRequest = {
    val __obj = js.Dynamic.literal(applicationID = applicationID.asInstanceOf[js.Any], sourceServerIDs = sourceServerIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSourceServersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateSourceServersRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationID(value: ApplicationID): Self = StObject.set(x, "applicationID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDs(value: AssociateSourceServersRequestSourceServerIDs): Self = StObject.set(x, "sourceServerIDs", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDsVarargs(value: SourceServerID*): Self = StObject.set(x, "sourceServerIDs", js.Array(value*))
  }
}
