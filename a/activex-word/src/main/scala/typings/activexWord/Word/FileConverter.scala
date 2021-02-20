package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileConverter extends StObject {
  
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
  implicit class FileConverterMutableBuilder[Self <: FileConverter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanOpen(value: Boolean): Self = StObject.set(x, "CanOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSave(value: Boolean): Self = StObject.set(x, "CanSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: String): Self = StObject.set(x, "Extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatName(value: String): Self = StObject.set(x, "FormatName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFormat(value: Double): Self = StObject.set(x, "OpenFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveFormat(value: Double): Self = StObject.set(x, "SaveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFileConverter_typekey(value: FileConverter): Self = StObject.set(x, "Word.FileConverter_typekey", value.asInstanceOf[js.Any])
  }
}
