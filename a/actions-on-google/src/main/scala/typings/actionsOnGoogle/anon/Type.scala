package typings.actionsOnGoogle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type[TType] extends js.Object {
  var `@type`: TType
}

object Type {
  @scala.inline
  def apply[TType](`@type`: TType): Type[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[TType]]
  }
}

