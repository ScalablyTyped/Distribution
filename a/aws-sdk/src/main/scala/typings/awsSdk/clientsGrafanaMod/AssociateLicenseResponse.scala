package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateLicenseResponse extends StObject {
  
  /**
    * A structure containing data about the workspace.
    */
  var workspace: WorkspaceDescription
}
object AssociateLicenseResponse {
  
  inline def apply(workspace: WorkspaceDescription): AssociateLicenseResponse = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLicenseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateLicenseResponse] (val x: Self) extends AnyVal {
    
    inline def setWorkspace(value: WorkspaceDescription): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
