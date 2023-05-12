package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlDisplayOptions extends StObject {
  
  /**
    * The configuration of the search options in a list control.
    */
  var SearchOptions: js.UndefOr[ListControlSearchOptions] = js.undefined
  
  /**
    * The configuration of the Select all options in a list control.
    */
  var SelectAllOptions: js.UndefOr[ListControlSelectAllOptions] = js.undefined
  
  /**
    * The options to configure the title visibility, name, and font size.
    */
  var TitleOptions: js.UndefOr[LabelOptions] = js.undefined
}
object ListControlDisplayOptions {
  
  inline def apply(): ListControlDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListControlDisplayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListControlDisplayOptions] (val x: Self) extends AnyVal {
    
    inline def setSearchOptions(value: ListControlSearchOptions): Self = StObject.set(x, "SearchOptions", value.asInstanceOf[js.Any])
    
    inline def setSearchOptionsUndefined: Self = StObject.set(x, "SearchOptions", js.undefined)
    
    inline def setSelectAllOptions(value: ListControlSelectAllOptions): Self = StObject.set(x, "SelectAllOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectAllOptionsUndefined: Self = StObject.set(x, "SelectAllOptions", js.undefined)
    
    inline def setTitleOptions(value: LabelOptions): Self = StObject.set(x, "TitleOptions", value.asInstanceOf[js.Any])
    
    inline def setTitleOptionsUndefined: Self = StObject.set(x, "TitleOptions", js.undefined)
  }
}
