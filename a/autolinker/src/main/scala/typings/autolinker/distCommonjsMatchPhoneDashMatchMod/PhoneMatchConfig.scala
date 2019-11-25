package typings.autolinker.distCommonjsMatchPhoneDashMatchMod

import typings.autolinker.distCommonjsAnchorDashTagDashBuilderMod.AnchorTagBuilder
import typings.autolinker.distCommonjsMatchMatchMod.MatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneMatchConfig extends MatchConfig {
  var number: String
  var plusSign: Boolean
}

object PhoneMatchConfig {
  @scala.inline
  def apply(
    matchedText: String,
    number: String,
    offset: Double,
    plusSign: Boolean,
    tagBuilder: AnchorTagBuilder
  ): PhoneMatchConfig = {
    val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], plusSign = plusSign.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhoneMatchConfig]
  }
}

