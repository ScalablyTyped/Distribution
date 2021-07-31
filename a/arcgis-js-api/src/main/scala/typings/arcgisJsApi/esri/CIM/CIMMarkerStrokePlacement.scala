package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerStrokePlacement
  extends StObject
     with CIMMarkerPlacementBase {
  
  /**
    * A value indicating whether to angle the marker to the line.
    */
  var angleToLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The offset.
    */
  var offset: js.UndefOr[Double] = js.undefined
}
object CIMMarkerStrokePlacement {
  
  @scala.inline
  def apply(`type`: String): CIMMarkerStrokePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerStrokePlacement]
  }
  
  @scala.inline
  implicit class CIMMarkerStrokePlacementMutableBuilder[Self <: CIMMarkerStrokePlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngleToLine(value: Boolean): Self = StObject.set(x, "angleToLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleToLineUndefined: Self = StObject.set(x, "angleToLine", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
