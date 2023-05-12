package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterTextAreaControl extends StObject {
  
  /**
    * The delimiter that is used to separate the lines in text.
    */
  var Delimiter: js.UndefOr[TextAreaControlDelimiter] = js.undefined
  
  /**
    * The display options of a control.
    */
  var DisplayOptions: js.UndefOr[TextAreaControlDisplayOptions] = js.undefined
  
  /**
    * The ID of the FilterTextAreaControl.
    */
  var FilterControlId: ShortRestrictiveResourceId
  
  /**
    * The source filter ID of the FilterTextAreaControl.
    */
  var SourceFilterId: ShortRestrictiveResourceId
  
  /**
    * The title of the FilterTextAreaControl.
    */
  var Title: SheetControlTitle
}
object FilterTextAreaControl {
  
  inline def apply(
    FilterControlId: ShortRestrictiveResourceId,
    SourceFilterId: ShortRestrictiveResourceId,
    Title: SheetControlTitle
  ): FilterTextAreaControl = {
    val __obj = js.Dynamic.literal(FilterControlId = FilterControlId.asInstanceOf[js.Any], SourceFilterId = SourceFilterId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterTextAreaControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterTextAreaControl] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: TextAreaControlDelimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setDisplayOptions(value: TextAreaControlDisplayOptions): Self = StObject.set(x, "DisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "DisplayOptions", js.undefined)
    
    inline def setFilterControlId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterControlId", value.asInstanceOf[js.Any])
    
    inline def setSourceFilterId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "SourceFilterId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: SheetControlTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
