package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileConverter extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val CanOpen: Boolean
  
  val CanSave: Boolean
  
  val ClassName: String
  
  val Creator: FileConverters
  
  val Extensions: String
  
  val FormatName: String
  
  val Name: String
  
  val OpenFormat: Double
  
  val Parent: FileConverters
  
  val Path: String
  
  /* private */ @JSName("PowerPoint.FileConverter_typekey")
  var PowerPointDotFileConverter_typekey: FileConverter
  
  val SaveFormat: Double
}
object FileConverter {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: FileConverter] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCanOpen(value: Boolean): Self = StObject.set(x, "CanOpen", value.asInstanceOf[js.Any])
    
    inline def setCanSave(value: Boolean): Self = StObject.set(x, "CanSave", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: FileConverters): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: String): Self = StObject.set(x, "Extensions", value.asInstanceOf[js.Any])
    
    inline def setFormatName(value: String): Self = StObject.set(x, "FormatName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOpenFormat(value: Double): Self = StObject.set(x, "OpenFormat", value.asInstanceOf[js.Any])
    
    inline def setParent(value: FileConverters): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotFileConverter_typekey(value: FileConverter): Self = StObject.set(x, "PowerPoint.FileConverter_typekey", value.asInstanceOf[js.Any])
    
    inline def setSaveFormat(value: Double): Self = StObject.set(x, "SaveFormat", value.asInstanceOf[js.Any])
  }
}
