package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectRequest extends StObject {
  
  /**
    * The name of the project that you want to describe.
    */
  var ProjectName: typings.awsSdk.clientsLookoutvisionMod.ProjectName
}
object DescribeProjectRequest {
  
  inline def apply(ProjectName: ProjectName): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProjectRequest] (val x: Self) extends AnyVal {
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
