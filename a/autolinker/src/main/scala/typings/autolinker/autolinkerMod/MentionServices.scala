package typings.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.autolinker.autolinkerStrings.twitter
  - typings.autolinker.autolinkerStrings.instagram
  - typings.autolinker.autolinkerStrings.soundcloud
*/
trait MentionServices extends js.Object

object MentionServices {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def instagram: typings.autolinker.autolinkerStrings.instagram = this.cast("instagram")
  @scala.inline
  def soundcloud: typings.autolinker.autolinkerStrings.soundcloud = this.cast("soundcloud")
  @scala.inline
  def twitter: typings.autolinker.autolinkerStrings.twitter = this.cast("twitter")
}

