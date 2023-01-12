package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftEdgeFormat extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  /* private */ @JSName("Office.SoftEdgeFormat_typekey")
  var OfficeDotSoftEdgeFormat_typekey: SoftEdgeFormat
  
  var Radius: Double
  
  var Type: MsoSoftEdgeType
}
object SoftEdgeFormat {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    OfficeDotSoftEdgeFormat_typekey: SoftEdgeFormat,
    Radius: Double,
    Type: MsoSoftEdgeType
  ): SoftEdgeFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SoftEdgeFormat_typekey")(OfficeDotSoftEdgeFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftEdgeFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SoftEdgeFormat] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSoftEdgeFormat_typekey(value: SoftEdgeFormat): Self = StObject.set(x, "Office.SoftEdgeFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "Radius", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoSoftEdgeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
