package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownControlDisplayOptions extends StObject {
  
  /**
    * The configuration of the Select all options in a dropdown control.
    */
  var SelectAllOptions: js.UndefOr[ListControlSelectAllOptions] = js.undefined
  
  /**
    * The options to configure the title visibility, name, and font size.
    */
  var TitleOptions: js.UndefOr[LabelOptions] = js.undefined
}
object DropDownControlDisplayOptions {
  
  inline def apply(): DropDownControlDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownControlDisplayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropDownControlDisplayOptions] (val x: Self) extends AnyVal {
    
    inline def setSelectAllOptions(value: ListControlSelectAllOptions): Self = StObject.set(x, "SelectAllOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectAllOptionsUndefined: Self = StObject.set(x, "SelectAllOptions", js.undefined)
    
    inline def setTitleOptions(value: LabelOptions): Self = StObject.set(x, "TitleOptions", value.asInstanceOf[js.Any])
    
    inline def setTitleOptionsUndefined: Self = StObject.set(x, "TitleOptions", js.undefined)
  }
}
