package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeFormLayoutElementBackgroundStyle extends StObject {
  
  /**
    * The background color of a free-form layout element.
    */
  var Color: js.UndefOr[HexColorWithTransparency] = js.undefined
  
  /**
    * The background visibility of a free-form layout element.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object FreeFormLayoutElementBackgroundStyle {
  
  inline def apply(): FreeFormLayoutElementBackgroundStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeFormLayoutElementBackgroundStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreeFormLayoutElementBackgroundStyle] (val x: Self) extends AnyVal {
    
    inline def setColor(value: HexColorWithTransparency): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
