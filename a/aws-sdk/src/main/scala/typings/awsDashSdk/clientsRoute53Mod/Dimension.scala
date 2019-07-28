package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  /**
    * For the metric that the CloudWatch alarm is associated with, the name of one dimension.
    */
  var Name: DimensionField
  /**
    * For the metric that the CloudWatch alarm is associated with, the value of one dimension.
    */
  var Value: DimensionField
}

object Dimension {
  @scala.inline
  def apply(Name: DimensionField, Value: DimensionField): Dimension = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[Dimension]
  }
}

