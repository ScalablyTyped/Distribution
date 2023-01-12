package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWebhookInput extends StObject {
  
  /**
    * The name of the CodeBuild project.
    */
  var projectName: ProjectName
}
object DeleteWebhookInput {
  
  inline def apply(projectName: ProjectName): DeleteWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWebhookInput] (val x: Self) extends AnyVal {
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
