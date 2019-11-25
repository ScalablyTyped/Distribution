package typings.appDashBuilderDashLib.outOptionsAppXOptionsMod

import typings.appDashBuilderDashLib.outCoreMod.Publish
import typings.appDashBuilderDashLib.outCoreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppXOptions extends TargetSpecificOptions {
  /**
    * Whether to add auto launch extension. Defaults to `true` if [electron-winstore-auto-launch](https://github.com/felixrieseberg/electron-winstore-auto-launch) in the dependencies.
    */
  val addAutoLaunchExtension: js.UndefOr[Boolean] = js.undefined
  /**
    * The application id. Defaults to `identityName`. Can’t start with numbers.
    */
  val applicationId: js.UndefOr[String] = js.undefined
  /**
    * The background color of the app tile. See [Visual Elements](https://msdn.microsoft.com/en-us/library/windows/apps/br211471.aspx).
    * @default #464646
    */
  val backgroundColor: js.UndefOr[String | Null] = js.undefined
  /**
    * A friendly name that can be displayed to users. Corresponds to [Properties.DisplayName](https://msdn.microsoft.com/en-us/library/windows/apps/br211432.aspx).
    * Defaults to the application product name.
    */
  val displayName: js.UndefOr[String | Null] = js.undefined
  /**
    * @private
    * @default false
    */
  val electronUpdaterAware: js.UndefOr[Boolean] = js.undefined
  /**
    * The name. Corresponds to [Identity.Name](https://msdn.microsoft.com/en-us/library/windows/apps/br211441.aspx). Defaults to the [application name](/configuration/configuration#Metadata-name).
    */
  val identityName: js.UndefOr[String | Null] = js.undefined
  /**
    * The list of [supported languages](https://docs.microsoft.com/en-us/windows/uwp/globalizing/manage-language-and-region#specify-the-supported-languages-in-the-apps-manifest) that will be listed in the Windows Store.
    * The first entry (index 0) will be the default language.
    * Defaults to en-US if omitted.
    */
  val languages: js.UndefOr[js.Array[String] | String | Null] = js.undefined
  /** @private */
  val makeappxArgs: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * The Windows Store publisher. Not used if AppX is build for testing. See [AppX Package Code Signing](#appx-package-code-signing) below.
    */
  val publisher: js.UndefOr[String | Null] = js.undefined
  /**
    * A friendly name for the publisher that can be displayed to users. Corresponds to [Properties.PublisherDisplayName](https://msdn.microsoft.com/en-us/library/windows/apps/br211460.aspx).
    * Defaults to company name from the application metadata.
    */
  val publisherDisplayName: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to set build number. See https://github.com/electron-userland/electron-builder/issues/3875
    * @default false
    */
  val setBuildNumber: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to overlay the app's name on top of tile images on the Start screen. Defaults to `false`. (https://docs.microsoft.com/en-us/uwp/schemas/appxpackage/uapmanifestschema/element-uap-shownameontiles) in the dependencies.
    * @default false
    */
  val showNameOnTiles: js.UndefOr[Boolean] = js.undefined
}

object AppXOptions {
  @scala.inline
  def apply(
    addAutoLaunchExtension: js.UndefOr[Boolean] = js.undefined,
    applicationId: String = null,
    artifactName: String = null,
    backgroundColor: String = null,
    displayName: String = null,
    electronUpdaterAware: js.UndefOr[Boolean] = js.undefined,
    identityName: String = null,
    languages: js.Array[String] | String = null,
    makeappxArgs: js.Array[String] = null,
    publish: Publish = null,
    publisher: String = null,
    publisherDisplayName: String = null,
    setBuildNumber: js.UndefOr[Boolean] = js.undefined,
    showNameOnTiles: js.UndefOr[Boolean] = js.undefined
  ): AppXOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addAutoLaunchExtension)) __obj.updateDynamic("addAutoLaunchExtension")(addAutoLaunchExtension.asInstanceOf[js.Any])
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(electronUpdaterAware)) __obj.updateDynamic("electronUpdaterAware")(electronUpdaterAware.asInstanceOf[js.Any])
    if (identityName != null) __obj.updateDynamic("identityName")(identityName.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (makeappxArgs != null) __obj.updateDynamic("makeappxArgs")(makeappxArgs.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (publisherDisplayName != null) __obj.updateDynamic("publisherDisplayName")(publisherDisplayName.asInstanceOf[js.Any])
    if (!js.isUndefined(setBuildNumber)) __obj.updateDynamic("setBuildNumber")(setBuildNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(showNameOnTiles)) __obj.updateDynamic("showNameOnTiles")(showNameOnTiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppXOptions]
  }
}

