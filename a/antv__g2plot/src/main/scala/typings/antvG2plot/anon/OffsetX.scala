package typings.antvG2plot.anon

import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesCommonMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetX extends StObject {
  
  val formatter: js.UndefOr[
    String | (js.Function2[
      /* datum */ js.UndefOr[Datum], 
      /* data */ js.UndefOr[typings.antvG2plot.libTypesCommonMod.Data], 
      String
    ])
  ] = js.undefined
  
  val offsetX: js.UndefOr[Double] = js.undefined
  
  val offsetY: js.UndefOr[Double] = js.undefined
  
  val style: js.UndefOr[TextStyle] = js.undefined
}
object OffsetX {
  
  inline def apply(): OffsetX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetX] (val x: Self) extends AnyVal {
    
    inline def setFormatter(
      value: String | (js.Function2[
          /* datum */ js.UndefOr[Datum], 
          /* data */ js.UndefOr[typings.antvG2plot.libTypesCommonMod.Data], 
          String
        ])
    ): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterFunction2(
      value: (/* datum */ js.UndefOr[Datum], /* data */ js.UndefOr[typings.antvG2plot.libTypesCommonMod.Data]) => String
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setStyle(value: TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
