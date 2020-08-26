package typings.autolinker.mentionMatchMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.autolinkerMod.MentionServices
import typings.autolinker.matchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MentionMatchConfig extends MatchConfig {
  var mention: String = js.native
  var serviceName: MentionServices = js.native
}

object MentionMatchConfig {
  @scala.inline
  def apply(
    matchedText: String,
    mention: String,
    offset: Double,
    serviceName: MentionServices,
    tagBuilder: AnchorTagBuilder
  ): MentionMatchConfig = {
    val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], mention = mention.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionMatchConfig]
  }
  @scala.inline
  implicit class MentionMatchConfigOps[Self <: MentionMatchConfig] (val x: Self) extends AnyVal {
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
    def setMention(value: String): Self = this.set("mention", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceName(value: MentionServices): Self = this.set("serviceName", value.asInstanceOf[js.Any])
  }
  
}

