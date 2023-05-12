package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterSliderControl extends StObject {
  
  /**
    * The display options of a control.
    */
  var DisplayOptions: js.UndefOr[SliderControlDisplayOptions] = js.undefined
  
  /**
    * The ID of the FilterSliderControl.
    */
  var FilterControlId: ShortRestrictiveResourceId
  
  /**
    * The smaller value that is displayed at the left of the slider.
    */
  var MaximumValue: Double
  
  /**
    * The larger value that is displayed at the right of the slider.
    */
  var MinimumValue: Double
  
  /**
    * The source filter ID of the FilterSliderControl.
    */
  var SourceFilterId: ShortRestrictiveResourceId
  
  /**
    * The number of increments that the slider bar is divided into.
    */
  var StepSize: Double
  
  /**
    * The title of the FilterSliderControl.
    */
  var Title: SheetControlTitle
  
  /**
    * The type of FilterSliderControl. Choose one of the following options:    SINGLE_POINT: Filter against(equals) a single data point.    RANGE: Filter data that is in a specified range.  
    */
  var Type: js.UndefOr[SheetControlSliderType] = js.undefined
}
object FilterSliderControl {
  
  inline def apply(
    FilterControlId: ShortRestrictiveResourceId,
    MaximumValue: Double,
    MinimumValue: Double,
    SourceFilterId: ShortRestrictiveResourceId,
    StepSize: Double,
    Title: SheetControlTitle
  ): FilterSliderControl = {
    val __obj = js.Dynamic.literal(FilterControlId = FilterControlId.asInstanceOf[js.Any], MaximumValue = MaximumValue.asInstanceOf[js.Any], MinimumValue = MinimumValue.asInstanceOf[js.Any], SourceFilterId = SourceFilterId.asInstanceOf[js.Any], StepSize = StepSize.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSliderControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterSliderControl] (val x: Self) extends AnyVal {
    
    inline def setDisplayOptions(value: SliderControlDisplayOptions): Self = StObject.set(x, "DisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "DisplayOptions", js.undefined)
    
    inline def setFilterControlId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterControlId", value.asInstanceOf[js.Any])
    
    inline def setMaximumValue(value: Double): Self = StObject.set(x, "MaximumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "MinimumValue", value.asInstanceOf[js.Any])
    
    inline def setSourceFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "SourceFilterId", value.asInstanceOf[js.Any])
    
    inline def setStepSize(value: Double): Self = StObject.set(x, "StepSize", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: SheetControlTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setType(value: SheetControlSliderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
