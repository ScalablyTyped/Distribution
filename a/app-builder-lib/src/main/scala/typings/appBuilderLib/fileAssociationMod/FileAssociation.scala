package typings.appBuilderLib.fileAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileAssociation extends js.Object {
  /**
    * *windows-only.* The description.
    */
  val description: js.UndefOr[String | Null] = js.undefined
  /**
    * The extension (minus the leading period). e.g. `png`.
    */
  val ext: String | js.Array[String]
  /**
    * The path to icon (`.icns` for MacOS and `.ico` for Windows), relative to `build` (build resources directory). Defaults to `${firstExt}.icns`/`${firstExt}.ico` (if several extensions specified, first is used) or to application icon.
    *
    * Not supported on Linux, file issue if need (default icon will be `x-office-document`).
    */
  val icon: js.UndefOr[String | Null] = js.undefined
  /**
    * *macOS-only* Whether the document is distributed as a bundle. If set to true, the bundle directory is treated as a file. Corresponds to `LSTypeIsPackage`.
    */
  val isPackage: js.UndefOr[Boolean] = js.undefined
  /**
    * *linux-only.* The mime-type.
    */
  val mimeType: js.UndefOr[String | Null] = js.undefined
  /**
    * The name. e.g. `PNG`. Defaults to `ext`.
    */
  val name: js.UndefOr[String | Null] = js.undefined
  /**
    * *macOS-only* The app’s role with respect to the type. The value can be `Editor`, `Viewer`, `Shell`, or `None`. Corresponds to `CFBundleTypeRole`.
    * @default Editor
    */
  val role: js.UndefOr[String] = js.undefined
}

object FileAssociation {
  @scala.inline
  def apply(
    ext: String | js.Array[String],
    description: String = null,
    icon: String = null,
    isPackage: js.UndefOr[Boolean] = js.undefined,
    mimeType: String = null,
    name: String = null,
    role: String = null
  ): FileAssociation = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isPackage)) __obj.updateDynamic("isPackage")(isPackage.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAssociation]
  }
}

