package typings.appBuilderLib.appXOptionsMod

import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppXOptions extends TargetSpecificOptions {
  /**
    * Whether to add auto launch extension. Defaults to `true` if [electron-winstore-auto-launch](https://github.com/felixrieseberg/electron-winstore-auto-launch) in the dependencies.
    */
  val addAutoLaunchExtension: js.UndefOr[Boolean] = js.native
  /**
    * The application id. Defaults to `identityName`. Can’t start with numbers.
    */
  val applicationId: js.UndefOr[String] = js.native
  /**
    * The background color of the app tile. See [Visual Elements](https://msdn.microsoft.com/en-us/library/windows/apps/br211471.aspx).
    * @default #464646
    */
  val backgroundColor: js.UndefOr[String | Null] = js.native
  /**
    * Relative path to custom extensions xml to be included in an `appmanifest.xml`.
    */
  val customExtensionsPath: js.UndefOr[String] = js.native
  /**
    * A friendly name that can be displayed to users. Corresponds to [Properties.DisplayName](https://msdn.microsoft.com/en-us/library/windows/apps/br211432.aspx).
    * Defaults to the application product name.
    */
  val displayName: js.UndefOr[String | Null] = js.native
  /**
    * @private
    * @default false
    */
  val electronUpdaterAware: js.UndefOr[Boolean] = js.native
  /**
    * The name. Corresponds to [Identity.Name](https://msdn.microsoft.com/en-us/library/windows/apps/br211441.aspx). Defaults to the [application name](/configuration/configuration#Metadata-name).
    */
  val identityName: js.UndefOr[String | Null] = js.native
  /**
    * The list of [supported languages](https://docs.microsoft.com/en-us/windows/uwp/globalizing/manage-language-and-region#specify-the-supported-languages-in-the-apps-manifest) that will be listed in the Windows Store.
    * The first entry (index 0) will be the default language.
    * Defaults to en-US if omitted.
    */
  val languages: js.UndefOr[js.Array[String] | String | Null] = js.native
  /** @private */
  val makeappxArgs: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * The Windows Store publisher. Not used if AppX is build for testing. See [AppX Package Code Signing](#appx-package-code-signing) below.
    */
  val publisher: js.UndefOr[String | Null] = js.native
  /**
    * A friendly name for the publisher that can be displayed to users. Corresponds to [Properties.PublisherDisplayName](https://msdn.microsoft.com/en-us/library/windows/apps/br211460.aspx).
    * Defaults to company name from the application metadata.
    */
  val publisherDisplayName: js.UndefOr[String | Null] = js.native
  /**
    * Whether to set build number. See https://github.com/electron-userland/electron-builder/issues/3875
    * @default false
    */
  val setBuildNumber: js.UndefOr[Boolean] = js.native
  /**
    * Whether to overlay the app's name on top of tile images on the Start screen. Defaults to `false`. (https://docs.microsoft.com/en-us/uwp/schemas/appxpackage/uapmanifestschema/element-uap-shownameontiles) in the dependencies.
    * @default false
    */
  val showNameOnTiles: js.UndefOr[Boolean] = js.native
}

object AppXOptions {
  @scala.inline
  def apply(): AppXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppXOptions]
  }
  @scala.inline
  implicit class AppXOptionsOps[Self <: AppXOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddAutoLaunchExtension(value: Boolean): Self = this.set("addAutoLaunchExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddAutoLaunchExtension: Self = this.set("addAutoLaunchExtension", js.undefined)
    @scala.inline
    def setApplicationId(value: String): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundColorNull: Self = this.set("backgroundColor", null)
    @scala.inline
    def setCustomExtensionsPath(value: String): Self = this.set("customExtensionsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomExtensionsPath: Self = this.set("customExtensionsPath", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    @scala.inline
    def setElectronUpdaterAware(value: Boolean): Self = this.set("electronUpdaterAware", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectronUpdaterAware: Self = this.set("electronUpdaterAware", js.undefined)
    @scala.inline
    def setIdentityName(value: String): Self = this.set("identityName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityName: Self = this.set("identityName", js.undefined)
    @scala.inline
    def setIdentityNameNull: Self = this.set("identityName", null)
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[String] | String): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    @scala.inline
    def setLanguagesNull: Self = this.set("languages", null)
    @scala.inline
    def setMakeappxArgsVarargs(value: String*): Self = this.set("makeappxArgs", js.Array(value :_*))
    @scala.inline
    def setMakeappxArgs(value: js.Array[String]): Self = this.set("makeappxArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMakeappxArgs: Self = this.set("makeappxArgs", js.undefined)
    @scala.inline
    def setMakeappxArgsNull: Self = this.set("makeappxArgs", null)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setPublisherNull: Self = this.set("publisher", null)
    @scala.inline
    def setPublisherDisplayName(value: String): Self = this.set("publisherDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherDisplayName: Self = this.set("publisherDisplayName", js.undefined)
    @scala.inline
    def setPublisherDisplayNameNull: Self = this.set("publisherDisplayName", null)
    @scala.inline
    def setSetBuildNumber(value: Boolean): Self = this.set("setBuildNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBuildNumber: Self = this.set("setBuildNumber", js.undefined)
    @scala.inline
    def setShowNameOnTiles(value: Boolean): Self = this.set("showNameOnTiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNameOnTiles: Self = this.set("showNameOnTiles", js.undefined)
  }
  
}

