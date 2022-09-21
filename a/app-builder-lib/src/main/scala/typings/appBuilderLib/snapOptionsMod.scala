package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.appBuilderLibStrings.classic
import typings.appBuilderLib.appBuilderLibStrings.devel
import typings.appBuilderLib.appBuilderLibStrings.devmode
import typings.appBuilderLib.appBuilderLibStrings.lzo
import typings.appBuilderLib.appBuilderLibStrings.stable
import typings.appBuilderLib.appBuilderLibStrings.strict
import typings.appBuilderLib.appBuilderLibStrings.xz
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import typings.appBuilderLib.linuxOptionsMod.CommonLinuxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapOptionsMod {
  
  type PlugDescriptor = StringDictionary[StringDictionary[Any] | Null]
  
  type SlotDescriptor = StringDictionary[StringDictionary[Any] | Null]
  
  trait SnapOptions
    extends StObject
       with CommonLinuxOptions
       with TargetSpecificOptions {
    
    /**
      * Specifies any [parts](https://snapcraft.io/docs/reference/parts) that should be built before this part.
      * Defaults to `["desktop-gtk2""]`.
      *
      * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom parts `foo` in addition to defaults.
      */
    val after: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * Allow running the program with native wayland support with --ozone-platform=wayland.
      * Disabled by default because of this issue in older Electron/Snap versions: https://github.com/electron-userland/electron-builder/issues/4007
      */
    val allowNativeWayland: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Specifies which files from the app part to stage and which to exclude. Individual files, directories, wildcards, globstars, and exclusions are accepted. See [Snapcraft filesets](https://snapcraft.io/docs/snapcraft-filesets) to learn more about the format.
      *
      * The defaults can be found in [snap.ts](https://github.com/electron-userland/electron-builder/blob/master/packages/app-builder-lib/templates/snap/snapcraft.yaml#L29).
      */
    val appPartStage: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * The list of features that must be supported by the core in order for this snap to install.
      */
    val assumes: js.UndefOr[js.Array[String] | String | Null] = js.undefined
    
    /**
      * Whether or not the snap should automatically start on login.
      * @default false
      */
    val autoStart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The list of debian packages needs to be installed for building this snap.
      */
    val buildPackages: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * Sets the compression type for the snap. Can be xz, lzo, or null.
      */
    val compression: js.UndefOr[xz | lzo | Null] = js.undefined
    
    /**
      * The type of [confinement](https://snapcraft.io/docs/reference/confinement) supported by the snap.
      * @default strict
      */
    val confinement: js.UndefOr[devmode | strict | classic | Null] = js.undefined
    
    /**
      * The custom environment. Defaults to `{"TMPDIR: "$XDG_RUNTIME_DIR"}`. If you set custom, it will be merged with default.
      */
    val environment: js.UndefOr[StringDictionary[String] | Null] = js.undefined
    
    /**
      * The quality grade of the snap. It can be either `devel` (i.e. a development version of the snap, so not to be published to the “stable” or “candidate” channels) or “stable” (i.e. a stable release or release candidate, which can be released to all channels).
      * @default stable
      */
    val grade: js.UndefOr[devel | stable | Null] = js.undefined
    
    /**
      * The [hooks](https://docs.snapcraft.io/build-snaps/hooks) directory, relative to `build` (build resources directory).
      * @default build/snap-hooks
      */
    val hooks: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Specifies any files to make accessible from locations such as `/usr`, `/var`, and `/etc`. See [snap layouts](https://snapcraft.io/docs/snap-layouts) to learn more.
      */
    val layout: js.UndefOr[StringDictionary[StringDictionary[String]] | Null] = js.undefined
    
    /**
      * The list of [plugs](https://snapcraft.io/docs/reference/interfaces).
      * Defaults to `["desktop", "desktop-legacy", "home", "x11", "wayland", "unity7", "browser-support", "network", "gsettings", "audio-playback", "pulseaudio", "opengl"]`.
      *
      * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom plug `foo` in addition to defaults.
      *
      * Additional attributes can be specified using object instead of just name of plug:
      * ```
      *[
      *  {
      *    "browser-sandbox": {
      *      "interface": "browser-support",
      *      "allow-sandbox": true
      *    },
      *  },
      *  "another-simple-plug-name"
      *]
      * ```
      */
    val plugs: js.UndefOr[(js.Array[String | PlugDescriptor]) | PlugDescriptor | Null] = js.undefined
    
    /**
      * The list of [slots](https://snapcraft.io/docs/reference/interfaces).
      *
      * Additional attributes can be specified using object instead of just name of slot:
      * ```
      *[
      *  {
      *    "mpris": {
      *      "name": "chromium"
      *    },
      *  }
      *]
      *
      * In case you want your application to be a compliant MPris player, you will need to definie
      * The mpris slot with "chromium" name.
      * This electron has it [hardcoded](https://source.chromium.org/chromium/chromium/src/+/master:components/system_media_controls/linux/system_media_controls_linux.cc;l=51;bpv=0;bpt=1),
      * and we need to pass this name so snap [will allow it](https://forum.snapcraft.io/t/unable-to-use-mpris-interface/15360/7) in strict confinement.
      *
      */
    val slots: js.UndefOr[(js.Array[String | SlotDescriptor]) | PlugDescriptor | Null] = js.undefined
    
    /**
      * The list of Ubuntu packages to use that are needed to support the `app` part creation. Like `depends` for `deb`.
      * Defaults to `["libnspr4", "libnss3", "libxss1", "libappindicator3-1", "libsecret-1-0"]`.
      *
      * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom package `foo` in addition to defaults.
      */
    val stagePackages: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * The 78 character long summary. Defaults to [productName](/configuration/configuration#Configuration-productName).
      */
    val summary: js.UndefOr[String | Null] = js.undefined
    
    /**
      * An optional title for the snap, may contain uppercase letters and spaces. Defaults to `productName`. See [snap format documentation](https://snapcraft.io/docs/snap-format).
      */
    val title: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether to use template snap. Defaults to `true` if `stagePackages` not specified.
      */
    val useTemplateApp: js.UndefOr[Boolean] = js.undefined
  }
  object SnapOptions {
    
    inline def apply(): SnapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapOptions]
    }
    
    extension [Self <: SnapOptions](x: Self) {
      
      inline def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterNull: Self = StObject.set(x, "after", null)
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setAllowNativeWayland(value: Boolean): Self = StObject.set(x, "allowNativeWayland", value.asInstanceOf[js.Any])
      
      inline def setAllowNativeWaylandNull: Self = StObject.set(x, "allowNativeWayland", null)
      
      inline def setAllowNativeWaylandUndefined: Self = StObject.set(x, "allowNativeWayland", js.undefined)
      
      inline def setAppPartStage(value: js.Array[String]): Self = StObject.set(x, "appPartStage", value.asInstanceOf[js.Any])
      
      inline def setAppPartStageNull: Self = StObject.set(x, "appPartStage", null)
      
      inline def setAppPartStageUndefined: Self = StObject.set(x, "appPartStage", js.undefined)
      
      inline def setAppPartStageVarargs(value: String*): Self = StObject.set(x, "appPartStage", js.Array(value*))
      
      inline def setAssumes(value: js.Array[String] | String): Self = StObject.set(x, "assumes", value.asInstanceOf[js.Any])
      
      inline def setAssumesNull: Self = StObject.set(x, "assumes", null)
      
      inline def setAssumesUndefined: Self = StObject.set(x, "assumes", js.undefined)
      
      inline def setAssumesVarargs(value: String*): Self = StObject.set(x, "assumes", js.Array(value*))
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setBuildPackages(value: js.Array[String]): Self = StObject.set(x, "buildPackages", value.asInstanceOf[js.Any])
      
      inline def setBuildPackagesNull: Self = StObject.set(x, "buildPackages", null)
      
      inline def setBuildPackagesUndefined: Self = StObject.set(x, "buildPackages", js.undefined)
      
      inline def setBuildPackagesVarargs(value: String*): Self = StObject.set(x, "buildPackages", js.Array(value*))
      
      inline def setCompression(value: xz | lzo): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionNull: Self = StObject.set(x, "compression", null)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setConfinement(value: devmode | strict | classic): Self = StObject.set(x, "confinement", value.asInstanceOf[js.Any])
      
      inline def setConfinementNull: Self = StObject.set(x, "confinement", null)
      
      inline def setConfinementUndefined: Self = StObject.set(x, "confinement", js.undefined)
      
      inline def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setGrade(value: devel | stable): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
      
      inline def setGradeNull: Self = StObject.set(x, "grade", null)
      
      inline def setGradeUndefined: Self = StObject.set(x, "grade", js.undefined)
      
      inline def setHooks(value: String): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksNull: Self = StObject.set(x, "hooks", null)
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setLayout(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutNull: Self = StObject.set(x, "layout", null)
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setPlugs(value: (js.Array[String | PlugDescriptor]) | PlugDescriptor): Self = StObject.set(x, "plugs", value.asInstanceOf[js.Any])
      
      inline def setPlugsNull: Self = StObject.set(x, "plugs", null)
      
      inline def setPlugsUndefined: Self = StObject.set(x, "plugs", js.undefined)
      
      inline def setPlugsVarargs(value: (String | PlugDescriptor)*): Self = StObject.set(x, "plugs", js.Array(value*))
      
      inline def setSlots(value: (js.Array[String | SlotDescriptor]) | PlugDescriptor): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsNull: Self = StObject.set(x, "slots", null)
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setSlotsVarargs(value: (String | SlotDescriptor)*): Self = StObject.set(x, "slots", js.Array(value*))
      
      inline def setStagePackages(value: js.Array[String]): Self = StObject.set(x, "stagePackages", value.asInstanceOf[js.Any])
      
      inline def setStagePackagesNull: Self = StObject.set(x, "stagePackages", null)
      
      inline def setStagePackagesUndefined: Self = StObject.set(x, "stagePackages", js.undefined)
      
      inline def setStagePackagesVarargs(value: String*): Self = StObject.set(x, "stagePackages", js.Array(value*))
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryNull: Self = StObject.set(x, "summary", null)
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUseTemplateApp(value: Boolean): Self = StObject.set(x, "useTemplateApp", value.asInstanceOf[js.Any])
      
      inline def setUseTemplateAppUndefined: Self = StObject.set(x, "useTemplateApp", js.undefined)
    }
  }
}
