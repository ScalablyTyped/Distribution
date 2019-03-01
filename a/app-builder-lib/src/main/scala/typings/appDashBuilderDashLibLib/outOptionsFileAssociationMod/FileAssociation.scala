package typings
package appDashBuilderDashLibLib.outOptionsFileAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileAssociation extends js.Object {
  /**
    * *windows-only.* The description.
    */
  val description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The extension (minus the leading period). e.g. `png`.
    */
  val ext: java.lang.String | js.Array[java.lang.String]
  /**
    * The path to icon (`.icns` for MacOS and `.ico` for Windows), relative to `build` (build resources directory). Defaults to `${firstExt}.icns`/`${firstExt}.ico` (if several extensions specified, first is used) or to application icon.
    *
    * Not supported on Linux, file issue if need (default icon will be `x-office-document`).
    */
  val icon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * *macOS-only* Whether the document is distributed as a bundle. If set to true, the bundle directory is treated as a file. Corresponds to `LSTypeIsPackage`.
    */
  val isPackage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * *linux-only.* The mime-type.
    */
  val mimeType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The name. e.g. `PNG`. Defaults to `ext`.
    */
  val name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * *macOS-only* The app’s role with respect to the type. The value can be `Editor`, `Viewer`, `Shell`, or `None`. Corresponds to `CFBundleTypeRole`.
    * @default Editor
    */
  val role: js.UndefOr[java.lang.String] = js.undefined
}

object FileAssociation {
  @scala.inline
  def apply(
    ext: java.lang.String | js.Array[java.lang.String],
    description: java.lang.String = null,
    icon: java.lang.String = null,
    isPackage: js.UndefOr[scala.Boolean] = js.undefined,
    mimeType: java.lang.String = null,
    name: java.lang.String = null,
    role: java.lang.String = null
  ): FileAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(isPackage)) __obj.updateDynamic("isPackage")(isPackage)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (name != null) __obj.updateDynamic("name")(name)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[FileAssociation]
  }
}

