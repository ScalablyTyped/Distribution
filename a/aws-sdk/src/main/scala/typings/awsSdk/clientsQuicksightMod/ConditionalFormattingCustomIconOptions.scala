package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormattingCustomIconOptions extends StObject {
  
  /**
    * Determines the type of icon.
    */
  var Icon: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Icon] = js.undefined
  
  /**
    * Determines the Unicode icon type.
    */
  var UnicodeIcon: js.UndefOr[typings.awsSdk.clientsQuicksightMod.UnicodeIcon] = js.undefined
}
object ConditionalFormattingCustomIconOptions {
  
  inline def apply(): ConditionalFormattingCustomIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormattingCustomIconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormattingCustomIconOptions] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setUnicodeIcon(value: UnicodeIcon): Self = StObject.set(x, "UnicodeIcon", value.asInstanceOf[js.Any])
    
    inline def setUnicodeIconUndefined: Self = StObject.set(x, "UnicodeIcon", js.undefined)
  }
}
