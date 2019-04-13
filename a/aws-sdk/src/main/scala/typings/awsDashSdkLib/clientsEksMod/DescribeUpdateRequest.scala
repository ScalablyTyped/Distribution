package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUpdateRequest extends js.Object {
  /**
    * The name of the Amazon EKS cluster to update.
    */
  var name: String
  /**
    * The ID of the update to describe.
    */
  var updateId: String
}

object DescribeUpdateRequest {
  @scala.inline
  def apply(name: String, updateId: String): DescribeUpdateRequest = {
    val __obj = js.Dynamic.literal(name = name, updateId = updateId)
  
    __obj.asInstanceOf[DescribeUpdateRequest]
  }
}

