package typings.astDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmptyArray extends js.Object {
  def emptyArray(): js.Array[scala.Nothing]
  def `false`(): Boolean
  def `null`(): Null
  def `true`(): Boolean
  def undefined(): Unit
  def `use strict`(): String
}

object Anon_EmptyArray {
  @scala.inline
  def apply(
    emptyArray: () => js.Array[scala.Nothing],
    `false`: () => Boolean,
    `null`: () => Null,
    `true`: () => Boolean,
    undefined: () => Unit,
    `use strict`: () => String
  ): Anon_EmptyArray = {
    val __obj = js.Dynamic.literal(emptyArray = js.Any.fromFunction0(emptyArray), undefined = js.Any.fromFunction0(undefined))
    __obj.updateDynamic("false")(js.Any.fromFunction0(`false`))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.updateDynamic("true")(js.Any.fromFunction0(`true`))
    __obj.updateDynamic("use strict")(js.Any.fromFunction0(`use strict`))
    __obj.asInstanceOf[Anon_EmptyArray]
  }
}

