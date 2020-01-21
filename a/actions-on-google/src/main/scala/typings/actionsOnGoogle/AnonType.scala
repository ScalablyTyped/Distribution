package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType[TType] extends js.Object {
  var `@type`: TType
}

object AnonType {
  @scala.inline
  def apply[TType](`@type`: TType): AnonType[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[TType]]
  }
}

