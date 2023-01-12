package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoShapeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceholderFormat extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val ContainedType: MsoShapeType
  
  var Name: String
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.PlaceholderFormat_typekey")
  var PowerPointDotPlaceholderFormat_typekey: PlaceholderFormat
  
  val Type: PpPlaceholderType
}
object PlaceholderFormat {
  
  inline def apply(
    Application: Application,
    ContainedType: MsoShapeType,
    Name: String,
    Parent: Any,
    PowerPointDotPlaceholderFormat_typekey: PlaceholderFormat,
    Type: PpPlaceholderType
  ): PlaceholderFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ContainedType = ContainedType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PlaceholderFormat_typekey")(PowerPointDotPlaceholderFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceholderFormat] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setContainedType(value: MsoShapeType): Self = StObject.set(x, "ContainedType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPlaceholderFormat_typekey(value: PlaceholderFormat): Self = StObject.set(x, "PowerPoint.PlaceholderFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setType(value: PpPlaceholderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
