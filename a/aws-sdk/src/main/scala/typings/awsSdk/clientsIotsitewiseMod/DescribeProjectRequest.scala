package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectRequest extends StObject {
  
  /**
    * The ID of the project.
    */
  var projectId: ID
}
object DescribeProjectRequest {
  
  inline def apply(projectId: ID): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  
  extension [Self <: DescribeProjectRequest](x: Self) {
    
    inline def setProjectId(value: ID): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
