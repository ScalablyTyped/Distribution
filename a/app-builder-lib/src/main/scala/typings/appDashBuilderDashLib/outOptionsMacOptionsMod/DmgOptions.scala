package typings.appDashBuilderDashLib.outOptionsMacOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.UDBZ
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.UDCO
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.UDRO
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.UDRW
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.UDZO
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.ULFO
import typings.appDashBuilderDashLib.outCoreMod.Publish
import typings.appDashBuilderDashLib.outCoreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DmgOptions extends TargetSpecificOptions {
  /**
    * The path to background image (default: `build/background.tiff` or `build/background.png` if exists). The resolution of this file determines the resolution of the installer window.
    * If background is not specified, use `window.size`. Default locations expected background size to be 540x380.
    * @see [DMG with Retina background support](http://stackoverflow.com/a/11204769/1910191).
    */
  var background: js.UndefOr[String | Null] = js.undefined
  /**
    * The background color (accepts css colors). Defaults to `#ffffff` (white) if no background image.
    */
  var backgroundColor: js.UndefOr[String | Null] = js.undefined
  /**
    * The content — to customize icon locations. The x and y coordinates refer to the position of the **center** of the icon (at 1x scale), and do not take the label into account.
    */
  var contents: js.UndefOr[js.Array[DmgContent]] = js.undefined
  /**
    * The disk image format. `ULFO` (lzfse-compressed image (OS X 10.11+ only)).
    * @default UDZO
    */
  var format: js.UndefOr[UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO] = js.undefined
  /**
    * The path to DMG icon (volume icon), which will be shown when mounted, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to the application icon (`build/icon.icns`).
    */
  var icon: js.UndefOr[String | Null] = js.undefined
  /**
    * The size of all the icons inside the DMG.
    * @default 80
    */
  val iconSize: js.UndefOr[Double | Null] = js.undefined
  /**
    * The size of all the icon texts inside the DMG.
    * @default 12
    */
  val iconTextSize: js.UndefOr[Double | Null] = js.undefined
  /**
    * Whether to create internet-enabled disk image (when it is downloaded using a browser it will automatically decompress the image, put the application on the desktop, unmount and remove the disk image file).
    * @default false
    */
  val internetEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to sign the DMG or not. Signing is not required and will lead to unwanted errors in combination with notarization requirements.
    * @default false
    */
  val sign: js.UndefOr[Boolean] = js.undefined
  /**
    * The title of the produced DMG, which will be shown when mounted (volume name).
    *
    * Macro `${productName}`, `${version}` and `${name}` are supported.
    * @default ${productName} ${version}
    */
  val title: js.UndefOr[String | Null] = js.undefined
  /**
    * The DMG window position and size. With y co-ordinates running from bottom to top.
    *
    * The Finder makes sure that the window will be on the user’s display, so if you want your window at the top left of the display you could use `"x": 0, "y": 100000` as the x, y co-ordinates.
    * It is not to be possible to position the window relative to the [top left](https://github.com/electron-userland/electron-builder/issues/3990#issuecomment-512960957) or relative to the center of the user’s screen.
    */
  var window: js.UndefOr[DmgWindow] = js.undefined
  /**
    * @private
    * @default true
    */
  var writeUpdateInfo: js.UndefOr[Boolean] = js.undefined
}

object DmgOptions {
  @scala.inline
  def apply(
    artifactName: String = null,
    background: String = null,
    backgroundColor: String = null,
    contents: js.Array[DmgContent] = null,
    format: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO = null,
    icon: String = null,
    iconSize: Int | Double = null,
    iconTextSize: Int | Double = null,
    internetEnabled: js.UndefOr[Boolean] = js.undefined,
    publish: Publish = null,
    sign: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    window: DmgWindow = null,
    writeUpdateInfo: js.UndefOr[Boolean] = js.undefined
  ): DmgOptions = {
    val __obj = js.Dynamic.literal()
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconTextSize != null) __obj.updateDynamic("iconTextSize")(iconTextSize.asInstanceOf[js.Any])
    if (!js.isUndefined(internetEnabled)) __obj.updateDynamic("internetEnabled")(internetEnabled.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(sign)) __obj.updateDynamic("sign")(sign.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    if (!js.isUndefined(writeUpdateInfo)) __obj.updateDynamic("writeUpdateInfo")(writeUpdateInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DmgOptions]
  }
}

