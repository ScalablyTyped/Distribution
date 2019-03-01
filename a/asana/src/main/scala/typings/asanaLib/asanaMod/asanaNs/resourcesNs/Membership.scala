package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Membership extends js.Object {
  var project: Resource
  var section: Resource
}

object Membership {
  @scala.inline
  def apply(project: Resource, section: Resource): Membership = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("section")(section)
    __obj.asInstanceOf[Membership]
  }
}

