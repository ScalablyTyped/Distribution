package typings
package argvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait helpOption extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var example: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var short: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object helpOption {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: java.lang.String,
    description: java.lang.String = null,
    example: java.lang.String = null,
    short: java.lang.String = null
  ): helpOption = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (example != null) __obj.updateDynamic("example")(example)
    if (short != null) __obj.updateDynamic("short")(short)
    __obj.asInstanceOf[helpOption]
  }
}

