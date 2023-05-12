package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPathColor extends StObject {
  
  /**
    * The color that needs to be applied to the element.
    */
  var Color: HexColor
  
  /**
    * The element that the color needs to be applied to.
    */
  var Element: DataPathValue
  
  /**
    * The time granularity of the field that the color needs to be applied to.
    */
  var TimeGranularity: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TimeGranularity] = js.undefined
}
object DataPathColor {
  
  inline def apply(Color: HexColor, Element: DataPathValue): DataPathColor = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPathColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataPathColor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: HexColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setElement(value: DataPathValue): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
    
    inline def setTimeGranularity(value: TimeGranularity): Self = StObject.set(x, "TimeGranularity", value.asInstanceOf[js.Any])
    
    inline def setTimeGranularityUndefined: Self = StObject.set(x, "TimeGranularity", js.undefined)
  }
}
