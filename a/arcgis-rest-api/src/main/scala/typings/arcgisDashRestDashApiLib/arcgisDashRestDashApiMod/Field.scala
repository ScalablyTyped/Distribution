package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var `type`: java.lang.String
}

object Field {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: java.lang.String,
    alias: java.lang.String = null,
    length: scala.Int | scala.Double = null
  ): Field = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

