package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleRunConfiguration extends js.Object {
  /**
    * A list of Upload ARNs for app packages that will be installed alongside your app.
    */
  var auxiliaryApps: js.UndefOr[AmazonResourceNames] = js.undefined
  /**
    * Specifies the billing method for a test run: metered or unmetered. If the parameter is not specified, the default value is metered.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.undefined
  /**
    * Input CustomerArtifactPaths object for the scheduled run configuration.
    */
  var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.undefined
  /**
    * The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm will extract to external data for Android or the app's sandbox for iOS.
    */
  var extraDataPackageArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * Information about the locale that is used for the run.
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * Information about the location that is used for the run.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * Reserved for internal use.
    */
  var networkProfileArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * Information about the radio states for the run.
    */
  var radios: js.UndefOr[Radios] = js.undefined
  /**
    * An array of Amazon Resource Names (ARNs) for your VPC endpoint configurations.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.undefined
}

object ScheduleRunConfiguration {
  @scala.inline
  def apply(
    auxiliaryApps: AmazonResourceNames = null,
    billingMethod: BillingMethod = null,
    customerArtifactPaths: CustomerArtifactPaths = null,
    extraDataPackageArn: AmazonResourceName = null,
    locale: String = null,
    location: Location = null,
    networkProfileArn: AmazonResourceName = null,
    radios: Radios = null,
    vpceConfigurationArns: AmazonResourceNames = null
  ): ScheduleRunConfiguration = {
    val __obj = js.Dynamic.literal()
    if (auxiliaryApps != null) __obj.updateDynamic("auxiliaryApps")(auxiliaryApps)
    if (billingMethod != null) __obj.updateDynamic("billingMethod")(billingMethod.asInstanceOf[js.Any])
    if (customerArtifactPaths != null) __obj.updateDynamic("customerArtifactPaths")(customerArtifactPaths)
    if (extraDataPackageArn != null) __obj.updateDynamic("extraDataPackageArn")(extraDataPackageArn)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (location != null) __obj.updateDynamic("location")(location)
    if (networkProfileArn != null) __obj.updateDynamic("networkProfileArn")(networkProfileArn)
    if (radios != null) __obj.updateDynamic("radios")(radios)
    if (vpceConfigurationArns != null) __obj.updateDynamic("vpceConfigurationArns")(vpceConfigurationArns)
    __obj.asInstanceOf[ScheduleRunConfiguration]
  }
}

