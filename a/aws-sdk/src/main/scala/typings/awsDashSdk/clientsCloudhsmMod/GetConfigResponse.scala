package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigResponse extends js.Object {
  /**
    * The certificate file containing the server.pem files of the HSMs.
    */
  var ConfigCred: js.UndefOr[String] = js.undefined
  /**
    * The chrystoki.conf configuration file.
    */
  var ConfigFile: js.UndefOr[String] = js.undefined
  /**
    * The type of credentials.
    */
  var ConfigType: js.UndefOr[String] = js.undefined
}

object GetConfigResponse {
  @scala.inline
  def apply(ConfigCred: String = null, ConfigFile: String = null, ConfigType: String = null): GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigCred != null) __obj.updateDynamic("ConfigCred")(ConfigCred)
    if (ConfigFile != null) __obj.updateDynamic("ConfigFile")(ConfigFile)
    if (ConfigType != null) __obj.updateDynamic("ConfigType")(ConfigType)
    __obj.asInstanceOf[GetConfigResponse]
  }
}

