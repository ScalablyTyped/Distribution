package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstRange extends js.Object {
  var firstRange: Range = js.native
  var range: js.UndefOr[Range] = js.native
}

object FirstRange {
  @scala.inline
  def apply(firstRange: Range): FirstRange = {
    val __obj = js.Dynamic.literal(firstRange = firstRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstRange]
  }
  @scala.inline
  implicit class FirstRangeOps[Self <: FirstRange] (val x: Self) extends AnyVal {
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
    def setFirstRange(value: Range): Self = this.set("firstRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

