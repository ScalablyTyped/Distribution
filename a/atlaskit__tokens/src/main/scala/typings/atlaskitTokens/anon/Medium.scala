package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesTypographyPaletteMod.FontWeightBaseToken
import typings.atlaskitTokens.distTypesTypesMod.TypographyToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medium extends StObject {
  
  var bold: TypographyToken[FontWeightBaseToken]
  
  var medium: TypographyToken[FontWeightBaseToken]
  
  var regular: TypographyToken[FontWeightBaseToken]
  
  var semibold: TypographyToken[FontWeightBaseToken]
}
object Medium {
  
  inline def apply(
    bold: TypographyToken[FontWeightBaseToken],
    medium: TypographyToken[FontWeightBaseToken],
    regular: TypographyToken[FontWeightBaseToken],
    semibold: TypographyToken[FontWeightBaseToken]
  ): Medium = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], semibold = semibold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Medium]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Medium] (val x: Self) extends AnyVal {
    
    inline def setBold(value: TypographyToken[FontWeightBaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: TypographyToken[FontWeightBaseToken]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setRegular(value: TypographyToken[FontWeightBaseToken]): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    inline def setSemibold(value: TypographyToken[FontWeightBaseToken]): Self = StObject.set(x, "semibold", value.asInstanceOf[js.Any])
  }
}
