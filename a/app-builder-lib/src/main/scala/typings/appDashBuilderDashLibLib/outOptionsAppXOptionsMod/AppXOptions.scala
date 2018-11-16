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
}

