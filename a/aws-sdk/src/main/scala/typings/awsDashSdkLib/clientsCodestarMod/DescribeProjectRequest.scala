package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProjectRequest extends js.Object {
  /**
    * The ID of the project.
    */
  var id: ProjectId
}

object DescribeProjectRequest {
  @scala.inline
  def apply(id: ProjectId): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[DescribeProjectRequest]
  }
}

