package typings.abbrev.mod._Global_

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  def abbrev(): StringDictionary[String]
}

object Array {
  @scala.inline
  def apply[T](abbrev: () => StringDictionary[String]): Array[T] = {
    val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
  
    __obj.asInstanceOf[Array[T]]
  }
}

