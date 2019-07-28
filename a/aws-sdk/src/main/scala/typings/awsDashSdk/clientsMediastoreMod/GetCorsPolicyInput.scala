package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCorsPolicyInput extends js.Object {
  /**
    * The name of the container that the policy is assigned to.
    */
  var ContainerName: typings.awsDashSdk.clientsMediastoreMod.ContainerName
}

object GetCorsPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): GetCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
  
    __obj.asInstanceOf[GetCorsPolicyInput]
  }
}

