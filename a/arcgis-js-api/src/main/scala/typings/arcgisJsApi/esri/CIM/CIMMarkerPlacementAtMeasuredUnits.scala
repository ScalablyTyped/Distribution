package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerPlacementAtMeasuredUnits
  extends CIMMarkerStrokePlacement
     with CIMMarkerPlacementType {
  
  /**
    * The interval of measured units used to place markers.
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether markers should be placed at extremities.
    */
  var placeAtExtremities: js.UndefOr[Boolean] = js.native
  
  /**
    * The rate of markers to skip.
    */
  var skipMarkerRate: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMMarkerPlacementAtMeasuredUnits: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtMeasuredUnits = js.native
}
object CIMMarkerPlacementAtMeasuredUnits {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtMeasuredUnits): CIMMarkerPlacementAtMeasuredUnits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerPlacementAtMeasuredUnits]
  }
  
  @scala.inline
  implicit class CIMMarkerPlacementAtMeasuredUnitsMutableBuilder[Self <: CIMMarkerPlacementAtMeasuredUnits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setPlaceAtExtremities(value: Boolean): Self = StObject.set(x, "placeAtExtremities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceAtExtremitiesUndefined: Self = StObject.set(x, "placeAtExtremities", js.undefined)
    
    @scala.inline
    def setSkipMarkerRate(value: Double): Self = StObject.set(x, "skipMarkerRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipMarkerRateUndefined: Self = StObject.set(x, "skipMarkerRate", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerPlacementAtMeasuredUnits): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
