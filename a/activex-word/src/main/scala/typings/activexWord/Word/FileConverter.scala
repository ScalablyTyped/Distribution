package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileConverter extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val CanOpen: Boolean = js.native
  
  val CanSave: Boolean = js.native
  
  val ClassName: String = js.native
  
  val Creator: Double = js.native
  
  val Extensions: String = js.native
  
  val FormatName: String = js.native
  
  val Name: String = js.native
  
  val OpenFormat: Double = js.native
  
  val Parent: js.Any = js.native
  
  val Path: String = js.native
  
  val SaveFormat: Double = js.native
  
  @JSName("Word.FileConverter_typekey")
  var WordDotFileConverter_typekey: FileConverter = js.native
}
object FileConverter {
  
  @scala.inline
  def apply(
    Application: Application,
    CanOpen: Boolean,
    CanSave: Boolean,
    ClassName: String,
    Creator: Double,
    Extensions: String,
    FormatName: String,
    Name: String,
    OpenFormat: Double,
    Parent: js.Any,
    Path: String,
    SaveFormat: Double,
    WordDotFileConverter_typekey: FileConverter
  ): FileConverter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CanOpen = CanOpen.asInstanceOf[js.Any], CanSave = CanSave.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], FormatName = FormatName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OpenFormat = OpenFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], SaveFormat = SaveFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FileConverter_typekey")(WordDotFileConverter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverter]
  }
  
  @scala.inline
  implicit class FileConverterOps[Self <: FileConverter] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanOpen(value: Boolean): Self = this.set("CanOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSave(value: Boolean): Self = this.set("CanSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("ClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: String): Self = this.set("Extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatName(value: String): Self = this.set("FormatName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFormat(value: Double): Self = this.set("OpenFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveFormat(value: Double): Self = this.set("SaveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFileConverter_typekey(value: FileConverter): Self = this.set("Word.FileConverter_typekey", value.asInstanceOf[js.Any])
  }
}
