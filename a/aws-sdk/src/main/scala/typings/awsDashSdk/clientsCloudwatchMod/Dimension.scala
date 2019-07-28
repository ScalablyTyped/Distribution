package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  /**
    * The name of the dimension.
    */
  var Name: DimensionName
  /**
    * The value representing the dimension measurement.
    */
  var Value: DimensionValue
}

object Dimension {
  @scala.inline
  def apply(Name: DimensionName, Value: DimensionValue): Dimension = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[Dimension]
  }
}

