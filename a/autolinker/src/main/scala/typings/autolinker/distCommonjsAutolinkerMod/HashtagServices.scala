package typings.autolinker.distCommonjsAutolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.autolinker.autolinkerStrings.twitter
  - typings.autolinker.autolinkerStrings.facebook
  - typings.autolinker.autolinkerStrings.instagram
*/
trait HashtagServices extends js.Object

object HashtagServices {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def facebook: typings.autolinker.autolinkerStrings.facebook = this.cast("facebook")
  @scala.inline
  def instagram: typings.autolinker.autolinkerStrings.instagram = this.cast("instagram")
  @scala.inline
  def twitter: typings.autolinker.autolinkerStrings.twitter = this.cast("twitter")
}

