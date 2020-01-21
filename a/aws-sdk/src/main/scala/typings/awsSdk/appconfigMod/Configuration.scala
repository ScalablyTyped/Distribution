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
  def apply(ConfigurationVersion: Version = null, Content: _Blob = null, ContentType: String = null): Configuration = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationVersion != null) __obj.updateDynamic("ConfigurationVersion")(ConfigurationVersion.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

