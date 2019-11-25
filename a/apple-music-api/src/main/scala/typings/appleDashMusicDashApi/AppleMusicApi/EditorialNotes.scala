package typings.appleDashMusicDashApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/editorialnotes
trait EditorialNotes extends js.Object {
  var short: String
  var standard: String
}

object EditorialNotes {
  @scala.inline
  def apply(short: String, standard: String): EditorialNotes = {
    val __obj = js.Dynamic.literal(short = short.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorialNotes]
  }
}

