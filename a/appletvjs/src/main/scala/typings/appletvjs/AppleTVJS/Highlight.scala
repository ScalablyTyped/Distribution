package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Highlight extends js.Object {
  /** The description of the highlight. */
  var description: String = js.native
  /** The duration of the highlight. */
  var duration: Double = js.native
  /** The imageURL of the highlight. */
  var imageURL: String = js.native
  /** The name of the highlight. */
  var name: String = js.native
  /** The starttime of the highlight. */
  var starttime: Double = js.native
}

object Highlight {
  @scala.inline
  def apply(description: String, duration: Double, imageURL: String, name: String, starttime: Double): Highlight = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], imageURL = imageURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
  @scala.inline
  implicit class HighlightOps[Self <: Highlight] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageURL(value: String): Self = this.set("imageURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarttime(value: Double): Self = this.set("starttime", value.asInstanceOf[js.Any])
  }
  
}

