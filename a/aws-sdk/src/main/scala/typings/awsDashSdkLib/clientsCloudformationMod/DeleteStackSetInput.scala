package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStackSetInput extends js.Object {
  /**
    * The name or unique ID of the stack set that you're deleting. You can obtain this value by running ListStackSets.
    */
  var StackSetName: awsDashSdkLib.clientsCloudformationMod.StackSetName
}

object DeleteStackSetInput {
  @scala.inline
  def apply(StackSetName: StackSetName): DeleteStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName)
  
    __obj.asInstanceOf[DeleteStackSetInput]
  }
}

