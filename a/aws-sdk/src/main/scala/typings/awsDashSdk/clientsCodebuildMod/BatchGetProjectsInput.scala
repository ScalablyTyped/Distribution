package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetProjectsInput extends js.Object {
  /**
    * The names of the build projects.
    */
  var names: ProjectNames
}

object BatchGetProjectsInput {
  @scala.inline
  def apply(names: ProjectNames): BatchGetProjectsInput = {
    val __obj = js.Dynamic.literal(names = names)
  
    __obj.asInstanceOf[BatchGetProjectsInput]
  }
}

