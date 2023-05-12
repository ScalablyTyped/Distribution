package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDateTimePickerControl extends StObject {
  
  /**
    * The display options of a control.
    */
  var DisplayOptions: js.UndefOr[DateTimePickerControlDisplayOptions] = js.undefined
  
  /**
    * The ID of the FilterDateTimePickerControl.
    */
  var FilterControlId: ShortRestrictiveResourceId
  
  /**
    * The source filter ID of the FilterDateTimePickerControl.
    */
  var SourceFilterId: ShortRestrictiveResourceId
  
  /**
    * The title of the FilterDateTimePickerControl.
    */
  var Title: SheetControlTitle
  
  /**
    * The date time picker type of a FilterDateTimePickerControl. Choose one of the following options:    SINGLE_VALUED: The filter condition is a fixed date.    DATE_RANGE: The filter condition is a date time range.  
    */
  var Type: js.UndefOr[SheetControlDateTimePickerType] = js.undefined
}
object FilterDateTimePickerControl {
  
  inline def apply(
    FilterControlId: ShortRestrictiveResourceId,
    SourceFilterId: ShortRestrictiveResourceId,
    Title: SheetControlTitle
  ): FilterDateTimePickerControl = {
    val __obj = js.Dynamic.literal(FilterControlId = FilterControlId.asInstanceOf[js.Any], SourceFilterId = SourceFilterId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDateTimePickerControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterDateTimePickerControl] (val x: Self) extends AnyVal {
    
    inline def setDisplayOptions(value: DateTimePickerControlDisplayOptions): Self = StObject.set(x, "DisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "DisplayOptions", js.undefined)
    
    inline def setFilterControlId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterControlId", value.asInstanceOf[js.Any])
    
    inline def setSourceFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "SourceFilterId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: SheetControlTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setType(value: SheetControlDateTimePickerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
