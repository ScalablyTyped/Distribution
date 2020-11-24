package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileConverter extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val CanOpen: Boolean = js.native
  
  val CanSave: Boolean = js.native
  
  val ClassName: String = js.native
  
  val Creator: FileConverters = js.native
  
  val Extensions: String = js.native
  
  val FormatName: String = js.native
  
  val Name: String = js.native
  
  val OpenFormat: Double = js.native
  
  val Parent: FileConverters = js.native
  
  val Path: String = js.native
  
  @JSName("PowerPoint.FileConverter_typekey")
  var PowerPointDotFileConverter_typekey: FileConverter = js.native
  
  val SaveFormat: Double = js.native
}
object FileConverter {
  
  @scala.inline
  def apply(
    Application: Application,
    CanOpen: Boolean,
    CanSave: Boolean,
    ClassName: String,
    Creator: FileConverters,
    Extensions: String,
    FormatName: String,
    Name: String,
    OpenFormat: Double,
    Parent: FileConverters,
    Path: String,
    PowerPointDotFileConverter_typekey: FileConverter,
    SaveFormat: Double
  ): FileConverter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CanOpen = CanOpen.asInstanceOf[js.Any], CanSave = CanSave.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], FormatName = FormatName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OpenFormat = OpenFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], SaveFormat = SaveFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.FileConverter_typekey")(PowerPointDotFileConverter_typekey.asInstanceOf[js.Any])
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
    def setCreator(value: FileConverters): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: String): Self = this.set("Extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatName(value: String): Self = this.set("FormatName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFormat(value: Double): Self = this.set("OpenFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: FileConverters): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotFileConverter_typekey(value: FileConverter): Self = this.set("PowerPoint.FileConverter_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveFormat(value: Double): Self = this.set("SaveFormat", value.asInstanceOf[js.Any])
  }
}
