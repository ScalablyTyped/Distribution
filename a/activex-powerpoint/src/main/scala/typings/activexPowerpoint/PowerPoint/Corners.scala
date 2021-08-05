package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Corners extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Creator: Double
  
  val Name: String
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.Corners_typekey")
  var PowerPointDotCorners_typekey: Corners
  
  def Select(): js.Any
}
object Corners {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Name: String,
    Parent: js.Any,
    PowerPointDotCorners_typekey: Corners,
    Select: () => js.Any
  ): Corners = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("PowerPoint.Corners_typekey")(PowerPointDotCorners_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corners]
  }
  
  extension [Self <: Corners](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotCorners_typekey(value: Corners): Self = StObject.set(x, "PowerPoint.Corners_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
