package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Completion extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var meta: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var score: Double
  var value: String
}

object Completion {
  @scala.inline
  def apply(score: Double, value: String, caption: String = null, meta: String = null, name: String = null): Completion = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Completion]
  }
}

