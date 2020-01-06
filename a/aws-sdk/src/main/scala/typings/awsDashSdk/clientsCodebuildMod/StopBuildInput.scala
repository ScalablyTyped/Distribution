package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopBuildInput extends js.Object {
  /**
    * The ID of the build.
    */
  var id: NonEmptyString = js.native
}

object StopBuildInput {
  @scala.inline
  def apply(id: NonEmptyString): StopBuildInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopBuildInput]
  }
}

