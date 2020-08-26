package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageBuilderStreamingURLResult extends js.Object {
  /**
    * The elapsed time, in seconds after the Unix epoch, when this URL expires.
    */
  var Expires: js.UndefOr[Timestamp] = js.native
  /**
    * The URL to start the AppStream 2.0 streaming session.
    */
  var StreamingURL: js.UndefOr[String] = js.native
}

object CreateImageBuilderStreamingURLResult {
  @scala.inline
  def apply(): CreateImageBuilderStreamingURLResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageBuilderStreamingURLResult]
  }
  @scala.inline
  implicit class CreateImageBuilderStreamingURLResultOps[Self <: CreateImageBuilderStreamingURLResult] (val x: Self) extends AnyVal {
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
    def setExpires(value: Timestamp): Self = this.set("Expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("Expires", js.undefined)
    @scala.inline
    def setStreamingURL(value: String): Self = this.set("StreamingURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamingURL: Self = this.set("StreamingURL", js.undefined)
  }
  
}

