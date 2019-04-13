package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopImageBuilderRequest extends js.Object {
  /**
    * The name of the image builder.
    */
  var Name: String
}

object StopImageBuilderRequest {
  @scala.inline
  def apply(Name: String): StopImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[StopImageBuilderRequest]
  }
}

