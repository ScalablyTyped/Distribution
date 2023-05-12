package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeight100 extends StObject {
  
  @JSName("lineHeight.100")
  var lineHeightDot100: SerializedStyles
  
  @JSName("lineHeight.200")
  var lineHeightDot200: SerializedStyles
  
  @JSName("lineHeight.300")
  var lineHeightDot300: SerializedStyles
  
  @JSName("lineHeight.400")
  var lineHeightDot400: SerializedStyles
  
  @JSName("lineHeight.500")
  var lineHeightDot500: SerializedStyles
  
  @JSName("lineHeight.600")
  var lineHeightDot600: SerializedStyles
}
object LineHeight100 {
  
  inline def apply(
    lineHeightDot100: SerializedStyles,
    lineHeightDot200: SerializedStyles,
    lineHeightDot300: SerializedStyles,
    lineHeightDot400: SerializedStyles,
    lineHeightDot500: SerializedStyles,
    lineHeightDot600: SerializedStyles
  ): LineHeight100 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lineHeight.100")(lineHeightDot100.asInstanceOf[js.Any])
    __obj.updateDynamic("lineHeight.200")(lineHeightDot200.asInstanceOf[js.Any])
    __obj.updateDynamic("lineHeight.300")(lineHeightDot300.asInstanceOf[js.Any])
    __obj.updateDynamic("lineHeight.400")(lineHeightDot400.asInstanceOf[js.Any])
    __obj.updateDynamic("lineHeight.500")(lineHeightDot500.asInstanceOf[js.Any])
    __obj.updateDynamic("lineHeight.600")(lineHeightDot600.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight100]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineHeight100] (val x: Self) extends AnyVal {
    
    inline def setLineHeightDot100(value: SerializedStyles): Self = StObject.set(x, "lineHeight.100", value.asInstanceOf[js.Any])
    
    inline def setLineHeightDot200(value: SerializedStyles): Self = StObject.set(x, "lineHeight.200", value.asInstanceOf[js.Any])
    
    inline def setLineHeightDot300(value: SerializedStyles): Self = StObject.set(x, "lineHeight.300", value.asInstanceOf[js.Any])
    
    inline def setLineHeightDot400(value: SerializedStyles): Self = StObject.set(x, "lineHeight.400", value.asInstanceOf[js.Any])
    
    inline def setLineHeightDot500(value: SerializedStyles): Self = StObject.set(x, "lineHeight.500", value.asInstanceOf[js.Any])
    
    inline def setLineHeightDot600(value: SerializedStyles): Self = StObject.set(x, "lineHeight.600", value.asInstanceOf[js.Any])
  }
}
