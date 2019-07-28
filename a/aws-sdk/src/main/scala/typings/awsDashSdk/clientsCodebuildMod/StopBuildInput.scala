package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopBuildInput extends js.Object {
  /**
    * The ID of the build.
    */
  var id: NonEmptyString
}

object StopBuildInput {
  @scala.inline
  def apply(id: NonEmptyString): StopBuildInput = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[StopBuildInput]
  }
}

