package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var Description: String = js.native
  var LastModified: String = js.native
  var Name: String = js.native
  var PlayUrls: js.Array[String] = js.native
  var PublishUrls: js.Array[String] = js.native
  var Status: String = js.native
}

object Channel {
  @scala.inline
  def apply(
    Description: String,
    LastModified: String,
    Name: String,
    PlayUrls: js.Array[String],
    PublishUrls: js.Array[String],
    Status: String
  ): Channel = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], LastModified = LastModified.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlayUrls = PlayUrls.asInstanceOf[js.Any], PublishUrls = PublishUrls.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModified(value: String): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayUrlsVarargs(value: String*): Self = this.set("PlayUrls", js.Array(value :_*))
    @scala.inline
    def setPlayUrls(value: js.Array[String]): Self = this.set("PlayUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishUrlsVarargs(value: String*): Self = this.set("PublishUrls", js.Array(value :_*))
    @scala.inline
    def setPublishUrls(value: js.Array[String]): Self = this.set("PublishUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

