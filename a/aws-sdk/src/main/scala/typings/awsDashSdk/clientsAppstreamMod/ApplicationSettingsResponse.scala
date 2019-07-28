package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSettingsResponse extends js.Object {
  /**
    * Specifies whether persistent application settings are enabled for users during their streaming sessions.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The S3 bucket where users’ persistent application settings are stored. When persistent application settings are enabled for the first time for an account in an AWS Region, an S3 bucket is created. The bucket is unique to the AWS account and the Region. 
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  /**
    * The path prefix for the S3 bucket where users’ persistent application settings are stored.
    */
  var SettingsGroup: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.SettingsGroup] = js.undefined
}

object ApplicationSettingsResponse {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[Boolean] = js.undefined,
    S3BucketName: String = null,
    SettingsGroup: SettingsGroup = null
  ): ApplicationSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName)
    if (SettingsGroup != null) __obj.updateDynamic("SettingsGroup")(SettingsGroup)
    __obj.asInstanceOf[ApplicationSettingsResponse]
  }
}

