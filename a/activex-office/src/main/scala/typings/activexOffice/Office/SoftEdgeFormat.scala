package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftEdgeFormat extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  /* private */ @JSName("Office.SoftEdgeFormat_typekey")
  var OfficeDotSoftEdgeFormat_typekey: SoftEdgeFormat
  
  var Radius: Double
  
  var Type: MsoSoftEdgeType
}
object SoftEdgeFormat {
  
  inline def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotSoftEdgeFormat_typekey: SoftEdgeFormat,
    Radius: Double,
    Type: MsoSoftEdgeType
  ): SoftEdgeFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SoftEdgeFormat_typekey")(OfficeDotSoftEdgeFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftEdgeFormat]
  }
  
  extension [Self <: SoftEdgeFormat](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSoftEdgeFormat_typekey(value: SoftEdgeFormat): Self = StObject.set(x, "Office.SoftEdgeFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "Radius", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoSoftEdgeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
