package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectDataDeliveryResponse extends StObject {
  
  /**
    * A structure containing details about the project that you updated.
    */
  var project: Project
}
object UpdateProjectDataDeliveryResponse {
  
  inline def apply(project: Project): UpdateProjectDataDeliveryResponse = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectDataDeliveryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProjectDataDeliveryResponse] (val x: Self) extends AnyVal {
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
