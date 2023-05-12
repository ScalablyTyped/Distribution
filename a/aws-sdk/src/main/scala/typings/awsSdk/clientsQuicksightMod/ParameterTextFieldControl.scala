package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterTextFieldControl extends StObject {
  
  /**
    * The display options of a control.
    */
  var DisplayOptions: js.UndefOr[TextFieldControlDisplayOptions] = js.undefined
  
  /**
    * The ID of the ParameterTextFieldControl.
    */
  var ParameterControlId: ShortRestrictiveResourceId
  
  /**
    * The source parameter name of the ParameterTextFieldControl.
    */
  var SourceParameterName: ParameterName
  
  /**
    * The title of the ParameterTextFieldControl.
    */
  var Title: SheetControlTitle
}
object ParameterTextFieldControl {
  
  inline def apply(
    ParameterControlId: ShortRestrictiveResourceId,
    SourceParameterName: ParameterName,
    Title: SheetControlTitle
  ): ParameterTextFieldControl = {
    val __obj = js.Dynamic.literal(ParameterControlId = ParameterControlId.asInstanceOf[js.Any], SourceParameterName = SourceParameterName.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterTextFieldControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterTextFieldControl] (val x: Self) extends AnyVal {
    
    inline def setDisplayOptions(value: TextFieldControlDisplayOptions): Self = StObject.set(x, "DisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "DisplayOptions", js.undefined)
    
    inline def setParameterControlId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ParameterControlId", value.asInstanceOf[js.Any])
    
    inline def setSourceParameterName(value: ParameterName): Self = StObject.set(x, "SourceParameterName", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: SheetControlTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
