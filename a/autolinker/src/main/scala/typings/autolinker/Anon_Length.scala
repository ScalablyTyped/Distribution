package typings.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var location: js.UndefOr[String] = js.undefined
}

object Anon_Length {
  @scala.inline
  def apply(length: Int | Double = null, location: String = null): Anon_Length = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[Anon_Length]
  }
}

