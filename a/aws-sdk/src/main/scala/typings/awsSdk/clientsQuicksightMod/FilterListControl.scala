package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterListControl extends StObject {
  
  /**
    * The values that are displayed in a control can be configured to only show values that are valid based on what's selected in other controls.
    */
  var CascadingControlConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CascadingControlConfiguration] = js.undefined
  
  /**
    * The display options of a control.
    */
  var DisplayOptions: js.UndefOr[ListControlDisplayOptions] = js.undefined
  
  /**
    * The ID of the FilterListControl.
    */
  var FilterControlId: ShortRestrictiveResourceId
  
  /**
    * A list of selectable values that are used in a control.
    */
  var SelectableValues: js.UndefOr[FilterSelectableValues] = js.undefined
  
  /**
    * The source filter ID of the FilterListControl.
    */
  var SourceFilterId: ShortRestrictiveResourceId
  
  /**
    * The title of the FilterListControl.
    */
  var Title: SheetControlTitle
  
  /**
    * The type of FilterListControl. Choose one of the following options:    MULTI_SELECT: The user can select multiple entries from the list.    SINGLE_SELECT: The user can select a single entry from the list.  
    */
  var Type: js.UndefOr[SheetControlListType] = js.undefined
}
object FilterListControl {
  
  inline def apply(
    FilterControlId: ShortRestrictiveResourceId,
    SourceFilterId: ShortRestrictiveResourceId,
    Title: SheetControlTitle
  ): FilterListControl = {
    val __obj = js.Dynamic.literal(FilterControlId = FilterControlId.asInstanceOf[js.Any], SourceFilterId = SourceFilterId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterListControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterListControl] (val x: Self) extends AnyVal {
    
    inline def setCascadingControlConfiguration(value: CascadingControlConfiguration): Self = StObject.set(x, "CascadingControlConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCascadingControlConfigurationUndefined: Self = StObject.set(x, "CascadingControlConfiguration", js.undefined)
    
    inline def setDisplayOptions(value: ListControlDisplayOptions): Self = StObject.set(x, "DisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "DisplayOptions", js.undefined)
    
    inline def setFilterControlId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterControlId", value.asInstanceOf[js.Any])
    
    inline def setSelectableValues(value: FilterSelectableValues): Self = StObject.set(x, "SelectableValues", value.asInstanceOf[js.Any])
    
    inline def setSelectableValuesUndefined: Self = StObject.set(x, "SelectableValues", js.undefined)
    
    inline def setSourceFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "SourceFilterId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: SheetControlTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setType(value: SheetControlListType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
