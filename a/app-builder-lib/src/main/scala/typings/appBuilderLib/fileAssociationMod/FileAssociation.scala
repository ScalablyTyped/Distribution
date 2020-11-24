package typings.appBuilderLib.fileAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileAssociation extends js.Object {
  
  /**
    * *windows-only.* The description.
    */
  val description: js.UndefOr[String | Null] = js.native
  
  /**
    * The extension (minus the leading period). e.g. `png`.
    */
  val ext: String | js.Array[String] = js.native
  
  /**
    * The path to icon (`.icns` for MacOS and `.ico` for Windows), relative to `build` (build resources directory). Defaults to `${firstExt}.icns`/`${firstExt}.ico` (if several extensions specified, first is used) or to application icon.
    *
    * Not supported on Linux, file issue if need (default icon will be `x-office-document`).
    */
  val icon: js.UndefOr[String | Null] = js.native
  
  /**
    * *macOS-only* Whether the document is distributed as a bundle. If set to true, the bundle directory is treated as a file. Corresponds to `LSTypeIsPackage`.
    */
  val isPackage: js.UndefOr[Boolean] = js.native
  
  /**
    * *linux-only.* The mime-type.
    */
  val mimeType: js.UndefOr[String | Null] = js.native
  
  /**
    * The name. e.g. `PNG`. Defaults to `ext`.
    */
  val name: js.UndefOr[String | Null] = js.native
  
  /**
    * *macOS-only* The app’s rank with respect to the type. The value can be `Owner`, `Default`, `Alternate`, or `None`. Corresponds to `LSHandlerRank`.
    * @default Default
    */
  val rank: js.UndefOr[String] = js.native
  
  /**
    * *macOS-only* The app’s role with respect to the type. The value can be `Editor`, `Viewer`, `Shell`, or `None`. Corresponds to `CFBundleTypeRole`.
    * @default Editor
    */
  val role: js.UndefOr[String] = js.native
}
object FileAssociation {
  
  @scala.inline
  def apply(ext: String | js.Array[String]): FileAssociation = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAssociation]
  }
  
  @scala.inline
  implicit class FileAssociationOps[Self <: FileAssociation] (val x: Self) extends AnyVal {
    
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
    def setExtVarargs(value: String*): Self = this.set("ext", js.Array(value :_*))
    
    @scala.inline
    def setExt(value: String | js.Array[String]): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setIsPackage(value: Boolean): Self = this.set("isPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPackage: Self = this.set("isPackage", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setMimeTypeNull: Self = this.set("mimeType", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setRank(value: String): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
