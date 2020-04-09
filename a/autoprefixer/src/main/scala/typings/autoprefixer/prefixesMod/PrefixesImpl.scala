package typings.autoprefixer.prefixesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefixesImpl extends Prefixes

object PrefixesImpl {
  @scala.inline
  def apply(remove: StringDictionary[js.Any], unprefixed: String => String): PrefixesImpl = {
    val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any], unprefixed = js.Any.fromFunction1(unprefixed))
  
    __obj.asInstanceOf[PrefixesImpl]
  }
}

