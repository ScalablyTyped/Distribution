package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormCTA extends StObject {
  
  /**
    * Displays a cancel button.
    */
  var cancel: js.UndefOr[FormButton] = js.undefined
  
  /**
    * Displays a clear button.
    */
  var clear: js.UndefOr[FormButton] = js.undefined
  
  /**
    * The position of the button.
    */
  var position: js.UndefOr[FormButtonsPosition] = js.undefined
  
  /**
    * Displays a submit button.
    */
  var submit: js.UndefOr[FormButton] = js.undefined
}
object FormCTA {
  
  inline def apply(): FormCTA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormCTA]
  }
  
  extension [Self <: FormCTA](x: Self) {
    
    inline def setCancel(value: FormButton): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setClear(value: FormButton): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setPosition(value: FormButtonsPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSubmit(value: FormButton): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
  }
}
