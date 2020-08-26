package typings.autolinker.hashtagMatchMod

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.matchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashtagMatchConfig extends MatchConfig {
  var hashtag: String = js.native
  var serviceName: String = js.native
}

object HashtagMatchConfig {
  @scala.inline
  def apply(
    hashtag: String,
    matchedText: String,
    offset: Double,
    serviceName: String,
    tagBuilder: AnchorTagBuilder
  ): HashtagMatchConfig = {
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashtagMatchConfig]
  }
  @scala.inline
  implicit class HashtagMatchConfigOps[Self <: HashtagMatchConfig] (val x: Self) extends AnyVal {
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
    def setHashtag(value: String): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
  }
  
}

