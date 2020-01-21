package typings.asana.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Membership extends js.Object {
  var project: Resource
  var section: Resource | Null
}

object Membership {
  @scala.inline
  def apply(project: Resource, section: Resource = null): Membership = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[Membership]
  }
}

