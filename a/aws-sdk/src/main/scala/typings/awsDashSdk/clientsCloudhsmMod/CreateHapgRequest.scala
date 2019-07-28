package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHapgRequest extends js.Object {
  /**
    * The label of the new high-availability partition group.
    */
  var Label: typings.awsDashSdk.clientsCloudhsmMod.Label
}

object CreateHapgRequest {
  @scala.inline
  def apply(Label: Label): CreateHapgRequest = {
    val __obj = js.Dynamic.literal(Label = Label)
  
    __obj.asInstanceOf[CreateHapgRequest]
  }
}

