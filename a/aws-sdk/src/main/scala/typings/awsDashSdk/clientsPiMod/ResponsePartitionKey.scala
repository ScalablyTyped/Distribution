package typings.awsDashSdk.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePartitionKey extends js.Object {
  /**
    * A dimension map that contains the dimension(s) for this partition.
    */
  var Dimensions: DimensionMap
}

object ResponsePartitionKey {
  @scala.inline
  def apply(Dimensions: DimensionMap): ResponsePartitionKey = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions)
  
    __obj.asInstanceOf[ResponsePartitionKey]
  }
}

