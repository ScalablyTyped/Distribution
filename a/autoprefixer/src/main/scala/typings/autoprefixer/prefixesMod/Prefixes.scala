package typings.autoprefixer.prefixesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefixes extends js.Object {
  var remove: StringDictionary[js.Any]
  def unprefixed(value: String): String
}

object Prefixes {
  @scala.inline
  def apply(remove: StringDictionary[js.Any], unprefixed: String => String): Prefixes = {
    val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any], unprefixed = js.Any.fromFunction1(unprefixed))
    __obj.asInstanceOf[Prefixes]
  }
}

