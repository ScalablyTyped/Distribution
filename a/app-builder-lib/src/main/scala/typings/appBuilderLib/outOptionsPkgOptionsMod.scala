package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.none_
import typings.appBuilderLib.appBuilderLibStrings.update
import typings.appBuilderLib.appBuilderLibStrings.upgrade
import typings.appBuilderLib.outCoreMod.TargetSpecificOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outOptionsPkgOptionsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.appBuilderLib.appBuilderLibStrings.center
    - typings.appBuilderLib.appBuilderLibStrings.left
    - typings.appBuilderLib.appBuilderLibStrings.right
    - typings.appBuilderLib.appBuilderLibStrings.top
    - typings.appBuilderLib.appBuilderLibStrings.bottom
    - typings.appBuilderLib.appBuilderLibStrings.topleft
    - typings.appBuilderLib.appBuilderLibStrings.topright
    - typings.appBuilderLib.appBuilderLibStrings.bottomleft
    - typings.appBuilderLib.appBuilderLibStrings.bottomright
  */
  trait BackgroundAlignment extends StObject
  object BackgroundAlignment {
    
    inline def bottom: typings.appBuilderLib.appBuilderLibStrings.bottom = "bottom".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.bottom]
    
    inline def bottomleft: typings.appBuilderLib.appBuilderLibStrings.bottomleft = "bottomleft".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.bottomleft]
    
    inline def bottomright: typings.appBuilderLib.appBuilderLibStrings.bottomright = "bottomright".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.bottomright]
    
    inline def center: typings.appBuilderLib.appBuilderLibStrings.center = "center".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.center]
    
    inline def left: typings.appBuilderLib.appBuilderLibStrings.left = "left".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.left]
    
    inline def right: typings.appBuilderLib.appBuilderLibStrings.right = "right".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.right]
    
    inline def top: typings.appBuilderLib.appBuilderLibStrings.top = "top".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.top]
    
    inline def topleft: typings.appBuilderLib.appBuilderLibStrings.topleft = "topleft".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.topleft]
    
    inline def topright: typings.appBuilderLib.appBuilderLibStrings.topright = "topright".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.topright]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.appBuilderLib.appBuilderLibStrings.tofit
    - typings.appBuilderLib.appBuilderLibStrings.none_
    - typings.appBuilderLib.appBuilderLibStrings.proportional
  */
  trait BackgroundScaling extends StObject
  object BackgroundScaling {
    
    inline def none: none_ = "none".asInstanceOf[none_]
    
    inline def proportional: typings.appBuilderLib.appBuilderLibStrings.proportional = "proportional".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.proportional]
    
    inline def tofit: typings.appBuilderLib.appBuilderLibStrings.tofit = "tofit".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.tofit]
  }
  
  trait PkgBackgroundOptions extends StObject {
    
    /**
      * Alignment of the background image.
      * Options are: center, left, right, top, bottom, topleft, topright, bottomleft, bottomright
      * @default center
      */
    var alignment: js.UndefOr[BackgroundAlignment | Null] = js.undefined
    
    /**
      * Path to the image to use as an installer background.
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * Scaling of the background image.
      * Options are: tofit, none, proportional
      * @default tofit
      */
    var scaling: js.UndefOr[BackgroundScaling | Null] = js.undefined
  }
  object PkgBackgroundOptions {
    
    inline def apply(): PkgBackgroundOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PkgBackgroundOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PkgBackgroundOptions] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: BackgroundAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentNull: Self = StObject.set(x, "alignment", null)
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setScaling(value: BackgroundScaling): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
      
      inline def setScalingNull: Self = StObject.set(x, "scaling", null)
      
      inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    }
  }
  
  trait PkgOptions
    extends StObject
       with TargetSpecificOptions {
    
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
      * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt`, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
      */
    val license: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Identifies applications that must be closed before the package is installed.
      *
      * Corresponds to [must-close](https://developer.apple.com/library/archive/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW77).
      */
    val mustClose: js.UndefOr[js.Array[String] | Null] = js.undefined
    
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
    
    inline def apply(): PkgOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PkgOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PkgOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowAnywhere(value: Boolean): Self = StObject.set(x, "allowAnywhere", value.asInstanceOf[js.Any])
      
      inline def setAllowAnywhereNull: Self = StObject.set(x, "allowAnywhere", null)
      
      inline def setAllowAnywhereUndefined: Self = StObject.set(x, "allowAnywhere", js.undefined)
      
      inline def setAllowCurrentUserHome(value: Boolean): Self = StObject.set(x, "allowCurrentUserHome", value.asInstanceOf[js.Any])
      
      inline def setAllowCurrentUserHomeNull: Self = StObject.set(x, "allowCurrentUserHome", null)
      
      inline def setAllowCurrentUserHomeUndefined: Self = StObject.set(x, "allowCurrentUserHome", js.undefined)
      
      inline def setAllowRootDirectory(value: Boolean): Self = StObject.set(x, "allowRootDirectory", value.asInstanceOf[js.Any])
      
      inline def setAllowRootDirectoryNull: Self = StObject.set(x, "allowRootDirectory", null)
      
      inline def setAllowRootDirectoryUndefined: Self = StObject.set(x, "allowRootDirectory", js.undefined)
      
      inline def setBackground(value: PkgBackgroundOptions): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundNull: Self = StObject.set(x, "background", null)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
      
      inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
      
      inline def setConclusionUndefined: Self = StObject.set(x, "conclusion", js.undefined)
      
      inline def setHasStrictIdentifier(value: Boolean): Self = StObject.set(x, "hasStrictIdentifier", value.asInstanceOf[js.Any])
      
      inline def setHasStrictIdentifierNull: Self = StObject.set(x, "hasStrictIdentifier", null)
      
      inline def setHasStrictIdentifierUndefined: Self = StObject.set(x, "hasStrictIdentifier", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityNull: Self = StObject.set(x, "identity", null)
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setInstallLocation(value: String): Self = StObject.set(x, "installLocation", value.asInstanceOf[js.Any])
      
      inline def setInstallLocationNull: Self = StObject.set(x, "installLocation", null)
      
      inline def setInstallLocationUndefined: Self = StObject.set(x, "installLocation", js.undefined)
      
      inline def setIsRelocatable(value: Boolean): Self = StObject.set(x, "isRelocatable", value.asInstanceOf[js.Any])
      
      inline def setIsRelocatableNull: Self = StObject.set(x, "isRelocatable", null)
      
      inline def setIsRelocatableUndefined: Self = StObject.set(x, "isRelocatable", js.undefined)
      
      inline def setIsVersionChecked(value: Boolean): Self = StObject.set(x, "isVersionChecked", value.asInstanceOf[js.Any])
      
      inline def setIsVersionCheckedNull: Self = StObject.set(x, "isVersionChecked", null)
      
      inline def setIsVersionCheckedUndefined: Self = StObject.set(x, "isVersionChecked", js.undefined)
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseNull: Self = StObject.set(x, "license", null)
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setMustClose(value: js.Array[String]): Self = StObject.set(x, "mustClose", value.asInstanceOf[js.Any])
      
      inline def setMustCloseNull: Self = StObject.set(x, "mustClose", null)
      
      inline def setMustCloseUndefined: Self = StObject.set(x, "mustClose", js.undefined)
      
      inline def setMustCloseVarargs(value: String*): Self = StObject.set(x, "mustClose", js.Array(value*))
      
      inline def setOverwriteAction(value: upgrade | update): Self = StObject.set(x, "overwriteAction", value.asInstanceOf[js.Any])
      
      inline def setOverwriteActionNull: Self = StObject.set(x, "overwriteAction", null)
      
      inline def setOverwriteActionUndefined: Self = StObject.set(x, "overwriteAction", js.undefined)
      
      inline def setProductbuild(value: js.Array[String]): Self = StObject.set(x, "productbuild", value.asInstanceOf[js.Any])
      
      inline def setProductbuildNull: Self = StObject.set(x, "productbuild", null)
      
      inline def setProductbuildUndefined: Self = StObject.set(x, "productbuild", js.undefined)
      
      inline def setProductbuildVarargs(value: String*): Self = StObject.set(x, "productbuild", js.Array(value*))
      
      inline def setScripts(value: String): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsNull: Self = StObject.set(x, "scripts", null)
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setWelcome(value: String): Self = StObject.set(x, "welcome", value.asInstanceOf[js.Any])
      
      inline def setWelcomeNull: Self = StObject.set(x, "welcome", null)
      
      inline def setWelcomeUndefined: Self = StObject.set(x, "welcome", js.undefined)
    }
  }
}
