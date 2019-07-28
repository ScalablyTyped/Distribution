package typings.argv.argvMod

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
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (example != null) __obj.updateDynamic("example")(example)
    if (short != null) __obj.updateDynamic("short")(short)
    __obj.asInstanceOf[helpOption]
  }
}

