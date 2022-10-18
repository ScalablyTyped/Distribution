package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormStyle extends StObject {
  
  /**
    * The spacing for the horizontal gap.
    */
  var horizontalGap: js.UndefOr[FormStyleConfig] = js.undefined
  
  /**
    * The size of the outer padding for the form.
    */
  var outerPadding: js.UndefOr[FormStyleConfig] = js.undefined
  
  /**
    * The spacing for the vertical gap.
    */
  var verticalGap: js.UndefOr[FormStyleConfig] = js.undefined
}
object FormStyle {
  
  inline def apply(): FormStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormStyle]
  }
  
  extension [Self <: FormStyle](x: Self) {
    
    inline def setHorizontalGap(value: FormStyleConfig): Self = StObject.set(x, "horizontalGap", value.asInstanceOf[js.Any])
    
    inline def setHorizontalGapUndefined: Self = StObject.set(x, "horizontalGap", js.undefined)
    
    inline def setOuterPadding(value: FormStyleConfig): Self = StObject.set(x, "outerPadding", value.asInstanceOf[js.Any])
    
    inline def setOuterPaddingUndefined: Self = StObject.set(x, "outerPadding", js.undefined)
    
    inline def setVerticalGap(value: FormStyleConfig): Self = StObject.set(x, "verticalGap", value.asInstanceOf[js.Any])
    
    inline def setVerticalGapUndefined: Self = StObject.set(x, "verticalGap", js.undefined)
  }
}
