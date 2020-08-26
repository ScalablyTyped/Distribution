package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/editorialnotes
@js.native
trait EditorialNotes extends js.Object {
  var short: String = js.native
  var standard: String = js.native
}

object EditorialNotes {
  @scala.inline
  def apply(short: String, standard: String): EditorialNotes = {
    val __obj = js.Dynamic.literal(short = short.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorialNotes]
  }
  @scala.inline
  implicit class EditorialNotesOps[Self <: EditorialNotes] (val x: Self) extends AnyVal {
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
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandard(value: String): Self = this.set("standard", value.asInstanceOf[js.Any])
  }
  
}

