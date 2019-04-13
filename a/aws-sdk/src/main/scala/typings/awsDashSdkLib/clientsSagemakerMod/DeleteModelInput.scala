package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteModelInput extends js.Object {
  /**
    * The name of the model to delete.
    */
  var ModelName: awsDashSdkLib.clientsSagemakerMod.ModelName
}

object DeleteModelInput {
  @scala.inline
  def apply(ModelName: ModelName): DeleteModelInput = {
    val __obj = js.Dynamic.literal(ModelName = ModelName)
  
    __obj.asInstanceOf[DeleteModelInput]
  }
}

