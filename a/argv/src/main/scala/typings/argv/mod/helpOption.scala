package typings.argv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait helpOption extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var example: js.UndefOr[String] = js.undefined
  var name: String
  var short: js.UndefOr[String] = js.undefined
  var `type`: String
}

object helpOption {
  @scala.inline
  def apply(
    name: String,
    `type`: String,
    description: String = null,
    example: String = null,
    short: String = null
  ): helpOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[helpOption]
  }
}

