package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormButton extends StObject {
  
  /**
    * Describes the button's properties.
    */
  var children: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the button is visible on the form.
    */
  var excluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The position of the button.
    */
  var position: js.UndefOr[FieldPosition] = js.undefined
}
object FormButton {
  
  inline def apply(): FormButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormButton]
  }
  
  extension [Self <: FormButton](x: Self) {
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setExcluded(value: Boolean): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
    
    inline def setExcludedUndefined: Self = StObject.set(x, "excluded", js.undefined)
    
    inline def setPosition(value: FieldPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
