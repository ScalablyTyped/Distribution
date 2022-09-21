package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceStatus extends StObject {
  
  /**
    * Status code of this workspace.
    */
  var statusCode: WorkspaceStatusCode
}
object WorkspaceStatus {
  
  inline def apply(statusCode: WorkspaceStatusCode): WorkspaceStatus = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceStatus]
  }
  
  extension [Self <: WorkspaceStatus](x: Self) {
    
    inline def setStatusCode(value: WorkspaceStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
