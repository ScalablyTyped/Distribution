package typings
package atAngularCoreLib.srcRender3DiscoveryUnderscoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener extends js.Object {
  var element: stdLib.Element
  var name: java.lang.String
  var useCapture: scala.Boolean | scala.Null
  def callback(value: js.Any): js.Any
}

object Listener {
  @scala.inline
  def apply(
    callback: js.Any => js.Any,
    element: stdLib.Element,
    name: java.lang.String,
    useCapture: js.UndefOr[scala.Boolean] = js.undefined
  ): Listener = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), element = element, name = name)
    if (!js.isUndefined(useCapture)) __obj.updateDynamic("useCapture")(useCapture)
    __obj.asInstanceOf[Listener]
  }
}

