package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  /**
    * End offset, exclusive
    */
  var end: js.UndefOr[Double] = js.undefined
  /**
    * Start offset, inslusive
    */
  var start: js.UndefOr[Double] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(end: Int | Double = null, start: Int | Double = null): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

