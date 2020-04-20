package typings.abbrev.mod._Global_

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  def abbrev(): StringDictionary[String]
}

object Object {
  @scala.inline
  def apply(abbrev: () => StringDictionary[String]): Object = {
    val __obj = js.Dynamic.literal(abbrev = js.Any.fromFunction0(abbrev))
    __obj.asInstanceOf[Object]
  }
}

