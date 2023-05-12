package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableBorderOptions extends StObject {
  
  /**
    * The color of a table border.
    */
  var Color: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The style (none, solid) of a table border.
    */
  var Style: js.UndefOr[TableBorderStyle] = js.undefined
  
  /**
    * The thickness of a table border.
    */
  var Thickness: js.UndefOr[TableBorderThickness] = js.undefined
}
object TableBorderOptions {
  
  inline def apply(): TableBorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableBorderOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: HexColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setStyle(value: TableBorderStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "Style", js.undefined)
    
    inline def setThickness(value: TableBorderThickness): Self = StObject.set(x, "Thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "Thickness", js.undefined)
  }
}
