package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTargetGroupAttributesInput extends js.Object {
  /**
    * The attributes.
    */
  var Attributes: TargetGroupAttributes
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsDashSdk.clientsElbv2Mod.TargetGroupArn
}

object ModifyTargetGroupAttributesInput {
  @scala.inline
  def apply(Attributes: TargetGroupAttributes, TargetGroupArn: TargetGroupArn): ModifyTargetGroupAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, TargetGroupArn = TargetGroupArn)
  
    __obj.asInstanceOf[ModifyTargetGroupAttributesInput]
  }
}

