package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: Arn = js.native
  /**
    * The tags to associate. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  If you do not specify a value, the value is set to an empty string. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @
    */
  var Tags: typings.awsSdk.appstreamMod.Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: Arn, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  @scala.inline
  implicit class TagResourceRequestOps[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceArn(value: Arn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

