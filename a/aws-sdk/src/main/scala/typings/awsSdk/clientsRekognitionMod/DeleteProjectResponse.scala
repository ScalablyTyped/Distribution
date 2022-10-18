package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectResponse extends StObject {
  
  /**
    * The current status of the delete project operation.
    */
  var Status: js.UndefOr[ProjectStatus] = js.undefined
}
object DeleteProjectResponse {
  
  inline def apply(): DeleteProjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectResponse]
  }
  
  extension [Self <: DeleteProjectResponse](x: Self) {
    
    inline def setStatus(value: ProjectStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
