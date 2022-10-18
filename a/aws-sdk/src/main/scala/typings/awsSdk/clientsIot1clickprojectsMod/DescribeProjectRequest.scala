package typings.awsSdk.clientsIot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectRequest extends StObject {
  
  /**
    * The name of the project to be described.
    */
  var projectName: ProjectName
}
object DescribeProjectRequest {
  
  inline def apply(projectName: ProjectName): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  
  extension [Self <: DescribeProjectRequest](x: Self) {
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
