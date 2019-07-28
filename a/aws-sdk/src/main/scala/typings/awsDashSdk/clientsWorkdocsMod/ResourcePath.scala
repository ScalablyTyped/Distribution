package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcePath extends js.Object {
  /**
    * The components of the resource path.
    */
  var Components: js.UndefOr[ResourcePathComponentList] = js.undefined
}

object ResourcePath {
  @scala.inline
  def apply(Components: ResourcePathComponentList = null): ResourcePath = {
    val __obj = js.Dynamic.literal()
    if (Components != null) __obj.updateDynamic("Components")(Components)
    __obj.asInstanceOf[ResourcePath]
  }
}

