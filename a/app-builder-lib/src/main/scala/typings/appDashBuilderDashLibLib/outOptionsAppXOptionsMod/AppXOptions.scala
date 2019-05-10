package typings
package appDashBuilderDashLibLib.outOptionsAppXOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppXOptions
  extends appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions {
  /**
    * Whether to add auto launch extension. Defaults to `true` if [electron-winstore-auto-launch](https://github.com/felixrieseberg/electron-winstore-auto-launch) in the dependencies.
    */
  val addAutoLaunchExtension: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The application id. Defaults to `identityName`. Can’t start with numbers.
    */
  val applicationId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The background color of the app tile. See [Visual Elements](https://msdn.microsoft.com/en-us/library/windows/apps/br211471.aspx).
    * @default #464646
    */
  val backgroundColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * A friendly name that can be displayed to users. Corresponds to [Properties.DisplayName](https://msdn.microsoft.com/en-us/library/windows/apps/br211432.aspx).
    * Defaults to the application product name.
    */
  val displayName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * @private
    * @default false
    */
  val electronUpdaterAware: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name. Corresponds to [Identity.Name](https://msdn.microsoft.com/en-us/library/windows/apps/br211441.aspx). Defaults to the [application name](/configuration/configuration#Metadata-name).
    */
  val identityName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The list of [supported languages](https://docs.microsoft.com/en-us/windows/uwp/globalizing/manage-language-and-region#specify-the-supported-languages-in-the-apps-manifest) that will be listed in the Windows Store.
    * The first entry (index 0) will be the default language.
    * Defaults to en-US if omitted.
    */
  val languages: js.UndefOr[js.Array[java.lang.String] | java.lang.String | scala.Null] = js.undefined
  /** @private */
  val makeappxArgs: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * The Windows Store publisher. Not used if AppX is build for testing. See [AppX Package Code Signing](#appx-package-code-signing) below.
    */
  val publisher: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * A friendly name for the publisher that can be displayed to users. Corresponds to [Properties.PublisherDisplayName](https://msdn.microsoft.com/en-us/library/windows/apps/br211460.aspx).
    * Defaults to company name from the application metadata.
    */
  val publisherDisplayName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to overlay the app's name on top of tile images on the Start screen. Defaults to `false`. (https://docs.microsoft.com/en-us/uwp/schemas/appxpackage/uapmanifestschema/element-uap-shownameontiles) in the dependencies.
    * @default false
    */
  val showNameOnTiles: js.UndefOr[scala.Boolean] = js.undefined
}

object AppXOptions {
  @scala.inline
  def apply(
    addAutoLaunchExtension: js.UndefOr[scala.Boolean] = js.undefined,
    applicationId: java.lang.String = null,
    artifactName: java.lang.String = null,
    backgroundColor: java.lang.String = null,
    displayName: java.lang.String = null,
    electronUpdaterAware: js.UndefOr[scala.Boolean] = js.undefined,
    identityName: java.lang.String = null,
    languages: js.Array[java.lang.String] | java.lang.String = null,
    makeappxArgs: js.Array[java.lang.String] = null,
    publish: builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish = null,
    publisher: java.lang.String = null,
    publisherDisplayName: java.lang.String = null,
    showNameOnTiles: js.UndefOr[scala.Boolean] = js.undefined
  ): AppXOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addAutoLaunchExtension)) __obj.updateDynamic("addAutoLaunchExtension")(addAutoLaunchExtension)
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId)
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(electronUpdaterAware)) __obj.updateDynamic("electronUpdaterAware")(electronUpdaterAware)
    if (identityName != null) __obj.updateDynamic("identityName")(identityName)
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (makeappxArgs != null) __obj.updateDynamic("makeappxArgs")(makeappxArgs)
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (publisherDisplayName != null) __obj.updateDynamic("publisherDisplayName")(publisherDisplayName)
    if (!js.isUndefined(showNameOnTiles)) __obj.updateDynamic("showNameOnTiles")(showNameOnTiles)
    __obj.asInstanceOf[AppXOptions]
  }
}

