package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the project that was deleted.
    */
  var ProjectArn: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ProjectArn] = js.undefined
}
object DeleteProjectResponse {
  
  inline def apply(): DeleteProjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectResponse]
  }
  
  extension [Self <: DeleteProjectResponse](x: Self) {
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectArnUndefined: Self = StObject.set(x, "ProjectArn", js.undefined)
  }
}
