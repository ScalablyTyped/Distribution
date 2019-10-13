package typings.antd

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_403 extends js.Object {
  def `403`(): Element
  def `404`(): Element
  def `500`(): Element
}

object Anon_403 {
  @scala.inline
  def apply(`403`: () => Element, `404`: () => Element, `500`: () => Element): Anon_403 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(js.Any.fromFunction0(`403`))
    __obj.updateDynamic("404")(js.Any.fromFunction0(`404`))
    __obj.updateDynamic("500")(js.Any.fromFunction0(`500`))
    __obj.asInstanceOf[Anon_403]
  }
}

