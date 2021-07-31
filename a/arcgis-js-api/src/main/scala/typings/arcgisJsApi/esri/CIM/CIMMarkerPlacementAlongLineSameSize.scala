package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerPlacementAlongLineSameSize
  extends StObject
     with CIMMarkerPlacementAlongLine
     with CIMMarkerPlacementType {
  
  @JSName("type")
  var type_CIMMarkerPlacementAlongLineSameSize: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineSameSize
}
object CIMMarkerPlacementAlongLineSameSize {
  
  @scala.inline
  def apply(): CIMMarkerPlacementAlongLineSameSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerPlacementAlongLineSameSize")
    __obj.asInstanceOf[CIMMarkerPlacementAlongLineSameSize]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementAlongLineSameSizeMutableBuilder[Self <: CIMMarkerPlacementAlongLineSameSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAlongLineSameSize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
