package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterDropDownControl extends StObject {
  
  /**
    * The values that are displayed in a control can be configured to only show values that are valid based on what's selected in other controls.
    */
  var CascadingControlConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CascadingControlConfiguration] = js.undefined
  
  /**
    * The display options of a control.
    */
  var DisplayOptions: js.UndefOr[DropDownControlDisplayOptions] = js.undefined
  
  /**
    * The ID of the ParameterDropDownControl.
    */
  var ParameterControlId: ShortRestrictiveResourceId
  
  /**
    * A list of selectable values that are used in a control.
    */
  var SelectableValues: js.UndefOr[ParameterSelectableValues] = js.undefined
  
  /**
    * The source parameter name of the ParameterDropDownControl.
    */
  var SourceParameterName: ParameterName
  
  /**
    * The title of the ParameterDropDownControl.
    */
  var Title: SheetControlTitle
  
  /**
    * The type parameter name of the ParameterDropDownControl.
    */
  var Type: js.UndefOr[SheetControlListType] = js.undefined
}
object ParameterDropDownControl {
  
  inline def apply(
    ParameterControlId: ShortRestrictiveResourceId,
    SourceParameterName: ParameterName,
    Title: SheetControlTitle
  ): ParameterDropDownControl = {
    val __obj = js.Dynamic.literal(ParameterControlId = ParameterControlId.asInstanceOf[js.Any], SourceParameterName = SourceParameterName.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterDropDownControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterDropDownControl] (val x: Self) extends AnyVal {
    
    inline def setCascadingControlConfiguration(value: CascadingControlConfiguration): Self = StObject.set(x, "CascadingControlConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCascadingControlConfigurationUndefined: Self = StObject.set(x, "CascadingControlConfiguration", js.undefined)
    
    inline def setDisplayOptions(value: DropDownControlDisplayOptions): Self = StObject.set(x, "DisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "DisplayOptions", js.undefined)
    
    inline def setParameterControlId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ParameterControlId", value.asInstanceOf[js.Any])
    
    inline def setSelectableValues(value: ParameterSelectableValues): Self = StObject.set(x, "SelectableValues", value.asInstanceOf[js.Any])
    
    inline def setSelectableValuesUndefined: Self = StObject.set(x, "SelectableValues", js.undefined)
    
    inline def setSourceParameterName(value: ParameterName): Self = StObject.set(x, "SourceParameterName", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: SheetControlTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setType(value: SheetControlListType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
