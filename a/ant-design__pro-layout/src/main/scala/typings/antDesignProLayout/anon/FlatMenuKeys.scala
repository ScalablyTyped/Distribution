package typings.antDesignProLayout.anon

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatMenuKeys extends js.Object {
  var flatMenuKeys: js.Array[String]
  var setFlatMenuKeys: Dispatch[SetStateAction[js.Array[String]]]
}

object FlatMenuKeys {
  @scala.inline
  def apply(flatMenuKeys: js.Array[String], setFlatMenuKeys: SetStateAction[js.Array[String]] => Unit): FlatMenuKeys = {
    val __obj = js.Dynamic.literal(flatMenuKeys = flatMenuKeys.asInstanceOf[js.Any], setFlatMenuKeys = js.Any.fromFunction1(setFlatMenuKeys))
    __obj.asInstanceOf[FlatMenuKeys]
  }
}

