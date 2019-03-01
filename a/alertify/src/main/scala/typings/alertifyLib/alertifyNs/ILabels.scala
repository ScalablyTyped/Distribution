package typings
package alertifyLib.alertifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Labels for altertify.set function */
trait ILabels extends js.Object {
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var ok: js.UndefOr[java.lang.String] = js.undefined
}

object ILabels {
  @scala.inline
  def apply(cancel: java.lang.String = null, ok: java.lang.String = null): ILabels = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (ok != null) __obj.updateDynamic("ok")(ok)
    __obj.asInstanceOf[ILabels]
  }
}

