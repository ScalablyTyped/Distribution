package typings.autolinker.distCommonjsAutolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.autolinker.autolinkerBooleans.`false`
  - typings.autolinker.autolinkerStrings.twitter
  - typings.autolinker.autolinkerStrings.facebook
  - typings.autolinker.autolinkerStrings.instagram
*/
trait HashtagConfig extends js.Object

object HashtagConfig {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facebook: typings.autolinker.autolinkerStrings.facebook = this.cast("facebook")
  @scala.inline
  def `false`: typings.autolinker.autolinkerBooleans.`false` = this.cast(false)
  @scala.inline
  def instagram: typings.autolinker.autolinkerStrings.instagram = this.cast("instagram")
  @scala.inline
  def twitter: typings.autolinker.autolinkerStrings.twitter = this.cast("twitter")
}

