package typings.antd.mentionsMod

import typings.rcMentions.mentionsMod.MentionsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MentionProps extends MentionsProps {
  var loading: js.UndefOr[Boolean] = js.native
}

object MentionProps {
  @scala.inline
  def apply(): MentionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MentionProps]
  }
  @scala.inline
  implicit class MentionPropsOps[Self <: MentionProps] (val x: Self) extends AnyVal {
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
  }
  
}

