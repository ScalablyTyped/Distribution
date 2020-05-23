package typings.appBuilderLib.snapOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.appBuilderLibStrings.classic
import typings.appBuilderLib.appBuilderLibStrings.devel
import typings.appBuilderLib.appBuilderLibStrings.devmode
import typings.appBuilderLib.appBuilderLibStrings.stable
import typings.appBuilderLib.appBuilderLibStrings.strict
import typings.appBuilderLib.coreMod.Publish
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import typings.appBuilderLib.linuxOptionsMod.CommonLinuxOptions
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
    * Whether or not the snap should automatically start on login.
    * @default false
    */
  val autoStart: js.UndefOr[Boolean] = js.undefined
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
    after: js.UndefOr[Null | js.Array[String]] = js.undefined,
    artifactName: js.UndefOr[Null | String] = js.undefined,
    assumes: js.UndefOr[Null | js.Array[String] | String] = js.undefined,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    buildPackages: js.UndefOr[Null | js.Array[String]] = js.undefined,
    category: js.UndefOr[Null | String] = js.undefined,
    confinement: js.UndefOr[Null | devmode | strict | classic] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    desktop: js.UndefOr[Null | js.Any] = js.undefined,
    environment: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    executableArgs: js.UndefOr[Null | js.Array[String]] = js.undefined,
    grade: js.UndefOr[Null | devel | stable] = js.undefined,
    hooks: js.UndefOr[Null | String] = js.undefined,
    mimeTypes: js.UndefOr[Null | js.Array[String]] = js.undefined,
    plugs: js.UndefOr[Null | (js.Array[String | PlugDescriptor]) | PlugDescriptor] = js.undefined,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    stagePackages: js.UndefOr[Null | js.Array[String]] = js.undefined,
    summary: js.UndefOr[Null | String] = js.undefined,
    synopsis: js.UndefOr[Null | String] = js.undefined,
    useTemplateApp: js.UndefOr[Boolean] = js.undefined
  ): SnapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(after)) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(assumes)) __obj.updateDynamic("assumes")(assumes.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buildPackages)) __obj.updateDynamic("buildPackages")(buildPackages.asInstanceOf[js.Any])
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (!js.isUndefined(confinement)) __obj.updateDynamic("confinement")(confinement.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(environment)) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (!js.isUndefined(executableArgs)) __obj.updateDynamic("executableArgs")(executableArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(grade)) __obj.updateDynamic("grade")(grade.asInstanceOf[js.Any])
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(mimeTypes)) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(plugs)) __obj.updateDynamic("plugs")(plugs.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(stagePackages)) __obj.updateDynamic("stagePackages")(stagePackages.asInstanceOf[js.Any])
    if (!js.isUndefined(summary)) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (!js.isUndefined(synopsis)) __obj.updateDynamic("synopsis")(synopsis.asInstanceOf[js.Any])
    if (!js.isUndefined(useTemplateApp)) __obj.updateDynamic("useTemplateApp")(useTemplateApp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapOptions]
  }
}

