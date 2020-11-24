package typings.appBuilderLib.pkgOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.update
import typings.appBuilderLib.appBuilderLibStrings.upgrade
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PkgOptions extends TargetSpecificOptions {
  
  /**
    * Whether can be installed at the root of any volume, including non-system volumes. Otherwise, it cannot be installed at the root of a volume.
    *
    * Corresponds to [enable_anywhere](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowAnywhere: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether can be installed into the current user’s home directory.
    * A home directory installation is done as the current user (not as root), and it cannot write outside of the home directory.
    * If the product cannot be installed in the user’s home directory and be not completely functional from user’s home directory.
    *
    * Corresponds to [enable_currentUserHome](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowCurrentUserHome: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Whether can be installed into the root directory. Should usually be `true` unless the product can be installed only to the user’s home directory.
    *
    * Corresponds to [enable_localSystem](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowRootDirectory: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Options for the background image for the installer.
    */
  val background: js.UndefOr[PkgBackgroundOptions | Null] = js.native
  
  /**
    * The path to the conclusion file. This may be used to customize the text on the final "Summary" page of the installer.
    */
  val conclusion: js.UndefOr[String | Null] = js.native
  
  /**
    * Require identical bundle identifiers at install path?
    * @default true
    */
  val hasStrictIdentifier: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * The name of certificate to use when signing. Consider using environment variables [CSC_LINK or CSC_NAME](/code-signing) instead of specifying this option.
    */
  val identity: js.UndefOr[String | Null] = js.native
  
  /**
    * The install location. [Do not use it](https://stackoverflow.com/questions/12863944/how-do-you-specify-a-default-install-location-to-home-with-pkgbuild) to create per-user package.
    * Mostly never you will need to change this option. `/Applications` would install it as expected into `/Applications` if the local system domain is chosen, or into `$HOME/Applications` if the home installation is chosen.
    * @default /Applications
    */
  val installLocation: js.UndefOr[String | Null] = js.native
  
  /**
    * Install bundle over previous version if moved by user?
    * @default true
    */
  val isRelocatable: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Don't install bundle if newer version on disk?
    * @default true
    */
  val isVersionChecked: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
    */
  val license: js.UndefOr[String | Null] = js.native
  
  /**
    * Identifies applications that must be closed before the package is installed.\n\nCorresponds to [must-close](https://developer.apple.com/library/archive/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW77)
    */
  val mustClose: js.UndefOr[js.Array[String] | Null] = js.native
  
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
  val overwriteAction: js.UndefOr[upgrade | update | Null] = js.native
  
  /**
    * should be not documented, only to experiment
    * @private
    */
  val productbuild: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * The scripts directory, relative to `build` (build resources directory).
    * The scripts can be in any language so long as the files are marked executable and have the appropriate shebang indicating the path to the interpreter.
    * Scripts are required to be executable (`chmod +x file`).
    * @default build/pkg-scripts
    * @see [Scripting in installer packages](http://macinstallers.blogspot.de/2012/07/scripting-in-installer-packages.html).
    */
  val scripts: js.UndefOr[String | Null] = js.native
  
  /**
    * The path to the welcome file. This may be used to customize the text on the Introduction page of the installer.
    */
  val welcome: js.UndefOr[String | Null] = js.native
}
object PkgOptions {
  
  @scala.inline
  def apply(): PkgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PkgOptions]
  }
  
  @scala.inline
  implicit class PkgOptionsOps[Self <: PkgOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowAnywhere(value: Boolean): Self = this.set("allowAnywhere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAnywhere: Self = this.set("allowAnywhere", js.undefined)
    
    @scala.inline
    def setAllowAnywhereNull: Self = this.set("allowAnywhere", null)
    
    @scala.inline
    def setAllowCurrentUserHome(value: Boolean): Self = this.set("allowCurrentUserHome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCurrentUserHome: Self = this.set("allowCurrentUserHome", js.undefined)
    
    @scala.inline
    def setAllowCurrentUserHomeNull: Self = this.set("allowCurrentUserHome", null)
    
    @scala.inline
    def setAllowRootDirectory(value: Boolean): Self = this.set("allowRootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRootDirectory: Self = this.set("allowRootDirectory", js.undefined)
    
    @scala.inline
    def setAllowRootDirectoryNull: Self = this.set("allowRootDirectory", null)
    
    @scala.inline
    def setBackground(value: PkgBackgroundOptions): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackgroundNull: Self = this.set("background", null)
    
    @scala.inline
    def setConclusion(value: String): Self = this.set("conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConclusion: Self = this.set("conclusion", js.undefined)
    
    @scala.inline
    def setConclusionNull: Self = this.set("conclusion", null)
    
    @scala.inline
    def setHasStrictIdentifier(value: Boolean): Self = this.set("hasStrictIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasStrictIdentifier: Self = this.set("hasStrictIdentifier", js.undefined)
    
    @scala.inline
    def setHasStrictIdentifierNull: Self = this.set("hasStrictIdentifier", null)
    
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setIdentityNull: Self = this.set("identity", null)
    
    @scala.inline
    def setInstallLocation(value: String): Self = this.set("installLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallLocation: Self = this.set("installLocation", js.undefined)
    
    @scala.inline
    def setInstallLocationNull: Self = this.set("installLocation", null)
    
    @scala.inline
    def setIsRelocatable(value: Boolean): Self = this.set("isRelocatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRelocatable: Self = this.set("isRelocatable", js.undefined)
    
    @scala.inline
    def setIsRelocatableNull: Self = this.set("isRelocatable", null)
    
    @scala.inline
    def setIsVersionChecked(value: Boolean): Self = this.set("isVersionChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVersionChecked: Self = this.set("isVersionChecked", js.undefined)
    
    @scala.inline
    def setIsVersionCheckedNull: Self = this.set("isVersionChecked", null)
    
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    
    @scala.inline
    def setLicenseNull: Self = this.set("license", null)
    
    @scala.inline
    def setMustCloseVarargs(value: String*): Self = this.set("mustClose", js.Array(value :_*))
    
    @scala.inline
    def setMustClose(value: js.Array[String]): Self = this.set("mustClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMustClose: Self = this.set("mustClose", js.undefined)
    
    @scala.inline
    def setMustCloseNull: Self = this.set("mustClose", null)
    
    @scala.inline
    def setOverwriteAction(value: upgrade | update): Self = this.set("overwriteAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwriteAction: Self = this.set("overwriteAction", js.undefined)
    
    @scala.inline
    def setOverwriteActionNull: Self = this.set("overwriteAction", null)
    
    @scala.inline
    def setProductbuildVarargs(value: String*): Self = this.set("productbuild", js.Array(value :_*))
    
    @scala.inline
    def setProductbuild(value: js.Array[String]): Self = this.set("productbuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductbuild: Self = this.set("productbuild", js.undefined)
    
    @scala.inline
    def setProductbuildNull: Self = this.set("productbuild", null)
    
    @scala.inline
    def setScripts(value: String): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    
    @scala.inline
    def setScriptsNull: Self = this.set("scripts", null)
    
    @scala.inline
    def setWelcome(value: String): Self = this.set("welcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWelcome: Self = this.set("welcome", js.undefined)
    
    @scala.inline
    def setWelcomeNull: Self = this.set("welcome", null)
  }
}
