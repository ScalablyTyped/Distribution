package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProjectInput extends js.Object {
  /**
    * The name of the build project.
    */
  var name: NonEmptyString
}

object DeleteProjectInput {
  @scala.inline
  def apply(name: NonEmptyString): DeleteProjectInput = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[DeleteProjectInput]
  }
}

