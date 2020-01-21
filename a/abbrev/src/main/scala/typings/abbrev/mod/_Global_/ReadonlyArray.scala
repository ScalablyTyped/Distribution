package typings.abbrev.mod._Global_

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyArray[T] extends js.Object {
  def abbrev(): StringDictionary[String]
}

object ReadonlyArray {
  @scala.inline
  def apply[T](abbrev: () => StringDictionary[String]): ReadonlyArray[T] = {
    val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
  
    __obj.asInstanceOf[ReadonlyArray[T]]
  }
}

