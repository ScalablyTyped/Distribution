package typings.awsSdk.clientsIot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectResponse extends StObject {
  
  /**
    * An object describing the project.
    */
  var project: ProjectDescription
}
object DescribeProjectResponse {
  
  inline def apply(project: ProjectDescription): DescribeProjectResponse = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectResponse]
  }
  
  extension [Self <: DescribeProjectResponse](x: Self) {
    
    inline def setProject(value: ProjectDescription): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
