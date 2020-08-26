package typings.appendQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * whether or not to encode appended passed params using `encodeURIComponent`.
    * Default: `true`.
    */
  var encodeComponents: js.UndefOr[Boolean] = js.native
  /**
    * whether or not to remove params for `null` properties in the query object.
    * Default: `false` (properties will be preserved with no value).
    */
  var removeNull: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setEncodeComponents(value: Boolean): Self = this.set("encodeComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodeComponents: Self = this.set("encodeComponents", js.undefined)
    @scala.inline
    def setRemoveNull(value: Boolean): Self = this.set("removeNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveNull: Self = this.set("removeNull", js.undefined)
  }
  
}

