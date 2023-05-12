package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormattingIcon extends StObject {
  
  /**
    * Determines the custom condition for an icon set.
    */
  var CustomCondition: js.UndefOr[ConditionalFormattingCustomIconCondition] = js.undefined
  
  /**
    * Formatting configuration for icon set.
    */
  var IconSet: js.UndefOr[ConditionalFormattingIconSet] = js.undefined
}
object ConditionalFormattingIcon {
  
  inline def apply(): ConditionalFormattingIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormattingIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormattingIcon] (val x: Self) extends AnyVal {
    
    inline def setCustomCondition(value: ConditionalFormattingCustomIconCondition): Self = StObject.set(x, "CustomCondition", value.asInstanceOf[js.Any])
    
    inline def setCustomConditionUndefined: Self = StObject.set(x, "CustomCondition", js.undefined)
    
    inline def setIconSet(value: ConditionalFormattingIconSet): Self = StObject.set(x, "IconSet", value.asInstanceOf[js.Any])
    
    inline def setIconSetUndefined: Self = StObject.set(x, "IconSet", js.undefined)
  }
}
