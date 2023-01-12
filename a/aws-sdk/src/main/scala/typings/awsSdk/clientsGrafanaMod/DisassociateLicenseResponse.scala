package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateLicenseResponse extends StObject {
  
  /**
    * A structure containing information about the workspace.
    */
  var workspace: WorkspaceDescription
}
object DisassociateLicenseResponse {
  
  inline def apply(workspace: WorkspaceDescription): DisassociateLicenseResponse = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLicenseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateLicenseResponse] (val x: Self) extends AnyVal {
    
    inline def setWorkspace(value: WorkspaceDescription): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
  }
}
