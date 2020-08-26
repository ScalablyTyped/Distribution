package typings.amazonCognitoAuthJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentType extends js.Object {
  var `Content-Type`: String = js.native
}

object ContentType {
  @scala.inline
  def apply(`Content-Type`: String): ContentType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType]
  }
  @scala.inline
  implicit class ContentTypeOps[Self <: ContentType] (val x: Self) extends AnyVal {
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
    def `setContent-Type`(value: String): Self = this.set("Content-Type", value.asInstanceOf[js.Any])
  }
  
}

