package typings.algoliasearchHelper.mod.SearchForFacetValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hit extends js.Object {
  var count: Double = js.native
  var highlighted: String = js.native
  var isRefined: Boolean = js.native
  var value: String = js.native
}

object Hit {
  @scala.inline
  def apply(count: Double, highlighted: String, isRefined: Boolean, value: String): Hit = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit]
  }
  @scala.inline
  implicit class HitOps[Self <: Hit] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlighted(value: String): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRefined(value: Boolean): Self = this.set("isRefined", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

