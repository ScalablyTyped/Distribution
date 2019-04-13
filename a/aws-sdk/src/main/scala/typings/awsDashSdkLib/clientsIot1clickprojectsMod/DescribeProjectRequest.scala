package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProjectRequest extends js.Object {
  /**
    * The name of the project to be described.
    */
  var projectName: ProjectName
}

object DescribeProjectRequest {
  @scala.inline
  def apply(projectName: ProjectName): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName)
  
    __obj.asInstanceOf[DescribeProjectRequest]
  }
}

