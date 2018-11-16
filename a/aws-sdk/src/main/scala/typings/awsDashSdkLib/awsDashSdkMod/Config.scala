package typings
package awsDashSdkLib.awsDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "Config")
@js.native
class Config ()
  extends awsDashSdkLib.libCoreMod.Config {
  /**
       * Creates a new configuration object.
       * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
       */
  def this(options: awsDashSdkLib.libConfigMod.ConfigurationOptions with awsDashSdkLib.libConfigUnderscoreServiceUnderscorePlaceholdersMod.ConfigurationServicePlaceholders with awsDashSdkLib.libConfigMod.APIVersions) = this()
}

