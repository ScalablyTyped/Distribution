package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionStyle extends StObject {
  
  /**
    * The height of a section. Heights can only be defined for header and footer sections. The default height margin is 0.5 inches. 
    */
  var Height: js.UndefOr[PixelLength] = js.undefined
  
  /**
    * The spacing between section content and its top, bottom, left, and right edges. There is no padding by default.
    */
  var Padding: js.UndefOr[Spacing] = js.undefined
}
object SectionStyle {
  
  inline def apply(): SectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionStyle] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: PixelLength): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setPadding(value: Spacing): Self = StObject.set(x, "Padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "Padding", js.undefined)
  }
}
