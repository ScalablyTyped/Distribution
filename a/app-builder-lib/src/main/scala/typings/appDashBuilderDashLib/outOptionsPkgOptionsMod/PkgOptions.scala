package typings.appDashBuilderDashLib.outOptionsPkgOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.update
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.upgrade
import typings.appDashBuilderDashLib.outCoreMod.Publish
import typings.appDashBuilderDashLib.outCoreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PkgOptions extends TargetSpecificOptions {
  /**
    * Whether can be installed at the root of any volume, including non-system volumes. Otherwise, it cannot be installed at the root of a volume.
    *
    * Corresponds to [enable_anywhere](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowAnywhere: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Whether can be installed into the current user’s home directory.
    * A home directory installation is done as the current user (not as root), and it cannot write outside of the home directory.
    * If the product cannot be installed in the user’s home directory and be not completely functional from user’s home directory.
    *
    * Corresponds to [enable_currentUserHome](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowCurrentUserHome: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Whether can be installed into the root directory. Should usually be `true` unless the product can be installed only to the user’s home directory.
    *
    * Corresponds to [enable_localSystem](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowRootDirectory: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Options for the background image for the installer.
    */
  val background: js.UndefOr[PkgBackgroundOptions | Null] = js.undefined
  /**
    * The path to the conclusion file. This may be used to customize the text on the final "Summary" page of the installer.
    */
  val conclusion: js.UndefOr[String | Null] = js.undefined
  /**
    * Require identical bundle identifiers at install path?
    * @default true
    */
  val hasStrictIdentifier: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * The name of certificate to use when signing. Consider using environment variables [CSC_LINK or CSC_NAME](/code-signing) instead of specifying this option.
    */
  val identity: js.UndefOr[String | Null] = js.undefined
  /**
    * The install location. [Do not use it](https://stackoverflow.com/questions/12863944/how-do-you-specify-a-default-install-location-to-home-with-pkgbuild) to create per-user package.
    * Mostly never you will need to change this option. `/Applications` would install it as expected into `/Applications` if the local system domain is chosen, or into `$HOME/Applications` if the home installation is chosen.
    * @default /Applications
    */
  val installLocation: js.UndefOr[String | Null] = js.undefined
  /**
    * Install bundle over previous version if moved by user?
    * @default true
    */
  val isRelocatable: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Don't install bundle if newer version on disk?
    * @default true
    */
  val isVersionChecked: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
    */
  val license: js.UndefOr[String | Null] = js.undefined
  /**
    * Specifies how an existing version of the bundle on disk should be handled when the version in
    * the package is installed.
    *
    * If you specify upgrade, the bundle in the package atomi-cally replaces any version on disk;
    * this has the effect of deleting old paths that no longer exist in the new version of
    * the bundle.
    *
    * If you specify update, the bundle in the package overwrites the version on disk, and any files
    * not contained in the package will be left intact; this is appropriate when you are delivering
    * an update-only package.
    *
    * Another effect of update is that the package bundle will not be installed at all if there is
    * not already a version on disk; this allows a package to deliver an update for an app that
    * the user might have deleted.
    *
    * @default upgrade
    */
  val overwriteAction: js.UndefOr[upgrade | update | Null] = js.undefined
  /**
    * should be not documented, only to experiment
    * @private
    */
  val productbuild: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * The scripts directory, relative to `build` (build resources directory).
    * The scripts can be in any language so long as the files are marked executable and have the appropriate shebang indicating the path to the interpreter.
    * Scripts are required to be executable (`chmod +x file`).
    * @default build/pkg-scripts
    * @see [Scripting in installer packages](http://macinstallers.blogspot.de/2012/07/scripting-in-installer-packages.html).
    */
  val scripts: js.UndefOr[String | Null] = js.undefined
  /**
    * The path to the welcome file. This may be used to customize the text on the Introduction page of the installer.
    */
  val welcome: js.UndefOr[String | Null] = js.undefined
}

object PkgOptions {
  @scala.inline
  def apply(
    allowAnywhere: js.UndefOr[Boolean] = js.undefined,
    allowCurrentUserHome: js.UndefOr[Boolean] = js.undefined,
    allowRootDirectory: js.UndefOr[Boolean] = js.undefined,
    artifactName: String = null,
    background: PkgBackgroundOptions = null,
    conclusion: String = null,
    hasStrictIdentifier: js.UndefOr[Boolean] = js.undefined,
    identity: String = null,
    installLocation: String = null,
    isRelocatable: js.UndefOr[Boolean] = js.undefined,
    isVersionChecked: js.UndefOr[Boolean] = js.undefined,
    license: String = null,
    overwriteAction: upgrade | update = null,
    productbuild: js.Array[String] = null,
    publish: Publish = null,
    scripts: String = null,
    welcome: String = null
  ): PkgOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnywhere)) __obj.updateDynamic("allowAnywhere")(allowAnywhere.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCurrentUserHome)) __obj.updateDynamic("allowCurrentUserHome")(allowCurrentUserHome.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRootDirectory)) __obj.updateDynamic("allowRootDirectory")(allowRootDirectory.asInstanceOf[js.Any])
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (conclusion != null) __obj.updateDynamic("conclusion")(conclusion.asInstanceOf[js.Any])
    if (!js.isUndefined(hasStrictIdentifier)) __obj.updateDynamic("hasStrictIdentifier")(hasStrictIdentifier.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (installLocation != null) __obj.updateDynamic("installLocation")(installLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(isRelocatable)) __obj.updateDynamic("isRelocatable")(isRelocatable.asInstanceOf[js.Any])
    if (!js.isUndefined(isVersionChecked)) __obj.updateDynamic("isVersionChecked")(isVersionChecked.asInstanceOf[js.Any])
    if (license != null) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (overwriteAction != null) __obj.updateDynamic("overwriteAction")(overwriteAction.asInstanceOf[js.Any])
    if (productbuild != null) __obj.updateDynamic("productbuild")(productbuild.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (welcome != null) __obj.updateDynamic("welcome")(welcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkgOptions]
  }
}

