package typings.aframe.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinglePropertySchema[T] extends js.Object {
  var default: js.UndefOr[T] = js.undefined
  var parse: js.UndefOr[js.Function1[/* value */ String, T]] = js.undefined
  var stringify: js.UndefOr[js.Function1[/* value */ T, String]] = js.undefined
  var `type`: js.UndefOr[PropertyTypes] = js.undefined
}

object SinglePropertySchema {
  @scala.inline
  def apply[T](
    default: T = null,
    parse: /* value */ String => T = null,
    stringify: /* value */ T => String = null,
    `type`: PropertyTypes = null
  ): SinglePropertySchema[T] = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1(parse))
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction1(stringify))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SinglePropertySchema[T]]
  }
}

