package typings.appBuilderLib.macOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.UDBZ
import typings.appBuilderLib.appBuilderLibStrings.UDCO
import typings.appBuilderLib.appBuilderLibStrings.UDRO
import typings.appBuilderLib.appBuilderLibStrings.UDRW
import typings.appBuilderLib.appBuilderLibStrings.UDZO
import typings.appBuilderLib.appBuilderLibStrings.ULFO
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DmgOptions extends TargetSpecificOptions {
  
  /**
    * The path to background image (default: `build/background.tiff` or `build/background.png` if exists). The resolution of this file determines the resolution of the installer window.
    * If background is not specified, use `window.size`. Default locations expected background size to be 540x380.
    * @see [DMG with Retina background support](http://stackoverflow.com/a/11204769/1910191).
    */
  var background: js.UndefOr[String | Null] = js.native
  
  /**
    * The background color (accepts css colors). Defaults to `#ffffff` (white) if no background image.
    */
  var backgroundColor: js.UndefOr[String | Null] = js.native
  
  /**
    * The content — to customize icon locations. The x and y coordinates refer to the position of the **center** of the icon (at 1x scale), and do not take the label into account.
    */
  var contents: js.UndefOr[js.Array[DmgContent]] = js.native
  
  /**
    * The disk image format. `ULFO` (lzfse-compressed image (OS X 10.11+ only)).
    * @default UDZO
    */
  var format: js.UndefOr[UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO] = js.native
  
  /**
    * The path to DMG icon (volume icon), which will be shown when mounted, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to the application icon (`build/icon.icns`).
    */
  var icon: js.UndefOr[String | Null] = js.native
  
  /**
    * The size of all the icons inside the DMG.
    * @default 80
    */
  val iconSize: js.UndefOr[Double | Null] = js.native
  
  /**
    * The size of all the icon texts inside the DMG.
    * @default 12
    */
  val iconTextSize: js.UndefOr[Double | Null] = js.native
  
  /**
    * Whether to create internet-enabled disk image (when it is downloaded using a browser it will automatically decompress the image, put the application on the desktop, unmount and remove the disk image file).
    * @default false
    */
  val internetEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to sign the DMG or not. Signing is not required and will lead to unwanted errors in combination with notarization requirements.
    * @default false
    */
  val sign: js.UndefOr[Boolean] = js.native
  
  /**
    * The title of the produced DMG, which will be shown when mounted (volume name).
    *
    * Macro `${productName}`, `${version}` and `${name}` are supported.
    * @default ${productName} ${version}
    */
  val title: js.UndefOr[String | Null] = js.native
  
  /**
    * The DMG window position and size. With y co-ordinates running from bottom to top.
    *
    * The Finder makes sure that the window will be on the user’s display, so if you want your window at the top left of the display you could use `"x": 0, "y": 100000` as the x, y co-ordinates.
    * It is not to be possible to position the window relative to the [top left](https://github.com/electron-userland/electron-builder/issues/3990#issuecomment-512960957) or relative to the center of the user’s screen.
    */
  var window: js.UndefOr[DmgWindow] = js.native
  
  /**
    * @private
    * @default true
    */
  var writeUpdateInfo: js.UndefOr[Boolean] = js.native
}
object DmgOptions {
  
  @scala.inline
  def apply(): DmgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DmgOptions]
  }
  
  @scala.inline
  implicit class DmgOptionsOps[Self <: DmgOptions] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackgroundNull: Self = this.set("background", null)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorNull: Self = this.set("backgroundColor", null)
    
    @scala.inline
    def setContentsVarargs(value: DmgContent*): Self = this.set("contents", js.Array(value :_*))
    
    @scala.inline
    def setContents(value: js.Array[DmgContent]): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    
    @scala.inline
    def setFormat(value: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setIconSizeNull: Self = this.set("iconSize", null)
    
    @scala.inline
    def setIconTextSize(value: Double): Self = this.set("iconTextSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconTextSize: Self = this.set("iconTextSize", js.undefined)
    
    @scala.inline
    def setIconTextSizeNull: Self = this.set("iconTextSize", null)
    
    @scala.inline
    def setInternetEnabled(value: Boolean): Self = this.set("internetEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternetEnabled: Self = this.set("internetEnabled", js.undefined)
    
    @scala.inline
    def setSign(value: Boolean): Self = this.set("sign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSign: Self = this.set("sign", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
    
    @scala.inline
    def setWindow(value: DmgWindow): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
    
    @scala.inline
    def setWriteUpdateInfo(value: Boolean): Self = this.set("writeUpdateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteUpdateInfo: Self = this.set("writeUpdateInfo", js.undefined)
  }
}
