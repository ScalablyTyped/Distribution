package typings.atlaskitTokens.anon

import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediumEmphasis[BaseToken] extends StObject {
  
  var highEmphasis: PaintToken[BaseToken]
  
  var link: `9`[BaseToken]
  
  var lowEmphasis: PaintToken[BaseToken]
  
  var mediumEmphasis: PaintToken[BaseToken]
  
  var onBold: PaintToken[BaseToken]
  
  var onBoldWarning: PaintToken[BaseToken]
}
object MediumEmphasis {
  
  inline def apply[BaseToken](
    highEmphasis: PaintToken[BaseToken],
    link: `9`[BaseToken],
    lowEmphasis: PaintToken[BaseToken],
    mediumEmphasis: PaintToken[BaseToken],
    onBold: PaintToken[BaseToken],
    onBoldWarning: PaintToken[BaseToken]
  ): MediumEmphasis[BaseToken] = {
    val __obj = js.Dynamic.literal(highEmphasis = highEmphasis.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], lowEmphasis = lowEmphasis.asInstanceOf[js.Any], mediumEmphasis = mediumEmphasis.asInstanceOf[js.Any], onBold = onBold.asInstanceOf[js.Any], onBoldWarning = onBoldWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediumEmphasis[BaseToken]]
  }
  
  extension [Self <: MediumEmphasis[?], BaseToken](x: Self & MediumEmphasis[BaseToken]) {
    
    inline def setHighEmphasis(value: PaintToken[BaseToken]): Self = StObject.set(x, "highEmphasis", value.asInstanceOf[js.Any])
    
    inline def setLink(value: `9`[BaseToken]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLowEmphasis(value: PaintToken[BaseToken]): Self = StObject.set(x, "lowEmphasis", value.asInstanceOf[js.Any])
    
    inline def setMediumEmphasis(value: PaintToken[BaseToken]): Self = StObject.set(x, "mediumEmphasis", value.asInstanceOf[js.Any])
    
    inline def setOnBold(value: PaintToken[BaseToken]): Self = StObject.set(x, "onBold", value.asInstanceOf[js.Any])
    
    inline def setOnBoldWarning(value: PaintToken[BaseToken]): Self = StObject.set(x, "onBoldWarning", value.asInstanceOf[js.Any])
  }
}
