package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterSliderControl extends StObject {
  
  /**
    * The display options of a control.
    */
  var DisplayOptions: js.UndefOr[SliderControlDisplayOptions] = js.undefined
  
  /**
    * The smaller value that is displayed at the left of the slider.
    */
  var MaximumValue: Double
  
  /**
    * The larger value that is displayed at the right of the slider.
    */
  var MinimumValue: Double
  
  /**
    * The ID of the ParameterSliderControl.
    */
  var ParameterControlId: ShortRestrictiveResourceId
  
  /**
    * The source parameter name of the ParameterSliderControl.
    */
  var SourceParameterName: ParameterName
  
  /**
    * The number of increments that the slider bar is divided into.
    */
  var StepSize: Double
  
  /**
    * The title of the ParameterSliderControl.
    */
  var Title: SheetControlTitle
}
object ParameterSliderControl {
  
  inline def apply(
    MaximumValue: Double,
    MinimumValue: Double,
    ParameterControlId: ShortRestrictiveResourceId,
    SourceParameterName: ParameterName,
    StepSize: Double,
    Title: SheetControlTitle
  ): ParameterSliderControl = {
    val __obj = js.Dynamic.literal(MaximumValue = MaximumValue.asInstanceOf[js.Any], MinimumValue = MinimumValue.asInstanceOf[js.Any], ParameterControlId = ParameterControlId.asInstanceOf[js.Any], SourceParameterName = SourceParameterName.asInstanceOf[js.Any], StepSize = StepSize.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterSliderControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterSliderControl] (val x: Self) extends AnyVal {
    
    inline def setDisplayOptions(value: SliderControlDisplayOptions): Self = StObject.set(x, "DisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "DisplayOptions", js.undefined)
    
    inline def setMaximumValue(value: Double): Self = StObject.set(x, "MaximumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "MinimumValue", value.asInstanceOf[js.Any])
    
    inline def setParameterControlId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ParameterControlId", value.asInstanceOf[js.Any])
    
    inline def setSourceParameterName(value: ParameterName): Self = StObject.set(x, "SourceParameterName", value.asInstanceOf[js.Any])
    
    inline def setStepSize(value: Double): Self = StObject.set(x, "StepSize", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: SheetControlTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
