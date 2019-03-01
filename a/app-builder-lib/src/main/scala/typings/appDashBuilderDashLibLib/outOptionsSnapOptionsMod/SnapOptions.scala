package typings
package appDashBuilderDashLibLib.outOptionsSnapOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapOptions
  extends appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.CommonLinuxOptions
     with appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions {
  /**
    * Specifies any [parts](https://snapcraft.io/docs/reference/parts) that should be built before this part.
    * Defaults to `["desktop-gtk2""]`.
    *
    * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom parts `foo` in addition to defaults.
    */
  val after: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * The list of features that must be supported by the core in order for this snap to install.
    */
  val assumes: js.UndefOr[js.Array[java.lang.String] | java.lang.String | scala.Null] = js.undefined
  /**
    * The list of debian packages needs to be installed for building this snap.
    */
  val buildPackages: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * The type of [confinement](https://snapcraft.io/docs/reference/confinement) supported by the snap.
    * @default strict
    */
  val confinement: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.devmode | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.strict | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.classic | scala.Null
  ] = js.undefined
  /**
    * The custom environment. Defaults to `{"TMPDIR: "$XDG_RUNTIME_DIR"}`. If you set custom, it will be merged with default.
    */
  val environment: js.UndefOr[js.Object | scala.Null] = js.undefined
  /**
    * The quality grade of the snap. It can be either `devel` (i.e. a development version of the snap, so not to be published to the “stable” or “candidate” channels) or “stable” (i.e. a stable release or release candidate, which can be released to all channels).
    * @default stable
    */
  val grade: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.devel | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.stable | scala.Null
  ] = js.undefined
  /**
    * The [hooks](https://docs.snapcraft.io/build-snaps/hooks) directory, relative to `build` (build resources directory).
    * @default build/snap-hooks
    */
  val hooks: js.UndefOr[java.lang.String | scala.Null] = js.undefined
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
  val plugs: js.UndefOr[(js.Array[java.lang.String | PlugDescriptor]) | PlugDescriptor | scala.Null] = js.undefined
  /**
    * The list of Ubuntu packages to use that are needed to support the `app` part creation. Like `depends` for `deb`.
    * Defaults to `["libasound2", "libgconf2-4", "libnotify4", "libnspr4", "libnss3", "libpcre3", "libpulse0", "libxss1", "libxtst6"]`.
    *
    * If list contains `default`, it will be replaced to default list, so, `["default", "foo"]` can be used to add custom package `foo` in addition to defaults.
    */
  val stagePackages: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * The 78 character long summary. Defaults to [productName](/configuration/configuration#Configuration-productName).
    */
  val summary: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to use template snap. Defaults to `true` if `stagePackages` not specified.
    */
  val useTemplateApp: js.UndefOr[scala.Boolean] = js.undefined
}

object SnapOptions {
  @scala.inline
  def apply(
    after: js.Array[java.lang.String] = null,
    artifactName: java.lang.String = null,
    assumes: js.Array[java.lang.String] | java.lang.String = null,
    buildPackages: js.Array[java.lang.String] = null,
    category: java.lang.String = null,
    confinement: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.devmode | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.strict | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.classic = null,
    description: java.lang.String = null,
    desktop: js.Any = null,
    environment: js.Object = null,
    grade: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.devel | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.stable = null,
    hooks: java.lang.String = null,
    mimeTypes: js.Array[java.lang.String] = null,
    plugs: (js.Array[java.lang.String | PlugDescriptor]) | PlugDescriptor = null,
    publish: builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish = null,
    stagePackages: js.Array[java.lang.String] = null,
    summary: java.lang.String = null,
    synopsis: java.lang.String = null,
    useTemplateApp: js.UndefOr[scala.Boolean] = js.undefined
  ): SnapOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (assumes != null) __obj.updateDynamic("assumes")(assumes.asInstanceOf[js.Any])
    if (buildPackages != null) __obj.updateDynamic("buildPackages")(buildPackages)
    if (category != null) __obj.updateDynamic("category")(category)
    if (confinement != null) __obj.updateDynamic("confinement")(confinement.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (desktop != null) __obj.updateDynamic("desktop")(desktop)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (grade != null) __obj.updateDynamic("grade")(grade.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    if (plugs != null) __obj.updateDynamic("plugs")(plugs.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (stagePackages != null) __obj.updateDynamic("stagePackages")(stagePackages)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis)
    if (!js.isUndefined(useTemplateApp)) __obj.updateDynamic("useTemplateApp")(useTemplateApp)
    __obj.asInstanceOf[SnapOptions]
  }
}

