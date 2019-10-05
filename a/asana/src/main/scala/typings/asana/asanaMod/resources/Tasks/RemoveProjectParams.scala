package typings.asana.asanaMod.resources.Tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveProjectParams extends js.Object {
  var project: String | Double
}

object RemoveProjectParams {
  @scala.inline
  def apply(project: String | Double): RemoveProjectParams = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveProjectParams]
  }
}

