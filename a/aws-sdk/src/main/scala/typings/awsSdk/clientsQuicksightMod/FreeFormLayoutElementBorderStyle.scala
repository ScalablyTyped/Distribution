package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeFormLayoutElementBorderStyle extends StObject {
  
  /**
    * The border color of a free-form layout element.
    */
  var Color: js.UndefOr[HexColorWithTransparency] = js.undefined
  
  /**
    * The border visibility of a free-form layout element.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object FreeFormLayoutElementBorderStyle {
  
  inline def apply(): FreeFormLayoutElementBorderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeFormLayoutElementBorderStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeFormLayoutElementBorderStyle] (val x: Self) extends AnyVal {
    
    inline def setColor(value: HexColorWithTransparency): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
