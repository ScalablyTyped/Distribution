package typings.appBuilderLib

import typings.appBuilderLib.coreMod.TargetSpecificOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appXOptionsMod {
  
  trait AppXOptions
    extends StObject
       with TargetSpecificOptions {
    
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
      * Relative path to custom extensions xml to be included in an `appmanifest.xml`.
      */
    val customExtensionsPath: js.UndefOr[String] = js.undefined
    
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
    def apply(): AppXOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppXOptions]
    }
    
    @scala.inline
    implicit class AppXOptionsMutableBuilder[Self <: AppXOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddAutoLaunchExtension(value: Boolean): Self = StObject.set(x, "addAutoLaunchExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddAutoLaunchExtensionUndefined: Self = StObject.set(x, "addAutoLaunchExtension", js.undefined)
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setCustomExtensionsPath(value: String): Self = StObject.set(x, "customExtensionsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomExtensionsPathUndefined: Self = StObject.set(x, "customExtensionsPath", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setElectronUpdaterAware(value: Boolean): Self = StObject.set(x, "electronUpdaterAware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronUpdaterAwareUndefined: Self = StObject.set(x, "electronUpdaterAware", js.undefined)
      
      @scala.inline
      def setIdentityName(value: String): Self = StObject.set(x, "identityName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityNameNull: Self = StObject.set(x, "identityName", null)
      
      @scala.inline
      def setIdentityNameUndefined: Self = StObject.set(x, "identityName", js.undefined)
      
      @scala.inline
      def setLanguages(value: js.Array[String] | String): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagesNull: Self = StObject.set(x, "languages", null)
      
      @scala.inline
      def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      @scala.inline
      def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
      
      @scala.inline
      def setMakeappxArgs(value: js.Array[String]): Self = StObject.set(x, "makeappxArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMakeappxArgsNull: Self = StObject.set(x, "makeappxArgs", null)
      
      @scala.inline
      def setMakeappxArgsUndefined: Self = StObject.set(x, "makeappxArgs", js.undefined)
      
      @scala.inline
      def setMakeappxArgsVarargs(value: String*): Self = StObject.set(x, "makeappxArgs", js.Array(value :_*))
      
      @scala.inline
      def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublisherDisplayName(value: String): Self = StObject.set(x, "publisherDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublisherDisplayNameNull: Self = StObject.set(x, "publisherDisplayName", null)
      
      @scala.inline
      def setPublisherDisplayNameUndefined: Self = StObject.set(x, "publisherDisplayName", js.undefined)
      
      @scala.inline
      def setPublisherNull: Self = StObject.set(x, "publisher", null)
      
      @scala.inline
      def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
      
      @scala.inline
      def setSetBuildNumber(value: Boolean): Self = StObject.set(x, "setBuildNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetBuildNumberUndefined: Self = StObject.set(x, "setBuildNumber", js.undefined)
      
      @scala.inline
      def setShowNameOnTiles(value: Boolean): Self = StObject.set(x, "showNameOnTiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNameOnTilesUndefined: Self = StObject.set(x, "showNameOnTiles", js.undefined)
    }
  }
}
