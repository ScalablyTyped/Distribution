package typings.atom.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var newValue: StringDictionary[js.Array[String]]
  var oldValue: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object `0` {
  @scala.inline
  def apply(newValue: StringDictionary[js.Array[String]], oldValue: StringDictionary[js.Array[String]] = null): `0` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

