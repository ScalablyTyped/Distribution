package typings
package appDashBuilderDashLibLib.outOptionsMacOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ 
trait DmgOptions extends js.Object {
  /**
       * The path to background image (default: `build/background.tiff` or `build/background.png` if exists). The resolution of this file determines the resolution of the installer window.
       * If background is not specified, use `window.size`. Default locations expected background size to be 540x380.
       * @see [DMG with Retina background support](http://stackoverflow.com/a/11204769/1910191).
       */
  var background: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The background color (accepts css colors). Defaults to `#ffffff` (white) if no background image.
       */
  var backgroundColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The content — to customize icon locations.
       */
  var contents: js.UndefOr[js.Array[DmgContent]] = js.undefined
  /**
       * The disk image format. `ULFO` (lzfse-compressed image (OS X 10.11+ only)).
       * @default UDZO
       */
  val format: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.UDRW | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.UDRO | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.UDCO | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.UDZO | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.UDBZ | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.ULFO
  ] = js.undefined
  /**
       * The path to DMG icon (volume icon), which will be shown when mounted, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
       * Defaults to the application icon (`build/icon.icns`).
       */
  val icon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The size of all the icons inside the DMG.
       * @default 80
       */
  val iconSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
       * The size of all the icon texts inside the DMG.
       * @default 12
       */
  val iconTextSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
       * Whether to create internet-enabled disk image (when it is downloaded using a browser it will automatically decompress the image, put the application on the desktop, unmount and remove the disk image file).
       * @default false
       */
  val internetEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The title of the produced DMG, which will be shown when mounted (volume name).
       *
       * Macro `${productName}`, `${version}` and `${name}` are supported.
       * @default ${productName} ${version}
       */
  val title: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The DMG windows position and size.
       */
  var window: js.UndefOr[DmgWindow] = js.undefined
}

