package typings.aureliaBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRaw extends js.Object {
  /**
    * The raw (unescaped) string parts of the template.
    * These are only retrieved and stored for tagged templates.
    */
  var raw: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonRaw {
  @scala.inline
  def apply(raw: js.Array[String] = null): AnonRaw = {
    val __obj = js.Dynamic.literal()
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRaw]
  }
}

