package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  var contentDescription: String = js.native
  var sources: js.Array[ImageSource] = js.native
}

object Image {
  @scala.inline
  def apply(contentDescription: String, sources: js.Array[ImageSource]): Image = {
    val __obj = js.Dynamic.literal(contentDescription = contentDescription.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
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
    def setContentDescription(value: String): Self = this.set("contentDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: ImageSource*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[ImageSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
  }
  
}

