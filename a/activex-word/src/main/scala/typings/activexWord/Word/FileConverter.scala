package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileConverter extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val CanOpen: Boolean
  
  val CanSave: Boolean
  
  val ClassName: String
  
  val Creator: Double
  
  val Extensions: String
  
  val FormatName: String
  
  val Name: String
  
  val OpenFormat: Double
  
  val Parent: js.Any
  
  val Path: String
  
  val SaveFormat: Double
  
  /* private */ @JSName("Word.FileConverter_typekey")
  var WordDotFileConverter_typekey: FileConverter
}
object FileConverter {
  
  inline def apply(
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
  
  extension [Self <: FileConverter](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCanOpen(value: Boolean): Self = StObject.set(x, "CanOpen", value.asInstanceOf[js.Any])
    
    inline def setCanSave(value: Boolean): Self = StObject.set(x, "CanSave", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: String): Self = StObject.set(x, "Extensions", value.asInstanceOf[js.Any])
    
    inline def setFormatName(value: String): Self = StObject.set(x, "FormatName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOpenFormat(value: Double): Self = StObject.set(x, "OpenFormat", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setSaveFormat(value: Double): Self = StObject.set(x, "SaveFormat", value.asInstanceOf[js.Any])
    
    inline def setWordDotFileConverter_typekey(value: FileConverter): Self = StObject.set(x, "Word.FileConverter_typekey", value.asInstanceOf[js.Any])
  }
}
