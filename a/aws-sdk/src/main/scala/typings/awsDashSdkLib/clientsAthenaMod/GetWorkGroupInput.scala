package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkGroupInput extends js.Object {
  /**
    * The name of the workgroup.
    */
  var WorkGroup: WorkGroupName
}

object GetWorkGroupInput {
  @scala.inline
  def apply(WorkGroup: WorkGroupName): GetWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup)
  
    __obj.asInstanceOf[GetWorkGroupInput]
  }
}

