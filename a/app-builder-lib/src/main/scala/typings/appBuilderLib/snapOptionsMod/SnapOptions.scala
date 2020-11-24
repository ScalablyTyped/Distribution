package typings.appBuilderLib.snapOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.appBuilderLibStrings.classic
import typings.appBuilderLib.appBuilderLibStrings.devel
import typings.appBuilderLib.appBuilderLibStrings.devmode
import typings.appBuilderLib.appBuilderLibStrings.stable
import typings.appBuilderLib.appBuilderLibStrings.strict
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import typings.appBuilderLib.linuxOptionsMod.CommonLinuxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapOptions
  extends CommonLinuxOptions
     with TargetSpecificOptions {
  
  /**
    * Specifies any [parts](https://snapcraft.io/docs/reference/parts) that should be built before this part.
    * Defaults to `["desktop-gtk2""]`.
    *
    * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom parts `foo` in addition to defaults.
    */
  val after: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * Specifies which files from the app part to stage and which to exclude. Individual files, directories, wildcards, globstars, and exclusions are accepted. See [Snapcraft filesets](https://snapcraft.io/docs/snapcraft-filesets) to learn more about the format.
    *
    * The defaults can be found in [snap.ts](https://github.com/electron-userland/electron-builder/blob/master/packages/app-builder-lib/templates/snap/snapcraft.yaml#L29).
    */
  val appPartStage: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * The list of features that must be supported by the core in order for this snap to install.
    */
  val assumes: js.UndefOr[js.Array[String] | String | Null] = js.native
  
  /**
    * Whether or not the snap should automatically start on login.
    * @default false
    */
  val autoStart: js.UndefOr[Boolean] = js.native
  
  /**
    * The list of debian packages needs to be installed for building this snap.
    */
  val buildPackages: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * The type of [confinement](https://snapcraft.io/docs/reference/confinement) supported by the snap.
    * @default strict
    */
  val confinement: js.UndefOr[devmode | strict | classic | Null] = js.native
  
  /**
    * The custom environment. Defaults to `{"TMPDIR: "$XDG_RUNTIME_DIR"}`. If you set custom, it will be merged with default.
    */
  val environment: js.UndefOr[StringDictionary[String] | Null] = js.native
  
  /**
    * The quality grade of the snap. It can be either `devel` (i.e. a development version of the snap, so not to be published to the “stable” or “candidate” channels) or “stable” (i.e. a stable release or release candidate, which can be released to all channels).
    * @default stable
    */
  val grade: js.UndefOr[devel | stable | Null] = js.native
  
  /**
    * The [hooks](https://docs.snapcraft.io/build-snaps/hooks) directory, relative to `build` (build resources directory).
    * @default build/snap-hooks
    */
  val hooks: js.UndefOr[String | Null] = js.native
  
  /**
    * Specifies any files to make accessible from locations such as `/usr`, `/var`, and `/etc`. See [snap layouts](https://snapcraft.io/docs/snap-layouts) to learn more.
    */
  val layout: js.UndefOr[StringDictionary[StringDictionary[String]] | Null] = js.native
  
  /**
    * The list of [plugs](https://snapcraft.io/docs/reference/interfaces).
    * Defaults to `["desktop", "desktop-legacy", "home", "x11", "unity7", "browser-support", "network", "gsettings", "audio-playback", "pulseaudio", "opengl"]`.
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
  val plugs: js.UndefOr[(js.Array[String | PlugDescriptor]) | PlugDescriptor | Null] = js.native
  
  /**
    * The list of [slots](https://snapcraft.io/docs/reference/interfaces).
    */
  val slots: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * The list of Ubuntu packages to use that are needed to support the `app` part creation. Like `depends` for `deb`.
    * Defaults to `["libasound2", "libgconf2-4", "libnotify4", "libnspr4", "libnss3", "libpcre3", "libpulse0", "libxss1", "libxtst6"]`.
    *
    * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom package `foo` in addition to defaults.
    */
  val stagePackages: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * The 78 character long summary. Defaults to [productName](/configuration/configuration#Configuration-productName).
    */
  val summary: js.UndefOr[String | Null] = js.native
  
  /**
    * Whether to use template snap. Defaults to `true` if `stagePackages` not specified.
    */
  val useTemplateApp: js.UndefOr[Boolean] = js.native
}
object SnapOptions {
  
  @scala.inline
  def apply(): SnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapOptions]
  }
  
  @scala.inline
  implicit class SnapOptionsOps[Self <: SnapOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterVarargs(value: String*): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAfterNull: Self = this.set("after", null)
    
    @scala.inline
    def setAppPartStageVarargs(value: String*): Self = this.set("appPartStage", js.Array(value :_*))
    
    @scala.inline
    def setAppPartStage(value: js.Array[String]): Self = this.set("appPartStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppPartStage: Self = this.set("appPartStage", js.undefined)
    
    @scala.inline
    def setAppPartStageNull: Self = this.set("appPartStage", null)
    
    @scala.inline
    def setAssumesVarargs(value: String*): Self = this.set("assumes", js.Array(value :_*))
    
    @scala.inline
    def setAssumes(value: js.Array[String] | String): Self = this.set("assumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumes: Self = this.set("assumes", js.undefined)
    
    @scala.inline
    def setAssumesNull: Self = this.set("assumes", null)
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setBuildPackagesVarargs(value: String*): Self = this.set("buildPackages", js.Array(value :_*))
    
    @scala.inline
    def setBuildPackages(value: js.Array[String]): Self = this.set("buildPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildPackages: Self = this.set("buildPackages", js.undefined)
    
    @scala.inline
    def setBuildPackagesNull: Self = this.set("buildPackages", null)
    
    @scala.inline
    def setConfinement(value: devmode | strict | classic): Self = this.set("confinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfinement: Self = this.set("confinement", js.undefined)
    
    @scala.inline
    def setConfinementNull: Self = this.set("confinement", null)
    
    @scala.inline
    def setEnvironment(value: StringDictionary[String]): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setEnvironmentNull: Self = this.set("environment", null)
    
    @scala.inline
    def setGrade(value: devel | stable): Self = this.set("grade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrade: Self = this.set("grade", js.undefined)
    
    @scala.inline
    def setGradeNull: Self = this.set("grade", null)
    
    @scala.inline
    def setHooks(value: String): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setHooksNull: Self = this.set("hooks", null)
    
    @scala.inline
    def setLayout(value: StringDictionary[StringDictionary[String]]): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLayoutNull: Self = this.set("layout", null)
    
    @scala.inline
    def setPlugsVarargs(value: (String | PlugDescriptor)*): Self = this.set("plugs", js.Array(value :_*))
    
    @scala.inline
    def setPlugs(value: (js.Array[String | PlugDescriptor]) | PlugDescriptor): Self = this.set("plugs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugs: Self = this.set("plugs", js.undefined)
    
    @scala.inline
    def setPlugsNull: Self = this.set("plugs", null)
    
    @scala.inline
    def setSlotsVarargs(value: String*): Self = this.set("slots", js.Array(value :_*))
    
    @scala.inline
    def setSlots(value: js.Array[String]): Self = this.set("slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
    
    @scala.inline
    def setSlotsNull: Self = this.set("slots", null)
    
    @scala.inline
    def setStagePackagesVarargs(value: String*): Self = this.set("stagePackages", js.Array(value :_*))
    
    @scala.inline
    def setStagePackages(value: js.Array[String]): Self = this.set("stagePackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStagePackages: Self = this.set("stagePackages", js.undefined)
    
    @scala.inline
    def setStagePackagesNull: Self = this.set("stagePackages", null)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setSummaryNull: Self = this.set("summary", null)
    
    @scala.inline
    def setUseTemplateApp(value: Boolean): Self = this.set("useTemplateApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTemplateApp: Self = this.set("useTemplateApp", js.undefined)
  }
}
