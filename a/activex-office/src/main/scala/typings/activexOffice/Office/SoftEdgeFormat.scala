package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftEdgeFormat extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.SoftEdgeFormat_typekey")
  var OfficeDotSoftEdgeFormat_typekey: SoftEdgeFormat = js.native
  
  var Radius: Double = js.native
  
  var Type: MsoSoftEdgeType = js.native
}
object SoftEdgeFormat {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SoftEdgeFormatMutableBuilder[Self <: SoftEdgeFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotSoftEdgeFormat_typekey(value: SoftEdgeFormat): Self = StObject.set(x, "Office.SoftEdgeFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "Radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoSoftEdgeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
