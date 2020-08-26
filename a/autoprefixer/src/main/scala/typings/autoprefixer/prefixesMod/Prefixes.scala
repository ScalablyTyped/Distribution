package typings.autoprefixer.prefixesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prefixes extends js.Object {
  var remove: StringDictionary[js.Any] = js.native
  def unprefixed(value: String): String = js.native
}

object Prefixes {
  @scala.inline
  def apply(remove: StringDictionary[js.Any], unprefixed: String => String): Prefixes = {
    val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any], unprefixed = js.Any.fromFunction1(unprefixed))
    __obj.asInstanceOf[Prefixes]
  }
  @scala.inline
  implicit class PrefixesOps[Self <: Prefixes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRemove(value: StringDictionary[js.Any]): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnprefixed(value: String => String): Self = this.set("unprefixed", js.Any.fromFunction1(value))
  }
  
}

