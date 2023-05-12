package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterTextAreaControl extends StObject {
  
  /**
    * The delimiter that is used to separate the lines in text.
    */
  var Delimiter: js.UndefOr[TextAreaControlDelimiter] = js.undefined
  
  /**
    * The display options of a control.
    */
  var DisplayOptions: js.UndefOr[TextAreaControlDisplayOptions] = js.undefined
  
  /**
    * The ID of the ParameterTextAreaControl.
    */
  var ParameterControlId: ShortRestrictiveResourceId
  
  /**
    * The source parameter name of the ParameterTextAreaControl.
    */
  var SourceParameterName: ParameterName
  
  /**
    * The title of the ParameterTextAreaControl.
    */
  var Title: SheetControlTitle
}
object ParameterTextAreaControl {
  
  inline def apply(
    ParameterControlId: ShortRestrictiveResourceId,
    SourceParameterName: ParameterName,
    Title: SheetControlTitle
  ): ParameterTextAreaControl = {
    val __obj = js.Dynamic.literal(ParameterControlId = ParameterControlId.asInstanceOf[js.Any], SourceParameterName = SourceParameterName.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterTextAreaControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterTextAreaControl] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: TextAreaControlDelimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setDisplayOptions(value: TextAreaControlDisplayOptions): Self = StObject.set(x, "DisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "DisplayOptions", js.undefined)
    
    inline def setParameterControlId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ParameterControlId", value.asInstanceOf[js.Any])
    
    inline def setSourceParameterName(value: ParameterName): Self = StObject.set(x, "SourceParameterName", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: SheetControlTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
