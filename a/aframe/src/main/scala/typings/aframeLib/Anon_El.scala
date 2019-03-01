package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_El extends js.Object {
  var el: stdLib.Element | this.type
}

object Anon_El {
  @scala.inline
  def apply(el: stdLib.Element | Anon_El): Anon_El = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_El]
  }
}

