package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LowEmphasis extends StObject {
  
  var highEmphasis: PaintToken[BaseToken]
  
  var link: RestingPaintToken
  
  var lowEmphasis: PaintToken[BaseToken]
  
  var mediumEmphasis: PaintToken[BaseToken]
  
  var onBold: PaintToken[BaseToken]
  
  var onBoldWarning: PaintToken[BaseToken]
}
object LowEmphasis {
  
  inline def apply(
    highEmphasis: PaintToken[BaseToken],
    link: RestingPaintToken,
    lowEmphasis: PaintToken[BaseToken],
    mediumEmphasis: PaintToken[BaseToken],
    onBold: PaintToken[BaseToken],
    onBoldWarning: PaintToken[BaseToken]
  ): LowEmphasis = {
    val __obj = js.Dynamic.literal(highEmphasis = highEmphasis.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], lowEmphasis = lowEmphasis.asInstanceOf[js.Any], mediumEmphasis = mediumEmphasis.asInstanceOf[js.Any], onBold = onBold.asInstanceOf[js.Any], onBoldWarning = onBoldWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowEmphasis]
  }
  
  extension [Self <: LowEmphasis](x: Self) {
    
    inline def setHighEmphasis(value: PaintToken[BaseToken]): Self = StObject.set(x, "highEmphasis", value.asInstanceOf[js.Any])
    
    inline def setLink(value: RestingPaintToken): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLowEmphasis(value: PaintToken[BaseToken]): Self = StObject.set(x, "lowEmphasis", value.asInstanceOf[js.Any])
    
    inline def setMediumEmphasis(value: PaintToken[BaseToken]): Self = StObject.set(x, "mediumEmphasis", value.asInstanceOf[js.Any])
    
    inline def setOnBold(value: PaintToken[BaseToken]): Self = StObject.set(x, "onBold", value.asInstanceOf[js.Any])
    
    inline def setOnBoldWarning(value: PaintToken[BaseToken]): Self = StObject.set(x, "onBoldWarning", value.asInstanceOf[js.Any])
  }
}
