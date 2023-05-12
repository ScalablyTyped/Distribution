package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterDateTimePickerControl extends StObject {
  
  /**
    * The display options of a control.
    */
  var DisplayOptions: js.UndefOr[DateTimePickerControlDisplayOptions] = js.undefined
  
  /**
    * The ID of the ParameterDateTimePickerControl.
    */
  var ParameterControlId: ShortRestrictiveResourceId
  
  /**
    * The name of the ParameterDateTimePickerControl.
    */
  var SourceParameterName: ParameterName
  
  /**
    * The title of the ParameterDateTimePickerControl.
    */
  var Title: SheetControlTitle
}
object ParameterDateTimePickerControl {
  
  inline def apply(
    ParameterControlId: ShortRestrictiveResourceId,
    SourceParameterName: ParameterName,
    Title: SheetControlTitle
  ): ParameterDateTimePickerControl = {
    val __obj = js.Dynamic.literal(ParameterControlId = ParameterControlId.asInstanceOf[js.Any], SourceParameterName = SourceParameterName.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterDateTimePickerControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterDateTimePickerControl] (val x: Self) extends AnyVal {
    
    inline def setDisplayOptions(value: DateTimePickerControlDisplayOptions): Self = StObject.set(x, "DisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "DisplayOptions", js.undefined)
    
    inline def setParameterControlId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ParameterControlId", value.asInstanceOf[js.Any])
    
    inline def setSourceParameterName(value: ParameterName): Self = StObject.set(x, "SourceParameterName", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: SheetControlTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
