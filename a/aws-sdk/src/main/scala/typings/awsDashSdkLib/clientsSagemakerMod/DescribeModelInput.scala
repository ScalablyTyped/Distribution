package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeModelInput extends js.Object {
  /**
    * The name of the model.
    */
  var ModelName: awsDashSdkLib.clientsSagemakerMod.ModelName
}

object DescribeModelInput {
  @scala.inline
  def apply(ModelName: ModelName): DescribeModelInput = {
    val __obj = js.Dynamic.literal(ModelName = ModelName)
  
    __obj.asInstanceOf[DescribeModelInput]
  }
}

