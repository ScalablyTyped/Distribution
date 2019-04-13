package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProjectResponse extends js.Object {
  /**
    * An object describing the project.
    */
  var project: ProjectDescription
}

object DescribeProjectResponse {
  @scala.inline
  def apply(project: ProjectDescription): DescribeProjectResponse = {
    val __obj = js.Dynamic.literal(project = project)
  
    __obj.asInstanceOf[DescribeProjectResponse]
  }
}

