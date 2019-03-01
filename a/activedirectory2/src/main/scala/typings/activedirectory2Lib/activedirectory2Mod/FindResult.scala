package typings
package activedirectory2Lib.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindResult extends js.Object {
  var groups: js.Array[js.Object]
  var other: js.Array[js.Object]
  var users: js.Array[js.Object]
}

object FindResult {
  @scala.inline
  def apply(groups: js.Array[js.Object], other: js.Array[js.Object], users: js.Array[js.Object]): FindResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("other")(other)
    __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[FindResult]
  }
}

