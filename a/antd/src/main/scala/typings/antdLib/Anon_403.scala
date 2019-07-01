package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_403 extends js.Object {
  def `403`(): reactLib.reactMod.Global.JSXNs.Element
  def `404`(): reactLib.reactMod.Global.JSXNs.Element
  def `500`(): reactLib.reactMod.Global.JSXNs.Element
}

object Anon_403 {
  @scala.inline
  def apply(
    `403`: () => reactLib.reactMod.Global.JSXNs.Element,
    `404`: () => reactLib.reactMod.Global.JSXNs.Element,
    `500`: () => reactLib.reactMod.Global.JSXNs.Element
  ): Anon_403 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(js.Any.fromFunction0(`403`))
    __obj.updateDynamic("404")(js.Any.fromFunction0(`404`))
    __obj.updateDynamic("500")(js.Any.fromFunction0(`500`))
    __obj.asInstanceOf[Anon_403]
  }
}

