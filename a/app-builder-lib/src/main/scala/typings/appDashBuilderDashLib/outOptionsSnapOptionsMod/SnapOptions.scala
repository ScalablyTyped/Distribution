package typings.appDashBuilderDashLib.outOptionsSnapOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.classic
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.devel
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.devmode
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.stable
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.strict
import typings.appDashBuilderDashLib.outCoreMod.Publish
import typings.appDashBuilderDashLib.outCoreMod.TargetSpecificOptions
import typings.appDashBuilderDashLib.outOptionsLinuxOptionsMod.CommonLinuxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapOptions
  extends CommonLinuxOptions
     with TargetSpecificOptions {
  /**
    * Specifies any [parts](https://snapcraft.io/docs/reference/parts) that should be built before this part.
    * Defaults to `["desktop-gtk2""]`.
    *
    * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom parts `foo` in addition to defaults.
    */
  val after: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * The list of features that must be supported by the core in order for this snap to install.
    */
  val assumes: js.UndefOr[js.Array[String] | String | Null] = js.undefined
  /**
    * The list of debian packages needs to be installed for building this snap.
    */
  val buildPackages: js.UndefOr[js.Array[String] | Null] = js.undefined
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
    * The list of [plugs](https://snapcraft.io/docs/reference/interfaces).
    * Defaults to `["desktop", "desktop-legacy", "home", "x11", "unity7", "browser-support", "network", "gsettings", "pulseaudio", "opengl"]`.
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
    * The list of Ubuntu packages to use that are needed to support the `app` part creation. Like `depends` for `deb`.
    * Defaults to `["libasound2", "libgconf2-4", "libnotify4", "libnspr4", "libnss3", "libpcre3", "libpulse0", "libxss1", "libxtst6"]`.
    *
    * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom package `foo` in addition to defaults.
    */
  val stagePackages: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * The 78 character long summary. Defaults to [productName](/configuration/configuration#Configuration-productName).
    */
  val summary: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to use template snap. Defaults to `true` if `stagePackages` not specified.
    */
  val useTemplateApp: js.UndefOr[Boolean] = js.undefined
}

object SnapOptions {
  @scala.inline
  def apply(
    after: js.Array[String] = null,
    artifactName: String = null,
    assumes: js.Array[String] | String = null,
    buildPackages: js.Array[String] = null,
    category: String = null,
    confinement: devmode | strict | classic = null,
    description: String = null,
    desktop: js.Any = null,
    environment: StringDictionary[String] = null,
    grade: devel | stable = null,
    hooks: String = null,
    mimeTypes: js.Array[String] = null,
    plugs: (js.Array[String | PlugDescriptor]) | PlugDescriptor = null,
    publish: Publish = null,
    stagePackages: js.Array[String] = null,
    summary: String = null,
    synopsis: String = null,
    useTemplateApp: js.UndefOr[Boolean] = js.undefined
  ): SnapOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (assumes != null) __obj.updateDynamic("assumes")(assumes.asInstanceOf[js.Any])
    if (buildPackages != null) __obj.updateDynamic("buildPackages")(buildPackages.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (confinement != null) __obj.updateDynamic("confinement")(confinement.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (grade != null) __obj.updateDynamic("grade")(grade.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (plugs != null) __obj.updateDynamic("plugs")(plugs.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (stagePackages != null) __obj.updateDynamic("stagePackages")(stagePackages.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis.asInstanceOf[js.Any])
    if (!js.isUndefined(useTemplateApp)) __obj.updateDynamic("useTemplateApp")(useTemplateApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapOptions]
  }
}

