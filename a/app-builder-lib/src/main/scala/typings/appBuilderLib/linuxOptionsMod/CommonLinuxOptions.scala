package typings.appBuilderLib.linuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonLinuxOptions extends js.Object {
  
  /**
    * The [application category](https://specifications.freedesktop.org/menu-spec/latest/apa.html#main-category-registry).
    */
  val category: js.UndefOr[String | Null] = js.native
  
  /**
    * As [description](/configuration/configuration#Metadata-description) from application package.json, but allows you to specify different for Linux.
    */
  val description: js.UndefOr[String | Null] = js.native
  
  /**
    * The [Desktop file](https://developer.gnome.org/integration-guide/stable/desktop-files.html.en) entries (name to value).
    */
  val desktop: js.UndefOr[js.Any | Null] = js.native
  
  /**
    * The executable parameters. Pass to executableName
    */
  val executableArgs: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * The mime types in addition to specified in the file associations. Use it if you don't want to register a new mime type, but reuse existing.
    */
  val mimeTypes: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * The [short description](https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Description).
    */
  val synopsis: js.UndefOr[String | Null] = js.native
}
object CommonLinuxOptions {
  
  @scala.inline
  def apply(): CommonLinuxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonLinuxOptions]
  }
  
  @scala.inline
  implicit class CommonLinuxOptionsOps[Self <: CommonLinuxOptions] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setCategoryNull: Self = this.set("category", null)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDesktop(value: js.Any): Self = this.set("desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    
    @scala.inline
    def setDesktopNull: Self = this.set("desktop", null)
    
    @scala.inline
    def setExecutableArgsVarargs(value: String*): Self = this.set("executableArgs", js.Array(value :_*))
    
    @scala.inline
    def setExecutableArgs(value: js.Array[String]): Self = this.set("executableArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutableArgs: Self = this.set("executableArgs", js.undefined)
    
    @scala.inline
    def setExecutableArgsNull: Self = this.set("executableArgs", null)
    
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = this.set("mimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
    
    @scala.inline
    def setMimeTypesNull: Self = this.set("mimeTypes", null)
    
    @scala.inline
    def setSynopsis(value: String): Self = this.set("synopsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynopsis: Self = this.set("synopsis", js.undefined)
    
    @scala.inline
    def setSynopsisNull: Self = this.set("synopsis", null)
  }
}
