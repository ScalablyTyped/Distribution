package typings.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParseOptions extends js.Object {
  /** Recognize double-slash comments in addition to doc-block comments. */
  var alternateCommentMode: js.UndefOr[Boolean] = js.native
  /** Keeps field casing instead of converting to camel case */
  var keepCase: js.UndefOr[Boolean] = js.native
}

object IParseOptions {
  @scala.inline
  def apply(): IParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParseOptions]
  }
  @scala.inline
  implicit class IParseOptionsOps[Self <: IParseOptions] (val x: Self) extends AnyVal {
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
    def setAlternateCommentMode(value: Boolean): Self = this.set("alternateCommentMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateCommentMode: Self = this.set("alternateCommentMode", js.undefined)
    @scala.inline
    def setKeepCase(value: Boolean): Self = this.set("keepCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepCase: Self = this.set("keepCase", js.undefined)
  }
  
}

