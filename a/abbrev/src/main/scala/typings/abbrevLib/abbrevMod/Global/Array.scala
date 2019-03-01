package typings
package abbrevLib.abbrevMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  def abbrev(): org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Array {
  @scala.inline
  def apply[T](abbrev: js.Function0[org.scalablytyped.runtime.StringDictionary[java.lang.String]]): Array[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abbrev")(abbrev)
    __obj.asInstanceOf[Array[T]]
  }
}

