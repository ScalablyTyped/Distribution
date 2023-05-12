package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorScale extends StObject {
  
  /**
    * Determines the color fill type.
    */
  var ColorFillType: typings.awsSdk.clientsQuicksightMod.ColorFillType
  
  /**
    * Determines the list of colors that are applied to the visual.
    */
  var Colors: ColorScaleColorList
  
  /**
    * Determines the color that is applied to null values.
    */
  var NullValueColor: js.UndefOr[DataColor] = js.undefined
}
object ColorScale {
  
  inline def apply(ColorFillType: ColorFillType, Colors: ColorScaleColorList): ColorScale = {
    val __obj = js.Dynamic.literal(ColorFillType = ColorFillType.asInstanceOf[js.Any], Colors = Colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorScale] (val x: Self) extends AnyVal {
    
    inline def setColorFillType(value: ColorFillType): Self = StObject.set(x, "ColorFillType", value.asInstanceOf[js.Any])
    
    inline def setColors(value: ColorScaleColorList): Self = StObject.set(x, "Colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: DataColor*): Self = StObject.set(x, "Colors", js.Array(value*))
    
    inline def setNullValueColor(value: DataColor): Self = StObject.set(x, "NullValueColor", value.asInstanceOf[js.Any])
    
    inline def setNullValueColorUndefined: Self = StObject.set(x, "NullValueColor", js.undefined)
  }
}
