package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * The configuration version.
    */
  var ConfigurationVersion: js.UndefOr[Version] = js.native
  /**
    * The content of the configuration or the configuration data.
    */
  var Content: js.UndefOr[_Blob] = js.native
  /**
    * A standard MIME type describing the format of the configuration content. For more information, see Content-Type.
    */
  var ContentType: js.UndefOr[String] = js.native
}

object Configuration {
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def setConfigurationVersion(value: Version): Self = this.set("ConfigurationVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationVersion: Self = this.set("ConfigurationVersion", js.undefined)
    @scala.inline
    def setContent(value: _Blob): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
  }
  
}

