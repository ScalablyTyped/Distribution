package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormattingIconDisplayConfiguration extends StObject {
  
  /**
    * Determines the icon display configuration.
    */
  var IconDisplayOption: js.UndefOr[ConditionalFormattingIconDisplayOption] = js.undefined
}
object ConditionalFormattingIconDisplayConfiguration {
  
  inline def apply(): ConditionalFormattingIconDisplayConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormattingIconDisplayConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormattingIconDisplayConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIconDisplayOption(value: ConditionalFormattingIconDisplayOption): Self = StObject.set(x, "IconDisplayOption", value.asInstanceOf[js.Any])
    
    inline def setIconDisplayOptionUndefined: Self = StObject.set(x, "IconDisplayOption", js.undefined)
  }
}
