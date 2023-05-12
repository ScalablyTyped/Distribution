package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateSourceServersRequest extends StObject {
  
  /**
    * Application ID.
    */
  var applicationID: ApplicationID
  
  /**
    * Source server IDs list.
    */
  var sourceServerIDs: DisassociateSourceServersRequestSourceServerIDs
}
object DisassociateSourceServersRequest {
  
  inline def apply(applicationID: ApplicationID, sourceServerIDs: DisassociateSourceServersRequestSourceServerIDs): DisassociateSourceServersRequest = {
    val __obj = js.Dynamic.literal(applicationID = applicationID.asInstanceOf[js.Any], sourceServerIDs = sourceServerIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSourceServersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateSourceServersRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationID(value: ApplicationID): Self = StObject.set(x, "applicationID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDs(value: DisassociateSourceServersRequestSourceServerIDs): Self = StObject.set(x, "sourceServerIDs", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDsVarargs(value: SourceServerID*): Self = StObject.set(x, "sourceServerIDs", js.Array(value*))
  }
}
