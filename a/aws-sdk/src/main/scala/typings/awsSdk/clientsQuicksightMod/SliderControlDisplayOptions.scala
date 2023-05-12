package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderControlDisplayOptions extends StObject {
  
  /**
    * The options to configure the title visibility, name, and font size.
    */
  var TitleOptions: js.UndefOr[LabelOptions] = js.undefined
}
object SliderControlDisplayOptions {
  
  inline def apply(): SliderControlDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderControlDisplayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderControlDisplayOptions] (val x: Self) extends AnyVal {
    
    inline def setTitleOptions(value: LabelOptions): Self = StObject.set(x, "TitleOptions", value.asInstanceOf[js.Any])
    
    inline def setTitleOptionsUndefined: Self = StObject.set(x, "TitleOptions", js.undefined)
  }
}
