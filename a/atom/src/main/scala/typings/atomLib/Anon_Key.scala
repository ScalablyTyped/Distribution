package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var newValue: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var oldValue: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    newValue: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    oldValue: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newValue")(newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[Anon_Key]
  }
}

