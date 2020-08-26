package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessCallingSettings extends js.Object {
  /**
    * The Amazon S3 bucket designated for call detail record storage.
    */
  var CdrBucket: js.UndefOr[String] = js.native
}

object BusinessCallingSettings {
  @scala.inline
  def apply(): BusinessCallingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessCallingSettings]
  }
  @scala.inline
  implicit class BusinessCallingSettingsOps[Self <: BusinessCallingSettings] (val x: Self) extends AnyVal {
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
    def setCdrBucket(value: String): Self = this.set("CdrBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdrBucket: Self = this.set("CdrBucket", js.undefined)
  }
  
}

