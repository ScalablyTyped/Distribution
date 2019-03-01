package typings
package autolinkerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  var length: js.UndefOr[scala.Double] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Length {
  @scala.inline
  def apply(length: scala.Int | scala.Double = null, location: java.lang.String = null): Anon_Length = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[Anon_Length]
  }
}

